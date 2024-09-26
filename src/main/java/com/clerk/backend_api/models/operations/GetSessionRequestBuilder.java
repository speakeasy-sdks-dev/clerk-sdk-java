/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.lang.String;

public class GetSessionRequestBuilder {

    private String sessionId;
    private final SDKMethodInterfaces.MethodCallGetSession sdk;

    public GetSessionRequestBuilder(SDKMethodInterfaces.MethodCallGetSession sdk) {
        this.sdk = sdk;
    }

    public GetSessionRequestBuilder sessionId(String sessionId) {
        Utils.checkNotNull(sessionId, "sessionId");
        this.sessionId = sessionId;
        return this;
    }

    public GetSessionResponse call() throws Exception {

        return sdk.get(
            sessionId);
    }
}
