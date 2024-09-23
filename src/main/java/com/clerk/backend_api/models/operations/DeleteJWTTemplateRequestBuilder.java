/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.lang.String;

public class DeleteJWTTemplateRequestBuilder {

    private String templateId;
    private final SDKMethodInterfaces.MethodCallDeleteJWTTemplate sdk;

    public DeleteJWTTemplateRequestBuilder(SDKMethodInterfaces.MethodCallDeleteJWTTemplate sdk) {
        this.sdk = sdk;
    }

    public DeleteJWTTemplateRequestBuilder templateId(String templateId) {
        Utils.checkNotNull(templateId, "templateId");
        this.templateId = templateId;
        return this;
    }

    public DeleteJWTTemplateResponse call() throws Exception {

        return sdk.delete(
            templateId);
    }
}
