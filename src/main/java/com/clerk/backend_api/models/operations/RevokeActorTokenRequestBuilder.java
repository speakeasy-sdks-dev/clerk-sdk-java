/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.lang.String;

public class RevokeActorTokenRequestBuilder {

    private String actorTokenId;
    private final SDKMethodInterfaces.MethodCallRevokeActorToken sdk;

    public RevokeActorTokenRequestBuilder(SDKMethodInterfaces.MethodCallRevokeActorToken sdk) {
        this.sdk = sdk;
    }

    public RevokeActorTokenRequestBuilder actorTokenId(String actorTokenId) {
        Utils.checkNotNull(actorTokenId, "actorTokenId");
        this.actorTokenId = actorTokenId;
        return this;
    }

    public RevokeActorTokenResponse call() throws Exception {

        return sdk.revokeToken(
            actorTokenId);
    }
}
