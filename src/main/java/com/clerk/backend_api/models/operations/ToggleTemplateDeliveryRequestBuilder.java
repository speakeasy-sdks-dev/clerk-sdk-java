/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class ToggleTemplateDeliveryRequestBuilder {

    private ToggleTemplateDeliveryPathParamTemplateType templateType;
    private String slug;
    private Optional<? extends ToggleTemplateDeliveryRequestBody> requestBody = Optional.empty();
    private final SDKMethodInterfaces.MethodCallToggleTemplateDelivery sdk;

    public ToggleTemplateDeliveryRequestBuilder(SDKMethodInterfaces.MethodCallToggleTemplateDelivery sdk) {
        this.sdk = sdk;
    }

    public ToggleTemplateDeliveryRequestBuilder templateType(ToggleTemplateDeliveryPathParamTemplateType templateType) {
        Utils.checkNotNull(templateType, "templateType");
        this.templateType = templateType;
        return this;
    }

    public ToggleTemplateDeliveryRequestBuilder slug(String slug) {
        Utils.checkNotNull(slug, "slug");
        this.slug = slug;
        return this;
    }
                
    public ToggleTemplateDeliveryRequestBuilder requestBody(ToggleTemplateDeliveryRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.of(requestBody);
        return this;
    }

    public ToggleTemplateDeliveryRequestBuilder requestBody(Optional<? extends ToggleTemplateDeliveryRequestBody> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public ToggleTemplateDeliveryResponse call() throws Exception {

        return sdk.toggleDelivery(
            templateType,
            slug,
            requestBody);
    }
}
