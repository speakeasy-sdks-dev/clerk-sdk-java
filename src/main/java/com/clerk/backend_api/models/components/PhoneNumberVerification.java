/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;


import com.clerk.backend_api.utils.OneOfDeserializer;
import com.clerk.backend_api.utils.TypedObject;
import com.clerk.backend_api.utils.Utils.JsonShape;
import com.clerk.backend_api.utils.Utils.TypeReferenceWithShape;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;


@JsonDeserialize(using = PhoneNumberVerification._Deserializer.class)
public class PhoneNumberVerification {

    @JsonValue
    private TypedObject value;
    
    private PhoneNumberVerification(TypedObject value) {
        this.value = value;
    }

    public static PhoneNumberVerification of(VerificationOTP value) {
        Utils.checkNotNull(value, "value");
        return new PhoneNumberVerification(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<VerificationOTP>(){}));
    }

    public static PhoneNumberVerification of(VerificationAdmin value) {
        Utils.checkNotNull(value, "value");
        return new PhoneNumberVerification(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<VerificationAdmin>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.clerk.backend_api.models.components.VerificationOTP}</li>
     * <li>{@code com.clerk.backend_api.models.components.VerificationAdmin}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PhoneNumberVerification other = (PhoneNumberVerification) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<PhoneNumberVerification> {

        public _Deserializer() {
            super(PhoneNumberVerification.class, false,
                  TypeReferenceWithShape.of(new TypeReference<com.clerk.backend_api.models.components.VerificationAdmin>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.clerk.backend_api.models.components.VerificationOTP>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(PhoneNumberVerification.class,
                "value", value);
    }
 
}
