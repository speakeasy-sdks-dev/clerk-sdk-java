/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;


import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum TestingTokenObject {
    TESTING_TOKEN("testing_token");

    @JsonValue
    private final String value;

    private TestingTokenObject(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
