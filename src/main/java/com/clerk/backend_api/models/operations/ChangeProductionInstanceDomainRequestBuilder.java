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


public class ChangeProductionInstanceDomainRequestBuilder {

    private Optional<? extends ChangeProductionInstanceDomainRequestBody> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallChangeProductionInstanceDomain sdk;

    public ChangeProductionInstanceDomainRequestBuilder(SDKMethodInterfaces.MethodCallChangeProductionInstanceDomain sdk) {
        this.sdk = sdk;
    }
                
    public ChangeProductionInstanceDomainRequestBuilder request(ChangeProductionInstanceDomainRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public ChangeProductionInstanceDomainRequestBuilder request(Optional<? extends ChangeProductionInstanceDomainRequestBody> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ChangeProductionInstanceDomainResponse call() throws Exception {

        return sdk.changeProductionDomain(
            request);
    }
}
