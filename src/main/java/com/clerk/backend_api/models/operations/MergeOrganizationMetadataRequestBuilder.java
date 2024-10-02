/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.lang.String;

public class MergeOrganizationMetadataRequestBuilder {

    private String organizationId;
    private MergeOrganizationMetadataRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallMergeOrganizationMetadata sdk;

    public MergeOrganizationMetadataRequestBuilder(SDKMethodInterfaces.MethodCallMergeOrganizationMetadata sdk) {
        this.sdk = sdk;
    }

    public MergeOrganizationMetadataRequestBuilder organizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public MergeOrganizationMetadataRequestBuilder requestBody(MergeOrganizationMetadataRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public MergeOrganizationMetadataResponse call() throws Exception {

        return sdk.mergeMetadata(
            organizationId,
            requestBody);
    }
}
