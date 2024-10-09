/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api;

import com.clerk.backend_api.models.components.SignUp;
import com.clerk.backend_api.models.errors.ClerkErrors79;
import com.clerk.backend_api.models.errors.SDKError;
import com.clerk.backend_api.models.operations.SDKMethodInterfaces.*;
import com.clerk.backend_api.models.operations.UpdateSignUpRequest;
import com.clerk.backend_api.models.operations.UpdateSignUpRequestBody;
import com.clerk.backend_api.models.operations.UpdateSignUpRequestBuilder;
import com.clerk.backend_api.models.operations.UpdateSignUpResponse;
import com.clerk.backend_api.utils.HTTPClient;
import com.clerk.backend_api.utils.HTTPRequest;
import com.clerk.backend_api.utils.Hook.AfterErrorContextImpl;
import com.clerk.backend_api.utils.Hook.AfterSuccessContextImpl;
import com.clerk.backend_api.utils.Hook.BeforeRequestContextImpl;
import com.clerk.backend_api.utils.SerializedBody;
import com.clerk.backend_api.utils.Utils.JsonShape;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

public class SignUps implements
            MethodCallUpdateSignUp {

    private final SDKConfiguration sdkConfiguration;

    SignUps(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Update a sign-up
     * Update the sign-up with the given ID
     * @return The call builder
     */
    public UpdateSignUpRequestBuilder update() {
        return new UpdateSignUpRequestBuilder(this);
    }

    /**
     * Update a sign-up
     * Update the sign-up with the given ID
     * @param id The ID of the sign-up to update
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateSignUpResponse update(
            String id) throws Exception {
        return update(id, Optional.empty());
    }
    
    /**
     * Update a sign-up
     * Update the sign-up with the given ID
     * @param id The ID of the sign-up to update
     * @param requestBody
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateSignUpResponse update(
            String id,
            Optional<? extends UpdateSignUpRequestBody> requestBody) throws Exception {
        UpdateSignUpRequest request =
            UpdateSignUpRequest
                .builder()
                .id(id)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                UpdateSignUpRequest.class,
                _baseUrl,
                "/sign_ups/{id}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "PATCH");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "requestBody",
                "json",
                false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "UpdateSignUp", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "403", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "UpdateSignUp",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "UpdateSignUp",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "UpdateSignUp",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateSignUpResponse.Builder _resBuilder = 
            UpdateSignUpResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdateSignUpResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                SignUp _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<SignUp>() {});
                _res.withSignUp(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "403")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ClerkErrors79 _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ClerkErrors79>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}
