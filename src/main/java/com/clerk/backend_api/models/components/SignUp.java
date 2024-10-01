/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;


import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SignUp - Success
 */

public class SignUp {

    @JsonProperty("object")
    private SignUpObject object;

    @JsonProperty("id")
    private String id;

    @JsonProperty("status")
    private SignUpStatus status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required_fields")
    private Optional<? extends List<String>> requiredFields;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("optional_fields")
    private Optional<? extends List<String>> optionalFields;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("missing_fields")
    private Optional<? extends List<String>> missingFields;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unverified_fields")
    private Optional<? extends List<String>> unverifiedFields;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("verifications")
    private Optional<? extends Verifications> verifications;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("username")
    private JsonNullable<String> username;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email_address")
    private JsonNullable<String> emailAddress;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_number")
    private JsonNullable<String> phoneNumber;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("web3_wallet")
    private JsonNullable<String> web3Wallet;

    @JsonProperty("password_enabled")
    private boolean passwordEnabled;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    private JsonNullable<String> firstName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    private JsonNullable<String> lastName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unsafe_metadata")
    private Optional<? extends SignUpUnsafeMetadata> unsafeMetadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public_metadata")
    private Optional<? extends SignUpPublicMetadata> publicMetadata;

    @JsonProperty("custom_action")
    private boolean customAction;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_id")
    private JsonNullable<String> externalId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_session_id")
    private JsonNullable<String> createdSessionId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_user_id")
    private JsonNullable<String> createdUserId;

    @JsonProperty("abandon_at")
    private long abandonAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_account")
    private Optional<? extends ExternalAccount> externalAccount;

    @JsonCreator
    public SignUp(
            @JsonProperty("object") SignUpObject object,
            @JsonProperty("id") String id,
            @JsonProperty("status") SignUpStatus status,
            @JsonProperty("required_fields") Optional<? extends List<String>> requiredFields,
            @JsonProperty("optional_fields") Optional<? extends List<String>> optionalFields,
            @JsonProperty("missing_fields") Optional<? extends List<String>> missingFields,
            @JsonProperty("unverified_fields") Optional<? extends List<String>> unverifiedFields,
            @JsonProperty("verifications") Optional<? extends Verifications> verifications,
            @JsonProperty("username") JsonNullable<String> username,
            @JsonProperty("email_address") JsonNullable<String> emailAddress,
            @JsonProperty("phone_number") JsonNullable<String> phoneNumber,
            @JsonProperty("web3_wallet") JsonNullable<String> web3Wallet,
            @JsonProperty("password_enabled") boolean passwordEnabled,
            @JsonProperty("first_name") JsonNullable<String> firstName,
            @JsonProperty("last_name") JsonNullable<String> lastName,
            @JsonProperty("unsafe_metadata") Optional<? extends SignUpUnsafeMetadata> unsafeMetadata,
            @JsonProperty("public_metadata") Optional<? extends SignUpPublicMetadata> publicMetadata,
            @JsonProperty("custom_action") boolean customAction,
            @JsonProperty("external_id") JsonNullable<String> externalId,
            @JsonProperty("created_session_id") JsonNullable<String> createdSessionId,
            @JsonProperty("created_user_id") JsonNullable<String> createdUserId,
            @JsonProperty("abandon_at") long abandonAt,
            @JsonProperty("external_account") Optional<? extends ExternalAccount> externalAccount) {
        Utils.checkNotNull(object, "object");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(requiredFields, "requiredFields");
        Utils.checkNotNull(optionalFields, "optionalFields");
        Utils.checkNotNull(missingFields, "missingFields");
        Utils.checkNotNull(unverifiedFields, "unverifiedFields");
        Utils.checkNotNull(verifications, "verifications");
        Utils.checkNotNull(username, "username");
        Utils.checkNotNull(emailAddress, "emailAddress");
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        Utils.checkNotNull(web3Wallet, "web3Wallet");
        Utils.checkNotNull(passwordEnabled, "passwordEnabled");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(unsafeMetadata, "unsafeMetadata");
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        Utils.checkNotNull(customAction, "customAction");
        Utils.checkNotNull(externalId, "externalId");
        Utils.checkNotNull(createdSessionId, "createdSessionId");
        Utils.checkNotNull(createdUserId, "createdUserId");
        Utils.checkNotNull(abandonAt, "abandonAt");
        Utils.checkNotNull(externalAccount, "externalAccount");
        this.object = object;
        this.id = id;
        this.status = status;
        this.requiredFields = requiredFields;
        this.optionalFields = optionalFields;
        this.missingFields = missingFields;
        this.unverifiedFields = unverifiedFields;
        this.verifications = verifications;
        this.username = username;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.web3Wallet = web3Wallet;
        this.passwordEnabled = passwordEnabled;
        this.firstName = firstName;
        this.lastName = lastName;
        this.unsafeMetadata = unsafeMetadata;
        this.publicMetadata = publicMetadata;
        this.customAction = customAction;
        this.externalId = externalId;
        this.createdSessionId = createdSessionId;
        this.createdUserId = createdUserId;
        this.abandonAt = abandonAt;
        this.externalAccount = externalAccount;
    }
    
