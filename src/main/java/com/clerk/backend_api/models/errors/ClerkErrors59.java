/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.errors;

import com.clerk.backend_api.models.components.ClerkError;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * ClerkErrors59 - Authorization invalid
 */
public class ClerkErrors59 extends RuntimeException {

    @JsonProperty("errors")
    private List<ClerkError> errors;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    private Optional<? extends Meta> meta;

    @JsonCreator
    public ClerkErrors59(
            @JsonProperty("errors") List<ClerkError> errors,
            @JsonProperty("meta") Optional<? extends Meta> meta) {
        Utils.checkNotNull(errors, "errors");
        Utils.checkNotNull(meta, "meta");
        this.errors = errors;
        this.meta = meta;
    }
    
    public ClerkErrors59(
            List<ClerkError> errors) {
        this(errors, Optional.empty());
    }

    public List<ClerkError> errors(){
        return errors;
    }

    @SuppressWarnings("unchecked")
    public Optional<Meta> meta(){
        return (Optional<Meta>) meta;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public ClerkErrors59 withErrors(List<ClerkError> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = errors;
        return this;
    }

    public ClerkErrors59 withMeta(Meta meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = Optional.ofNullable(meta);
        return this;
    }
    
    public ClerkErrors59 withMeta(Optional<? extends Meta> meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = meta;
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
        ClerkErrors59 other = (ClerkErrors59) o;
        return
            Objects.deepEquals(this.errors, other.errors) &&
            Objects.deepEquals(this.meta, other.meta);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            errors,
            meta);
    }

    @Override
    public String toString() {
        return Utils.toString(ClerkErrors59.class,
                "errors", errors,
                "meta", meta);
    }

    public final static class Builder {

        private List<ClerkError> errors;

        private Optional<? extends Meta> meta = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }

        public Builder errors(List<ClerkError> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = errors;
            return this;
        }

        public Builder meta(Meta meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = Optional.ofNullable(meta);
            return this;
        }
        
        public Builder meta(Optional<? extends Meta> meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = meta;
            return this;
        }

        public ClerkErrors59 build() {
            return new ClerkErrors59(
                errors,
                meta);
        }
    }
}
