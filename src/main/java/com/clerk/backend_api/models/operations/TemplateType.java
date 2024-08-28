/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * TemplateType - The type of templates to list (email or SMS)
 */
public enum TemplateType {
    EMAIL("email"),
    SMS("sms");

    @JsonValue
    private final String value;

    private TemplateType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
