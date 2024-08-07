/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.SpeakeasyMetadata;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class GetSessionRequest {

    /**
     * The ID of the session
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=session_id")
    private String sessionId;

    @JsonCreator
    public GetSessionRequest(
            String sessionId) {
        Utils.checkNotNull(sessionId, "sessionId");
        this.sessionId = sessionId;
    }

    /**
     * The ID of the session
     */
    @JsonIgnore
    public String sessionId() {
        return sessionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the session
     */
    public GetSessionRequest withSessionId(String sessionId) {
        Utils.checkNotNull(sessionId, "sessionId");
        this.sessionId = sessionId;
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
        GetSessionRequest other = (GetSessionRequest) o;
        return 
            java.util.Objects.deepEquals(this.sessionId, other.sessionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            sessionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSessionRequest.class,
                "sessionId", sessionId);
    }
    
    public final static class Builder {
 
        private String sessionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the session
         */
        public Builder sessionId(String sessionId) {
            Utils.checkNotNull(sessionId, "sessionId");
            this.sessionId = sessionId;
            return this;
        }
        
        public GetSessionRequest build() {
            return new GetSessionRequest(
                sessionId);
        }
    }
}

