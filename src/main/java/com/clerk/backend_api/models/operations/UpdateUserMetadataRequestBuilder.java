/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class UpdateUserMetadataRequestBuilder {

    private String userId;
    private Optional<? extends UpdateUserMetadataRequestBody> requestBody = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUpdateUserMetadata sdk;

    public UpdateUserMetadataRequestBuilder(SDKMethodInterfaces.MethodCallUpdateUserMetadata sdk) {
        this.sdk = sdk;
    }

    public UpdateUserMetadataRequestBuilder userId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }
                
    public UpdateUserMetadataRequestBuilder requestBody(UpdateUserMetadataRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.of(requestBody);
        return this;
    }

    public UpdateUserMetadataRequestBuilder requestBody(Optional<? extends UpdateUserMetadataRequestBody> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public UpdateUserMetadataResponse call() throws Exception {

        return sdk.updateMetadata(
            userId,
            requestBody);
    }
}
