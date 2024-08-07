/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * PathParamTemplateType - The type of templates to retrieve (email or SMS)
 */
public enum PathParamTemplateType {
    EMAIL("email"),
    SMS("sms");

    @JsonValue
    private final String value;

    private PathParamTemplateType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
