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


public class DeleteOrganizationLogoRequestBuilder {

    private String organizationId;
    private final SDKMethodInterfaces.MethodCallDeleteOrganizationLogo sdk;

    public DeleteOrganizationLogoRequestBuilder(SDKMethodInterfaces.MethodCallDeleteOrganizationLogo sdk) {
        this.sdk = sdk;
    }

    public DeleteOrganizationLogoRequestBuilder organizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public DeleteOrganizationLogoResponse call() throws Exception {

        return sdk.deleteLogo(
            organizationId);
    }
}
