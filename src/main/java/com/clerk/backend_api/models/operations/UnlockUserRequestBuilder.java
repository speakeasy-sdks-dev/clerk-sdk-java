/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.lang.String;

public class UnlockUserRequestBuilder {

    private String userId;
    private final SDKMethodInterfaces.MethodCallUnlockUser sdk;

    public UnlockUserRequestBuilder(SDKMethodInterfaces.MethodCallUnlockUser sdk) {
        this.sdk = sdk;
    }

    public UnlockUserRequestBuilder userId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public UnlockUserResponse call() throws Exception {

        return sdk.unlock(
            userId);
    }
}
