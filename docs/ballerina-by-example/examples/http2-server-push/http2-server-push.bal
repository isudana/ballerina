import ballerina.net.http;
import ballerina.io;

@http:configuration {
    basePath:"/http2Service",
    port:7090,
    // Maximum support HTTP version is set to 2.0
    httpVersion:"2.0"
}
service<http> http2Service {
    @http:resourceConfig {
        path:"/main"
    }
    resource http2Resource (http:Connection conn, http:InRequest req) {
        
        io:println("Request received");

        // Send a Push Promise
        http:PushPromise promise1 = {path:"/resource1", method:"POST"};
        _ = conn.promise(promise1);

        // Send another Push Promise
        http:PushPromise promise2 = {path:"/resource2", method:"POST"};
        _ = conn.promise(promise2);

        // Send one more Push Promise
        http:PushPromise promise3 = {path:"/resource3", method:"POST"};
        _ = conn.promise(promise3);
            
        // Construct requested resource
        http:OutResponse response = {};
        json msg = {"response":{"name":"main resource"}};
        response.setJsonPayload(msg);

        // Send the requested resource
        _ = conn.respond(response);

        // Construct promised resource1
        http:OutResponse push1 = {};
        msg = {"push":{"name":"resource1"}};
        push1.setJsonPayload(msg);

        // Push promised resource1
        _ = conn.pushPromisedResponse(promise1, push1);

        http:OutResponse push2 = {};
        msg = {"push":{"name":"resource2"}};
        push2.setJsonPayload(msg);

        // Push promised resource2
        _ = conn.pushPromisedResponse(promise2, push2);            

        http:OutResponse push3 = {};
        msg = {"push":{"name":"resource3"}};
        push3.setJsonPayload(msg);

        // Push promised resource3
        _ = conn.pushPromisedResponse(promise3, push3);
    }
}

function main (string[] args) {

    endpoint<http:HttpClient> ep {
        // HTTP version is set to 2.0
        create http:HttpClient("http://localhost:7090", {httpVersion:"2.0"});
    }

    http:OutRequest serviceReq = {};
    http:HttpHandle h = {};
    // Submit a request
    h, _ = ep.submit("GET","/http2Service/main", serviceReq);

    http:PushPromise[] promises = [];
    int i = 0;
    // Check whether promises exists
    while (ep.hasPromise(h)) {
        http:PushPromise promise = {};
        // Get the next promise
        promise, _ = ep.getNextPromise(h);
        io:println("Received a promise for " + promise.path);

        if (promise.path == "/resource2") {
            // Client is not interested of getting '/resource2'. So reject the promise
            _ = ep.rejectPromise(promise);
            io:println("Push promise for resource2 rejected");
        } else {
            // Store required promises
             promises[i] = promise;
             i = i + 1;
        } 
    }   

    http:InResponse res = {};
    // Get the requested resource
    res, _ = ep.getResponse(h);
    json responsePayload;
    responsePayload, _ = res.getJsonPayload();
    io:println("Response : " + responsePayload.toString());

    // Fetch required promised responses
    foreach promise in promises {
       http:InResponse promisedResponse = {};
       promisedResponse, _ = ep.getPromisedResponse(promise);
       json payload;
       payload, _ = promisedResponse.getJsonPayload(); 
       io:println("Promised resource : " + payload.toString());
    }
}