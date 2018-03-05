/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.ballerinalang.net.http.nativeimpl.connection;

import org.ballerinalang.bre.Context;
import org.ballerinalang.mime.util.EntityBodyHandler;
import org.ballerinalang.mime.util.MimeUtil;
import org.ballerinalang.model.types.TypeKind;
import org.ballerinalang.model.values.BStruct;
import org.ballerinalang.model.values.BValue;
import org.ballerinalang.natives.annotations.Argument;
import org.ballerinalang.natives.annotations.BallerinaFunction;
import org.ballerinalang.natives.annotations.Receiver;
import org.ballerinalang.natives.annotations.ReturnType;
import org.ballerinalang.net.http.HttpUtil;
import org.ballerinalang.runtime.message.MessageDataSource;
import org.wso2.transport.http.netty.contract.HttpResponseFuture;
import org.wso2.transport.http.netty.message.HTTPCarbonMessage;
import org.wso2.transport.http.netty.message.Http2PushPromise;

/**
 * Native function to respond back the caller with outbound response.
 *
 * @since 0.964
 */
@BallerinaFunction(
        packageName = "ballerina.net.http",
        functionName = "pushResponse",
        receiver = @Receiver(type = TypeKind.STRUCT, structType = "Connection",
                             structPackage = "ballerina.net.http"),
        args = {@Argument(name = "res", type = TypeKind.STRUCT, structType = "OutResponse",
                structPackage = "ballerina.net.http"),
                @Argument(name = "promise", type = TypeKind.STRUCT, structType = "PushPromise",
                        structPackage = "ballerina.net.http")
        },
        returnType = @ReturnType(type = TypeKind.STRUCT, structType = "HttpConnectorError",
                                 structPackage = "ballerina.net.http"),
        isPublic = true
)
public class PushResponse extends ConnectionAction {

    @Override
    public BValue[] execute(Context context) {
        BStruct connectionStruct = (BStruct) getRefArgument(context, 0);
        HTTPCarbonMessage inboundRequestMsg = HttpUtil.getCarbonMsg(connectionStruct, null);
        HttpUtil.checkFunctionValidity(connectionStruct, inboundRequestMsg);

        BStruct outboundResponseStruct = (BStruct) getRefArgument(context, 1);
        BStruct pushPromiseStruct = (BStruct) getRefArgument(context, 2);
        HTTPCarbonMessage outboundResponseMsg = HttpUtil
                .getCarbonMsg(outboundResponseStruct, HttpUtil.createHttpCarbonMessage(false));
        Http2PushPromise http2PushPromise = HttpUtil.getPushPromise(pushPromiseStruct,
                                                                    HttpUtil.createHttpPushPromise());
        HttpUtil.prepareOutboundResponse(context, inboundRequestMsg, outboundResponseMsg, outboundResponseStruct);
        BValue[] outboundResponseStatus = pushResponseRobust(context, inboundRequestMsg,
                                                             outboundResponseStruct, outboundResponseMsg,
                                                             http2PushPromise);
        return outboundResponseStatus;
    }

    private BValue[] pushResponseRobust(Context context, HTTPCarbonMessage requestMessage,
                                        BStruct outboundResponseStruct, HTTPCarbonMessage responseMessage,
                                        Http2PushPromise http2PushPromise) {
        BStruct entityStruct = MimeUtil.extractEntity(outboundResponseStruct);
        HttpResponseFuture outboundRespStatusFuture =
                HttpUtil.pushResponse(requestMessage, responseMessage, http2PushPromise);
        if (entityStruct != null) {
            MessageDataSource outboundMessageSource = EntityBodyHandler.getMessageDataSource(entityStruct);
            serializeMsgDataSource(responseMessage, outboundMessageSource, outboundRespStatusFuture, entityStruct);
        }
        return handleResponseStatus(context, outboundRespStatusFuture);
    }
}
