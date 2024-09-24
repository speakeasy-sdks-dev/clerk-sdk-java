/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.lang.String;

public class UpdateOrganizationMembershipMetadataRequestBuilder {

    private String organizationId;
    private String userId;
    private UpdateOrganizationMembershipMetadataRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallUpdateOrganizationMembershipMetadata sdk;

    public UpdateOrganizationMembershipMetadataRequestBuilder(SDKMethodInterfaces.MethodCallUpdateOrganizationMembershipMetadata sdk) {
        this.sdk = sdk;
    }

    public UpdateOrganizationMembershipMetadataRequestBuilder organizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public UpdateOrganizationMembershipMetadataRequestBuilder userId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public UpdateOrganizationMembershipMetadataRequestBuilder requestBody(UpdateOrganizationMembershipMetadataRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public UpdateOrganizationMembershipMetadataResponse call() throws Exception {

        return sdk.updateMetadata(
            organizationId,
            userId,
            requestBody);
    }
}
