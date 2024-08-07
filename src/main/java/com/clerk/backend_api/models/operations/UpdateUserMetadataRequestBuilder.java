/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.models.errors.SDKError;
import com.clerk.backend_api.utils.LazySingletonValue;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


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
