/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum Object {
    TOKEN("token");

    @JsonValue
    private final String value;

    private Object(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
