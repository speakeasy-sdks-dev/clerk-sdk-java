/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.LazySingletonValue;
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
import java.util.Optional;

public class ListOrganizationMembershipsRequest {

    /**
     * The organization ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organization_id")
    private String organizationId;

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<? extends Long> limit;

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    private Optional<? extends Long> offset;

    /**
     * Sorts organizations memberships by phone_number, email_address, created_at, first_name, last_name or username.
     * By prepending one of those values with + or -,
     * we can choose to sort in ascending (ASC) or descending (DESC) order."
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=order_by")
    private Optional<? extends String> orderBy;

    @JsonCreator
    public ListOrganizationMembershipsRequest(
            String organizationId,
            Optional<? extends Long> limit,
            Optional<? extends Long> offset,
            Optional<? extends String> orderBy) {
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(orderBy, "orderBy");
        this.organizationId = organizationId;
        this.limit = limit;
        this.offset = offset;
        this.orderBy = orderBy;
    }
    
    public ListOrganizationMembershipsRequest(
            String organizationId) {
        this(organizationId, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The organization ID.
     */
    @JsonIgnore
    public String organizationId() {
        return organizationId;
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> limit() {
        return (Optional<Long>) limit;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> offset() {
        return (Optional<Long>) offset;
    }

    /**
     * Sorts organizations memberships by phone_number, email_address, created_at, first_name, last_name or username.
     * By prepending one of those values with + or -,
     * we can choose to sort in ascending (ASC) or descending (DESC) order."
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> orderBy() {
        return (Optional<String>) orderBy;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The organization ID.
     */
    public ListOrganizationMembershipsRequest withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    public ListOrganizationMembershipsRequest withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    public ListOrganizationMembershipsRequest withLimit(Optional<? extends Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    public ListOrganizationMembershipsRequest withOffset(long offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    public ListOrganizationMembershipsRequest withOffset(Optional<? extends Long> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    /**
     * Sorts organizations memberships by phone_number, email_address, created_at, first_name, last_name or username.
     * By prepending one of those values with + or -,
     * we can choose to sort in ascending (ASC) or descending (DESC) order."
     */
    public ListOrganizationMembershipsRequest withOrderBy(String orderBy) {
        Utils.checkNotNull(orderBy, "orderBy");
        this.orderBy = Optional.ofNullable(orderBy);
        return this;
    }

    /**
     * Sorts organizations memberships by phone_number, email_address, created_at, first_name, last_name or username.
     * By prepending one of those values with + or -,
     * we can choose to sort in ascending (ASC) or descending (DESC) order."
     */
    public ListOrganizationMembershipsRequest withOrderBy(Optional<? extends String> orderBy) {
        Utils.checkNotNull(orderBy, "orderBy");
        this.orderBy = orderBy;
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
        ListOrganizationMembershipsRequest other = (ListOrganizationMembershipsRequest) o;
        return 
            java.util.Objects.deepEquals(this.organizationId, other.organizationId) &&
            java.util.Objects.deepEquals(this.limit, other.limit) &&
            java.util.Objects.deepEquals(this.offset, other.offset) &&
            java.util.Objects.deepEquals(this.orderBy, other.orderBy);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            organizationId,
            limit,
            offset,
            orderBy);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListOrganizationMembershipsRequest.class,
                "organizationId", organizationId,
                "limit", limit,
                "offset", offset,
                "orderBy", orderBy);
    }
    
    public final static class Builder {
 
        private String organizationId;
 
        private Optional<? extends Long> limit;
 
        private Optional<? extends Long> offset;
 
        private Optional<? extends String> orderBy = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The organization ID.
         */
        public Builder organizationId(String organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
        }

        /**
         * Applies a limit to the number of results returned.
         * Can be used for paginating the results together with `offset`.
         */
        public Builder limit(long limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * Applies a limit to the number of results returned.
         * Can be used for paginating the results together with `offset`.
         */
        public Builder limit(Optional<? extends Long> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        /**
         * Skip the first `offset` results when paginating.
         * Needs to be an integer greater or equal to zero.
         * To be used in conjunction with `limit`.
         */
        public Builder offset(long offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = Optional.ofNullable(offset);
            return this;
        }

        /**
         * Skip the first `offset` results when paginating.
         * Needs to be an integer greater or equal to zero.
         * To be used in conjunction with `limit`.
         */
        public Builder offset(Optional<? extends Long> offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = offset;
            return this;
        }

        /**
         * Sorts organizations memberships by phone_number, email_address, created_at, first_name, last_name or username.
         * By prepending one of those values with + or -,
         * we can choose to sort in ascending (ASC) or descending (DESC) order."
         */
        public Builder orderBy(String orderBy) {
            Utils.checkNotNull(orderBy, "orderBy");
            this.orderBy = Optional.ofNullable(orderBy);
            return this;
        }

        /**
         * Sorts organizations memberships by phone_number, email_address, created_at, first_name, last_name or username.
         * By prepending one of those values with + or -,
         * we can choose to sort in ascending (ASC) or descending (DESC) order."
         */
        public Builder orderBy(Optional<? extends String> orderBy) {
            Utils.checkNotNull(orderBy, "orderBy");
            this.orderBy = orderBy;
            return this;
        }
        
        public ListOrganizationMembershipsRequest build() {
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }
            if (offset == null) {
                offset = _SINGLETON_VALUE_Offset.value();
            }
            return new ListOrganizationMembershipsRequest(
                organizationId,
                limit,
                offset,
                orderBy);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Limit =
                new LazySingletonValue<>(
                        "limit",
                        "10",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Offset =
                new LazySingletonValue<>(
                        "offset",
                        "0",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}

