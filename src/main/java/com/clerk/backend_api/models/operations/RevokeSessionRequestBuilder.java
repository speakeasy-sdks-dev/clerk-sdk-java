/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.lang.String;

public class RevokeSessionRequestBuilder {

    private String sessionId;
    private final SDKMethodInterfaces.MethodCallRevokeSession sdk;

    public RevokeSessionRequestBuilder(SDKMethodInterfaces.MethodCallRevokeSession sdk) {
        this.sdk = sdk;
    }

    public RevokeSessionRequestBuilder sessionId(String sessionId) {
        Utils.checkNotNull(sessionId, "sessionId");
        this.sessionId = sessionId;
        return this;
    }

    public RevokeSessionResponse call() throws Exception {

        return sdk.revoke(
            sessionId);
    }
}
