/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum Web3SignatureVerificationStatus {
    VERIFIED("verified");

    @JsonValue
    private final String value;

    private Web3SignatureVerificationStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