    public SignUp(
            SignUpObject object,
            String id,
            SignUpStatus status,
            boolean passwordEnabled,
            boolean customAction,
            long abandonAt) {
        this(object, id, status, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), passwordEnabled, JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), customAction, JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), abandonAt, Optional.empty());
    }

    @JsonIgnore
    public SignUpObject object() {
        return object;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public SignUpStatus status() {
        return status;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> requiredFields() {
        return (Optional<List<String>>) requiredFields;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> optionalFields() {
        return (Optional<List<String>>) optionalFields;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> missingFields() {
        return (Optional<List<String>>) missingFields;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> unverifiedFields() {
        return (Optional<List<String>>) unverifiedFields;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Verifications> verifications() {
        return (Optional<Verifications>) verifications;
    }

    @JsonIgnore
    public JsonNullable<String> username() {
        return username;
    }

    @JsonIgnore
    public JsonNullable<String> emailAddress() {
        return emailAddress;
    }

    @JsonIgnore
    public JsonNullable<String> phoneNumber() {
        return phoneNumber;
    }

    @JsonIgnore
    public JsonNullable<String> web3Wallet() {
        return web3Wallet;
    }

    @JsonIgnore
    public boolean passwordEnabled() {
        return passwordEnabled;
    }

    @JsonIgnore
    public JsonNullable<String> firstName() {
        return firstName;
    }

    @JsonIgnore
    public JsonNullable<String> lastName() {
        return lastName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SignUpUnsafeMetadata> unsafeMetadata() {
        return (Optional<SignUpUnsafeMetadata>) unsafeMetadata;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SignUpPublicMetadata> publicMetadata() {
        return (Optional<SignUpPublicMetadata>) publicMetadata;
    }

    @JsonIgnore
    public boolean customAction() {
        return customAction;
    }

    @JsonIgnore
    public JsonNullable<String> externalId() {
        return externalId;
    }

    @JsonIgnore
    public JsonNullable<String> createdSessionId() {
        return createdSessionId;
    }

    @JsonIgnore
    public JsonNullable<String> createdUserId() {
        return createdUserId;
    }

    @JsonIgnore
    public long abandonAt() {
        return abandonAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ExternalAccount> externalAccount() {
        return (Optional<ExternalAccount>) externalAccount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SignUp withObject(SignUpObject object) {
        Utils.checkNotNull(object, "object");
        this.object = object;
        return this;
    }

    public SignUp withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public SignUp withStatus(SignUpStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public SignUp withRequiredFields(List<String> requiredFields) {
        Utils.checkNotNull(requiredFields, "requiredFields");
        this.requiredFields = Optional.ofNullable(requiredFields);
        return this;
    }

    public SignUp withRequiredFields(Optional<? extends List<String>> requiredFields) {
        Utils.checkNotNull(requiredFields, "requiredFields");
        this.requiredFields = requiredFields;
        return this;
    }

    public SignUp withOptionalFields(List<String> optionalFields) {
        Utils.checkNotNull(optionalFields, "optionalFields");
        this.optionalFields = Optional.ofNullable(optionalFields);
        return this;
    }

    public SignUp withOptionalFields(Optional<? extends List<String>> optionalFields) {
        Utils.checkNotNull(optionalFields, "optionalFields");
        this.optionalFields = optionalFields;
        return this;
    }

    public SignUp withMissingFields(List<String> missingFields) {
        Utils.checkNotNull(missingFields, "missingFields");
        this.missingFields = Optional.ofNullable(missingFields);
        return this;
    }

    public SignUp withMissingFields(Optional<? extends List<String>> missingFields) {
        Utils.checkNotNull(missingFields, "missingFields");
        this.missingFields = missingFields;
        return this;
    }

    public SignUp withUnverifiedFields(List<String> unverifiedFields) {
        Utils.checkNotNull(unverifiedFields, "unverifiedFields");
        this.unverifiedFields = Optional.ofNullable(unverifiedFields);
        return this;
    }

    public SignUp withUnverifiedFields(Optional<? extends List<String>> unverifiedFields) {
        Utils.checkNotNull(unverifiedFields, "unverifiedFields");
        this.unverifiedFields = unverifiedFields;
        return this;
    }

    public SignUp withVerifications(Verifications verifications) {
        Utils.checkNotNull(verifications, "verifications");
        this.verifications = Optional.ofNullable(verifications);
        return this;
    }

    public SignUp withVerifications(Optional<? extends Verifications> verifications) {
        Utils.checkNotNull(verifications, "verifications");
        this.verifications = verifications;
        return this;
    }

    public SignUp withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = JsonNullable.of(username);
        return this;
    }

    public SignUp withUsername(JsonNullable<String> username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
        return this;
    }

    public SignUp withEmailAddress(String emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = JsonNullable.of(emailAddress);
        return this;
    }

    public SignUp withEmailAddress(JsonNullable<String> emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
        return this;
    }

    public SignUp withPhoneNumber(String phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = JsonNullable.of(phoneNumber);
        return this;
    }

    public SignUp withPhoneNumber(JsonNullable<String> phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
        return this;
    }

    public SignUp withWeb3Wallet(String web3Wallet) {
        Utils.checkNotNull(web3Wallet, "web3Wallet");
        this.web3Wallet = JsonNullable.of(web3Wallet);
        return this;
    }

    public SignUp withWeb3Wallet(JsonNullable<String> web3Wallet) {
        Utils.checkNotNull(web3Wallet, "web3Wallet");
        this.web3Wallet = web3Wallet;
        return this;
    }

    public SignUp withPasswordEnabled(boolean passwordEnabled) {
        Utils.checkNotNull(passwordEnabled, "passwordEnabled");
        this.passwordEnabled = passwordEnabled;
        return this;
    }

    public SignUp withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = JsonNullable.of(firstName);
        return this;
    }

    public SignUp withFirstName(JsonNullable<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public SignUp withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = JsonNullable.of(lastName);
        return this;
    }

    public SignUp withLastName(JsonNullable<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    public SignUp withUnsafeMetadata(SignUpUnsafeMetadata unsafeMetadata) {
        Utils.checkNotNull(unsafeMetadata, "unsafeMetadata");
        this.unsafeMetadata = Optional.ofNullable(unsafeMetadata);
        return this;
    }

    public SignUp withUnsafeMetadata(Optional<? extends SignUpUnsafeMetadata> unsafeMetadata) {
        Utils.checkNotNull(unsafeMetadata, "unsafeMetadata");
        this.unsafeMetadata = unsafeMetadata;
        return this;
    }

    public SignUp withPublicMetadata(SignUpPublicMetadata publicMetadata) {
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        this.publicMetadata = Optional.ofNullable(publicMetadata);
        return this;
    }

    public SignUp withPublicMetadata(Optional<? extends SignUpPublicMetadata> publicMetadata) {
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        this.publicMetadata = publicMetadata;
        return this;
    }

    public SignUp withCustomAction(boolean customAction) {
        Utils.checkNotNull(customAction, "customAction");
        this.customAction = customAction;
        return this;
    }

    public SignUp withExternalId(String externalId) {
        Utils.checkNotNull(externalId, "externalId");
        this.externalId = JsonNullable.of(externalId);
        return this;
    }

    public SignUp withExternalId(JsonNullable<String> externalId) {
        Utils.checkNotNull(externalId, "externalId");
        this.externalId = externalId;
        return this;
    }

    public SignUp withCreatedSessionId(String createdSessionId) {
        Utils.checkNotNull(createdSessionId, "createdSessionId");
        this.createdSessionId = JsonNullable.of(createdSessionId);
        return this;
    }

    public SignUp withCreatedSessionId(JsonNullable<String> createdSessionId) {
        Utils.checkNotNull(createdSessionId, "createdSessionId");
        this.createdSessionId = createdSessionId;
        return this;
    }

    public SignUp withCreatedUserId(String createdUserId) {
        Utils.checkNotNull(createdUserId, "createdUserId");
        this.createdUserId = JsonNullable.of(createdUserId);
        return this;
    }

    public SignUp withCreatedUserId(JsonNullable<String> createdUserId) {
        Utils.checkNotNull(createdUserId, "createdUserId");
        this.createdUserId = createdUserId;
        return this;
    }

    public SignUp withAbandonAt(long abandonAt) {
        Utils.checkNotNull(abandonAt, "abandonAt");
        this.abandonAt = abandonAt;
        return this;
    }

    public SignUp withExternalAccount(ExternalAccount externalAccount) {
        Utils.checkNotNull(externalAccount, "externalAccount");
        this.externalAccount = Optional.ofNullable(externalAccount);
        return this;
    }

    public SignUp withExternalAccount(Optional<? extends ExternalAccount> externalAccount) {
        Utils.checkNotNull(externalAccount, "externalAccount");
        this.externalAccount = externalAccount;
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
        SignUp other = (SignUp) o;
        return 
            Objects.deepEquals(this.object, other.object) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.requiredFields, other.requiredFields) &&
            Objects.deepEquals(this.optionalFields, other.optionalFields) &&
            Objects.deepEquals(this.missingFields, other.missingFields) &&
            Objects.deepEquals(this.unverifiedFields, other.unverifiedFields) &&
            Objects.deepEquals(this.verifications, other.verifications) &&
            Objects.deepEquals(this.username, other.username) &&
            Objects.deepEquals(this.emailAddress, other.emailAddress) &&
            Objects.deepEquals(this.phoneNumber, other.phoneNumber) &&
            Objects.deepEquals(this.web3Wallet, other.web3Wallet) &&
            Objects.deepEquals(this.passwordEnabled, other.passwordEnabled) &&
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.unsafeMetadata, other.unsafeMetadata) &&
            Objects.deepEquals(this.publicMetadata, other.publicMetadata) &&
            Objects.deepEquals(this.customAction, other.customAction) &&
            Objects.deepEquals(this.externalId, other.externalId) &&
            Objects.deepEquals(this.createdSessionId, other.createdSessionId) &&
            Objects.deepEquals(this.createdUserId, other.createdUserId) &&
            Objects.deepEquals(this.abandonAt, other.abandonAt) &&
            Objects.deepEquals(this.externalAccount, other.externalAccount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            object,
            id,
            status,
            requiredFields,
            optionalFields,
            missingFields,
            unverifiedFields,
            verifications,
            username,
            emailAddress,
            phoneNumber,
            web3Wallet,
            passwordEnabled,
            firstName,
            lastName,
            unsafeMetadata,
            publicMetadata,
            customAction,
            externalId,
            createdSessionId,
            createdUserId,
            abandonAt,
            externalAccount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SignUp.class,
                "object", object,
                "id", id,
                "status", status,
                "requiredFields", requiredFields,
                "optionalFields", optionalFields,
                "missingFields", missingFields,
                "unverifiedFields", unverifiedFields,
                "verifications", verifications,
                "username", username,
                "emailAddress", emailAddress,
                "phoneNumber", phoneNumber,
                "web3Wallet", web3Wallet,
                "passwordEnabled", passwordEnabled,
                "firstName", firstName,
                "lastName", lastName,
                "unsafeMetadata", unsafeMetadata,
                "publicMetadata", publicMetadata,
                "customAction", customAction,
                "externalId", externalId,
                "createdSessionId", createdSessionId,
                "createdUserId", createdUserId,
                "abandonAt", abandonAt,
                "externalAccount", externalAccount);
    }
    
    public final static class Builder {
 
        private SignUpObject object;
 
        private String id;
 
        private SignUpStatus status;
 
        private Optional<? extends List<String>> requiredFields = Optional.empty();
 
        private Optional<? extends List<String>> optionalFields = Optional.empty();
 
        private Optional<? extends List<String>> missingFields = Optional.empty();
 
        private Optional<? extends List<String>> unverifiedFields = Optional.empty();
 
        private Optional<? extends Verifications> verifications = Optional.empty();
 
        private JsonNullable<String> username = JsonNullable.undefined();
 
        private JsonNullable<String> emailAddress = JsonNullable.undefined();
 
        private JsonNullable<String> phoneNumber = JsonNullable.undefined();
 
        private JsonNullable<String> web3Wallet = JsonNullable.undefined();
 
        private Boolean passwordEnabled;
 
        private JsonNullable<String> firstName = JsonNullable.undefined();
 
        private JsonNullable<String> lastName = JsonNullable.undefined();
 
        private Optional<? extends SignUpUnsafeMetadata> unsafeMetadata = Optional.empty();
 
        private Optional<? extends SignUpPublicMetadata> publicMetadata = Optional.empty();
 
        private Boolean customAction;
 
        private JsonNullable<String> externalId = JsonNullable.undefined();
 
        private JsonNullable<String> createdSessionId = JsonNullable.undefined();
 
        private JsonNullable<String> createdUserId = JsonNullable.undefined();
 
        private Long abandonAt;
 
        private Optional<? extends ExternalAccount> externalAccount = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder object(SignUpObject object) {
            Utils.checkNotNull(object, "object");
            this.object = object;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder status(SignUpStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder requiredFields(List<String> requiredFields) {
            Utils.checkNotNull(requiredFields, "requiredFields");
            this.requiredFields = Optional.ofNullable(requiredFields);
            return this;
        }

        public Builder requiredFields(Optional<? extends List<String>> requiredFields) {
            Utils.checkNotNull(requiredFields, "requiredFields");
            this.requiredFields = requiredFields;
            return this;
        }

        public Builder optionalFields(List<String> optionalFields) {
            Utils.checkNotNull(optionalFields, "optionalFields");
            this.optionalFields = Optional.ofNullable(optionalFields);
            return this;
        }

        public Builder optionalFields(Optional<? extends List<String>> optionalFields) {
            Utils.checkNotNull(optionalFields, "optionalFields");
            this.optionalFields = optionalFields;
            return this;
        }

        public Builder missingFields(List<String> missingFields) {
            Utils.checkNotNull(missingFields, "missingFields");
            this.missingFields = Optional.ofNullable(missingFields);
            return this;
        }

        public Builder missingFields(Optional<? extends List<String>> missingFields) {
            Utils.checkNotNull(missingFields, "missingFields");
            this.missingFields = missingFields;
            return this;
        }

        public Builder unverifiedFields(List<String> unverifiedFields) {
            Utils.checkNotNull(unverifiedFields, "unverifiedFields");
            this.unverifiedFields = Optional.ofNullable(unverifiedFields);
            return this;
        }

        public Builder unverifiedFields(Optional<? extends List<String>> unverifiedFields) {
            Utils.checkNotNull(unverifiedFields, "unverifiedFields");
            this.unverifiedFields = unverifiedFields;
            return this;
        }

        public Builder verifications(Verifications verifications) {
            Utils.checkNotNull(verifications, "verifications");
            this.verifications = Optional.ofNullable(verifications);
            return this;
        }

        public Builder verifications(Optional<? extends Verifications> verifications) {
            Utils.checkNotNull(verifications, "verifications");
            this.verifications = verifications;
            return this;
        }

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = JsonNullable.of(username);
            return this;
        }

        public Builder username(JsonNullable<String> username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }

        public Builder emailAddress(String emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = JsonNullable.of(emailAddress);
            return this;
        }

        public Builder emailAddress(JsonNullable<String> emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = JsonNullable.of(phoneNumber);
            return this;
        }

        public Builder phoneNumber(JsonNullable<String> phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder web3Wallet(String web3Wallet) {
            Utils.checkNotNull(web3Wallet, "web3Wallet");
            this.web3Wallet = JsonNullable.of(web3Wallet);
            return this;
        }

        public Builder web3Wallet(JsonNullable<String> web3Wallet) {
            Utils.checkNotNull(web3Wallet, "web3Wallet");
            this.web3Wallet = web3Wallet;
            return this;
        }

        public Builder passwordEnabled(boolean passwordEnabled) {
            Utils.checkNotNull(passwordEnabled, "passwordEnabled");
            this.passwordEnabled = passwordEnabled;
            return this;
        }

        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = JsonNullable.of(firstName);
            return this;
        }

        public Builder firstName(JsonNullable<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = JsonNullable.of(lastName);
            return this;
        }

        public Builder lastName(JsonNullable<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        public Builder unsafeMetadata(SignUpUnsafeMetadata unsafeMetadata) {
            Utils.checkNotNull(unsafeMetadata, "unsafeMetadata");
            this.unsafeMetadata = Optional.ofNullable(unsafeMetadata);
            return this;
        }

        public Builder unsafeMetadata(Optional<? extends SignUpUnsafeMetadata> unsafeMetadata) {
            Utils.checkNotNull(unsafeMetadata, "unsafeMetadata");
            this.unsafeMetadata = unsafeMetadata;
            return this;
        }

        public Builder publicMetadata(SignUpPublicMetadata publicMetadata) {
            Utils.checkNotNull(publicMetadata, "publicMetadata");
            this.publicMetadata = Optional.ofNullable(publicMetadata);
            return this;
        }

        public Builder publicMetadata(Optional<? extends SignUpPublicMetadata> publicMetadata) {
            Utils.checkNotNull(publicMetadata, "publicMetadata");
            this.publicMetadata = publicMetadata;
            return this;
        }

        public Builder customAction(boolean customAction) {
            Utils.checkNotNull(customAction, "customAction");
            this.customAction = customAction;
            return this;
        }

        public Builder externalId(String externalId) {
            Utils.checkNotNull(externalId, "externalId");
            this.externalId = JsonNullable.of(externalId);
            return this;
        }

        public Builder externalId(JsonNullable<String> externalId) {
            Utils.checkNotNull(externalId, "externalId");
            this.externalId = externalId;
            return this;
        }

        public Builder createdSessionId(String createdSessionId) {
            Utils.checkNotNull(createdSessionId, "createdSessionId");
            this.createdSessionId = JsonNullable.of(createdSessionId);
            return this;
        }

        public Builder createdSessionId(JsonNullable<String> createdSessionId) {
            Utils.checkNotNull(createdSessionId, "createdSessionId");
            this.createdSessionId = createdSessionId;
            return this;
        }

        public Builder createdUserId(String createdUserId) {
            Utils.checkNotNull(createdUserId, "createdUserId");
            this.createdUserId = JsonNullable.of(createdUserId);
            return this;
        }

        public Builder createdUserId(JsonNullable<String> createdUserId) {
            Utils.checkNotNull(createdUserId, "createdUserId");
            this.createdUserId = createdUserId;
            return this;
        }

        public Builder abandonAt(long abandonAt) {
            Utils.checkNotNull(abandonAt, "abandonAt");
            this.abandonAt = abandonAt;
            return this;
        }

        public Builder externalAccount(ExternalAccount externalAccount) {
            Utils.checkNotNull(externalAccount, "externalAccount");
            this.externalAccount = Optional.ofNullable(externalAccount);
            return this;
        }

        public Builder externalAccount(Optional<? extends ExternalAccount> externalAccount) {
            Utils.checkNotNull(externalAccount, "externalAccount");
            this.externalAccount = externalAccount;
            return this;
        }
        
        public SignUp build() {
            return new SignUp(
                object,
                id,
                status,
                requiredFields,
                optionalFields,
                missingFields,
                unverifiedFields,
                verifications,
                username,
                emailAddress,
                phoneNumber,
                web3Wallet,
                passwordEnabled,
                firstName,
                lastName,
                unsafeMetadata,
                publicMetadata,
                customAction,
                externalId,
                createdSessionId,
                createdUserId,
                abandonAt,
                externalAccount);
        }
    }
}

