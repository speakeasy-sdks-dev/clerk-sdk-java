/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;


import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum Nonce {
    NONCE("nonce");

    @JsonValue
    private final String value;

    private Nonce(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
