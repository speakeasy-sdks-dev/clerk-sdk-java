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

public class DeleteEmailAddressRequest {

    /**
     * The ID of the email address to delete
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=email_address_id")
    private String emailAddressId;

    @JsonCreator
    public DeleteEmailAddressRequest(
            String emailAddressId) {
        Utils.checkNotNull(emailAddressId, "emailAddressId");
        this.emailAddressId = emailAddressId;
    }

    /**
     * The ID of the email address to delete
     */
    @JsonIgnore
    public String emailAddressId() {
        return emailAddressId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the email address to delete
     */
    public DeleteEmailAddressRequest withEmailAddressId(String emailAddressId) {
        Utils.checkNotNull(emailAddressId, "emailAddressId");
        this.emailAddressId = emailAddressId;
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
        DeleteEmailAddressRequest other = (DeleteEmailAddressRequest) o;
        return 
            java.util.Objects.deepEquals(this.emailAddressId, other.emailAddressId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            emailAddressId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteEmailAddressRequest.class,
                "emailAddressId", emailAddressId);
    }
    
    public final static class Builder {
 
        private String emailAddressId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the email address to delete
         */
        public Builder emailAddressId(String emailAddressId) {
            Utils.checkNotNull(emailAddressId, "emailAddressId");
            this.emailAddressId = emailAddressId;
            return this;
        }
        
        public DeleteEmailAddressRequest build() {
            return new DeleteEmailAddressRequest(
                emailAddressId);
        }
    }
}

