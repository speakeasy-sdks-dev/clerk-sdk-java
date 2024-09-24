/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.lang.String;

public class DeleteDomainRequestBuilder {

    private String domainId;
    private final SDKMethodInterfaces.MethodCallDeleteDomain sdk;

    public DeleteDomainRequestBuilder(SDKMethodInterfaces.MethodCallDeleteDomain sdk) {
        this.sdk = sdk;
    }

    public DeleteDomainRequestBuilder domainId(String domainId) {
        Utils.checkNotNull(domainId, "domainId");
        this.domainId = domainId;
        return this;
    }

    public DeleteDomainResponse call() throws Exception {

        return sdk.delete(
            domainId);
    }
}
