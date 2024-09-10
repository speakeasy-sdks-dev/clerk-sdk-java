/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api;

import com.clerk.backend_api.hooks.SDKHooks;
import com.clerk.backend_api.utils.HTTPClient;
import com.clerk.backend_api.utils.Hook.SdkInitData;
import com.clerk.backend_api.utils.Hooks;
import com.clerk.backend_api.utils.RetryConfig;
import java.lang.String;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    public HTTPClient defaultClient;
    public String serverUrl;
    public int serverIdx = 0;
    public String language = "java";
    public String openapiDocVersion = "v1";
    public String sdkVersion = "0.3.0-beta.2";
    public String genVersion = "2.415.0";
    public String userAgent = "speakeasy-sdk/java 0.3.0-beta.2 2.415.0 v1 com.clerk.backend_api";

    private Hooks _hooks = createHooks();

    private static Hooks createHooks() {
        Hooks hooks = new Hooks();
        return hooks;
    }
    
    public Hooks hooks() {
        return _hooks;
    }

    public void setHooks(Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {
        SDKHooks.initialize(_hooks);
        // apply the sdk init hook immediately
        SdkInitData data = _hooks.sdkInit(new SdkInitData(serverUrl, defaultClient));
        this.serverUrl = data.baseUrl();
        this.defaultClient = data.client();
    }

    
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
