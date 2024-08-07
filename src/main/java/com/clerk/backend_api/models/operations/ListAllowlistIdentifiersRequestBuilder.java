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


public class ListAllowlistIdentifiersRequestBuilder {

    private final SDKMethodInterfaces.MethodCallListAllowlistIdentifiers sdk;

    public ListAllowlistIdentifiersRequestBuilder(SDKMethodInterfaces.MethodCallListAllowlistIdentifiers sdk) {
        this.sdk = sdk;
    }

    public ListAllowlistIdentifiersResponse call() throws Exception {

        return sdk.listDirect();
    }
}
