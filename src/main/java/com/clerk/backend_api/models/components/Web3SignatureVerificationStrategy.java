/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum Web3SignatureVerificationStrategy {
    WEB3_METAMASK_SIGNATURE("web3_metamask_signature");

    @JsonValue
    private final String value;

    private Web3SignatureVerificationStrategy(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
