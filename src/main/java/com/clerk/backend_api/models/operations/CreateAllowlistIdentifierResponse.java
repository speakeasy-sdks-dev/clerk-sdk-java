/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;

public class CreateAllowlistIdentifierResponse implements com.clerk.backend_api.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Success
     */
    private Optional<? extends com.clerk.backend_api.models.components.AllowlistIdentifier> allowlistIdentifier;

    @JsonCreator
    public CreateAllowlistIdentifierResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.clerk.backend_api.models.components.AllowlistIdentifier> allowlistIdentifier) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(allowlistIdentifier, "allowlistIdentifier");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.allowlistIdentifier = allowlistIdentifier;
    }
    
    public CreateAllowlistIdentifierResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Success
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.clerk.backend_api.models.components.AllowlistIdentifier> allowlistIdentifier() {
        return (Optional<com.clerk.backend_api.models.components.AllowlistIdentifier>) allowlistIdentifier;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateAllowlistIdentifierResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateAllowlistIdentifierResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateAllowlistIdentifierResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public CreateAllowlistIdentifierResponse withAllowlistIdentifier(com.clerk.backend_api.models.components.AllowlistIdentifier allowlistIdentifier) {
        Utils.checkNotNull(allowlistIdentifier, "allowlistIdentifier");
        this.allowlistIdentifier = Optional.ofNullable(allowlistIdentifier);
        return this;
    }

    /**
     * Success
     */
    public CreateAllowlistIdentifierResponse withAllowlistIdentifier(Optional<? extends com.clerk.backend_api.models.components.AllowlistIdentifier> allowlistIdentifier) {
        Utils.checkNotNull(allowlistIdentifier, "allowlistIdentifier");
        this.allowlistIdentifier = allowlistIdentifier;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAllowlistIdentifierResponse other = (CreateAllowlistIdentifierResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.allowlistIdentifier, other.allowlistIdentifier);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            allowlistIdentifier);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateAllowlistIdentifierResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "allowlistIdentifier", allowlistIdentifier);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.clerk.backend_api.models.components.AllowlistIdentifier> allowlistIdentifier = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * Success
         */
        public Builder allowlistIdentifier(com.clerk.backend_api.models.components.AllowlistIdentifier allowlistIdentifier) {
            Utils.checkNotNull(allowlistIdentifier, "allowlistIdentifier");
            this.allowlistIdentifier = Optional.ofNullable(allowlistIdentifier);
            return this;
        }

        /**
         * Success
         */
        public Builder allowlistIdentifier(Optional<? extends com.clerk.backend_api.models.components.AllowlistIdentifier> allowlistIdentifier) {
            Utils.checkNotNull(allowlistIdentifier, "allowlistIdentifier");
            this.allowlistIdentifier = allowlistIdentifier;
            return this;
        }
        
        public CreateAllowlistIdentifierResponse build() {
            return new CreateAllowlistIdentifierResponse(
                contentType,
                statusCode,
                rawResponse,
                allowlistIdentifier);
        }
    }
}

