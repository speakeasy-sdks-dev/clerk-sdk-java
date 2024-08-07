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


public class DeleteRedirectURLRequestBuilder {

    private String id;
    private final SDKMethodInterfaces.MethodCallDeleteRedirectURL sdk;

    public DeleteRedirectURLRequestBuilder(SDKMethodInterfaces.MethodCallDeleteRedirectURL sdk) {
        this.sdk = sdk;
    }

    public DeleteRedirectURLRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public DeleteRedirectURLResponse call() throws Exception {

        return sdk.delete(
            id);
    }
}
