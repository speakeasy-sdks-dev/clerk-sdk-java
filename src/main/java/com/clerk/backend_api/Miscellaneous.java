/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api;

import com.clerk.backend_api.models.errors.SDKError;
import com.clerk.backend_api.models.operations.GetPublicInterstitialRequest;
import com.clerk.backend_api.models.operations.GetPublicInterstitialRequestBuilder;
import com.clerk.backend_api.models.operations.GetPublicInterstitialResponse;
import com.clerk.backend_api.models.operations.SDKMethodInterfaces.*;
import com.clerk.backend_api.utils.HTTPClient;
import com.clerk.backend_api.utils.HTTPRequest;
import com.clerk.backend_api.utils.Hook.AfterErrorContextImpl;
import com.clerk.backend_api.utils.Hook.AfterSuccessContextImpl;
import com.clerk.backend_api.utils.Hook.BeforeRequestContextImpl;
import com.clerk.backend_api.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

public class Miscellaneous implements
            MethodCallGetPublicInterstitial {

    private final SDKConfiguration sdkConfiguration;

    Miscellaneous(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Returns the markup for the interstitial page
     * The Clerk interstitial endpoint serves an html page that loads clerk.js in order to check the user's authentication state.
     * It is used by Clerk SDKs when the user's authentication state cannot be immediately determined.
     * @return The call builder
     */
    public GetPublicInterstitialRequestBuilder getPublicInterstitial() {
        return new GetPublicInterstitialRequestBuilder(this);
    }

    /**
     * Returns the markup for the interstitial page
     * The Clerk interstitial endpoint serves an html page that loads clerk.js in order to check the user's authentication state.
     * It is used by Clerk SDKs when the user's authentication state cannot be immediately determined.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetPublicInterstitialResponse getPublicInterstitialDirect() throws Exception {
        return getPublicInterstitial(Optional.empty(), Optional.empty());
    }
    
    /**
     * Returns the markup for the interstitial page
     * The Clerk interstitial endpoint serves an html page that loads clerk.js in order to check the user's authentication state.
     * It is used by Clerk SDKs when the user's authentication state cannot be immediately determined.
     * @param frontendApi The Frontend API key of your instance
     * @param publishableKey The publishable key of your instance
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetPublicInterstitialResponse getPublicInterstitial(
            Optional<String> frontendApi,
            Optional<String> publishableKey) throws Exception {
        GetPublicInterstitialRequest request =
            GetPublicInterstitialRequest
                .builder()
                .frontendApi(frontendApi)
                .publishableKey(publishableKey)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/public/interstitial");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "*/*")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetPublicInterstitialRequest.class,
                request, 
                null));

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "GetPublicInterstitial", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetPublicInterstitial",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "GetPublicInterstitial",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetPublicInterstitial",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetPublicInterstitialResponse.Builder _resBuilder = 
            GetPublicInterstitialResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetPublicInterstitialResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "500", "5XX")) {
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
