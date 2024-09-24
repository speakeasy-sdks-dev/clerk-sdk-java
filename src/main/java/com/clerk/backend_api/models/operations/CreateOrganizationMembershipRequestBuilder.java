/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.lang.String;

public class CreateOrganizationMembershipRequestBuilder {

    private String organizationId;
    private CreateOrganizationMembershipRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallCreateOrganizationMembership sdk;

    public CreateOrganizationMembershipRequestBuilder(SDKMethodInterfaces.MethodCallCreateOrganizationMembership sdk) {
        this.sdk = sdk;
    }

    public CreateOrganizationMembershipRequestBuilder organizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public CreateOrganizationMembershipRequestBuilder requestBody(CreateOrganizationMembershipRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public CreateOrganizationMembershipResponse call() throws Exception {

        return sdk.create(
            organizationId,
            requestBody);
    }
}
