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

public class UpdateUserRequest {

    /**
     * The ID of the user to update
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    private String userId;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private UpdateUserRequestBody requestBody;

    @JsonCreator
    public UpdateUserRequest(
            String userId,
            UpdateUserRequestBody requestBody) {
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(requestBody, "requestBody");
        this.userId = userId;
        this.requestBody = requestBody;
    }

    /**
     * The ID of the user to update
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    @JsonIgnore
    public UpdateUserRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the user to update
     */
    public UpdateUserRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public UpdateUserRequest withRequestBody(UpdateUserRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
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
        UpdateUserRequest other = (UpdateUserRequest) o;
        return 
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            userId,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateUserRequest.class,
                "userId", userId,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String userId;
 
        private UpdateUserRequestBody requestBody;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the user to update
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        public Builder requestBody(UpdateUserRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public UpdateUserRequest build() {
            return new UpdateUserRequest(
                userId,
                requestBody);
        }
    }
}

