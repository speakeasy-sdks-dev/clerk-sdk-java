/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;


import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * SvixURL - Response that contains a temporary Svix URL to access management dashboard
 */

public class SvixURL {

    @JsonProperty("svix_url")
    private String svixUrl;

    @JsonCreator
    public SvixURL(
            @JsonProperty("svix_url") String svixUrl) {
        Utils.checkNotNull(svixUrl, "svixUrl");
        this.svixUrl = svixUrl;
    }

    @JsonIgnore
    public String svixUrl() {
        return svixUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SvixURL withSvixUrl(String svixUrl) {
        Utils.checkNotNull(svixUrl, "svixUrl");
        this.svixUrl = svixUrl;
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
        SvixURL other = (SvixURL) o;
        return 
            Objects.deepEquals(this.svixUrl, other.svixUrl);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            svixUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SvixURL.class,
                "svixUrl", svixUrl);
    }
    
    public final static class Builder {
 
        private String svixUrl;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder svixUrl(String svixUrl) {
            Utils.checkNotNull(svixUrl, "svixUrl");
            this.svixUrl = svixUrl;
            return this;
        }
        
        public SvixURL build() {
            return new SvixURL(
                svixUrl);
        }
    }
}

