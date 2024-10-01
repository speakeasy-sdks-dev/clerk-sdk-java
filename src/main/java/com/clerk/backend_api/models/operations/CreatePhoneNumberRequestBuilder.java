/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.util.Optional;

public class CreatePhoneNumberRequestBuilder {

    private Optional<? extends CreatePhoneNumberRequestBody> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreatePhoneNumber sdk;

    public CreatePhoneNumberRequestBuilder(SDKMethodInterfaces.MethodCallCreatePhoneNumber sdk) {
        this.sdk = sdk;
    }
                
    public CreatePhoneNumberRequestBuilder request(CreatePhoneNumberRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public CreatePhoneNumberRequestBuilder request(Optional<? extends CreatePhoneNumberRequestBody> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreatePhoneNumberResponse call() throws Exception {

        return sdk.create(
            request);
    }
}
