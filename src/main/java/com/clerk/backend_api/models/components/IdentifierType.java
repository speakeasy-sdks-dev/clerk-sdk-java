/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;

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

public enum IdentifierType {
    EMAIL_ADDRESS("email_address"),
    PHONE_NUMBER("phone_number"),
    WEB3_WALLET("web3_wallet");

    @JsonValue
    private final String value;

    private IdentifierType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
