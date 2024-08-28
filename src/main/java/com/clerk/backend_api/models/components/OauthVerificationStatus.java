/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum OauthVerificationStatus {
    UNVERIFIED("unverified"),
    VERIFIED("verified"),
    FAILED("failed"),
    EXPIRED("expired"),
    TRANSFERABLE("transferable");

    @JsonValue
    private final String value;

    private OauthVerificationStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
