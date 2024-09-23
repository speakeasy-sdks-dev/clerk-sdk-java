/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.models.errors.SDKError;
import com.clerk.backend_api.utils.LazySingletonValue;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Long;
import java.util.Optional;
import java.util.stream.Stream;

public class ListOAuthApplicationsRequestBuilder {

    private Optional<Long> limit = Utils.readDefaultOrConstValue(
                            "limit",
                            "10",
                            new TypeReference<Optional<Long>>() {});
    private Optional<Long> offset = Utils.readDefaultOrConstValue(
                            "offset",
                            "0",
                            new TypeReference<Optional<Long>>() {});
    private final SDKMethodInterfaces.MethodCallListOAuthApplications sdk;

    public ListOAuthApplicationsRequestBuilder(SDKMethodInterfaces.MethodCallListOAuthApplications sdk) {
        this.sdk = sdk;
    }
                
    public ListOAuthApplicationsRequestBuilder limit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.of(limit);
        return this;
    }

    public ListOAuthApplicationsRequestBuilder limit(Optional<Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }
                
    public ListOAuthApplicationsRequestBuilder offset(long offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.of(offset);
        return this;
    }

    public ListOAuthApplicationsRequestBuilder offset(Optional<Long> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    public ListOAuthApplicationsResponse call() throws Exception {
        if (limit == null) {
            limit = _SINGLETON_VALUE_Limit.value();
        }
        if (offset == null) {
            offset = _SINGLETON_VALUE_Offset.value();
        }
        return sdk.list(
            limit,
            offset);
    }
    
    /**
     * Returns a stream that performs next page calls till no more pages
     * are returned. Unlike the {@link #call()} method this method will
     * throw an {@link SDKError} if any page retrieval has an HTTP status 
     * code >= 300 (Note that 3XX is not an error range but will need 
     * special handling by the user if for example the HTTP client is 
     * not configured to follow redirects).
     * 
     * @throws {@link SDKError} if HTTP status code >= 300 is encountered
     **/  
    public Stream<ListOAuthApplicationsResponse> callAsStream() {
        return Utils.stream(() -> Optional.of(call()), x -> {
            if (x.statusCode() >= 300) {
                byte[] body = Utils.toByteArrayAndClose(x.rawResponse().body());
                throw new SDKError(x.rawResponse(), x.statusCode(), x.contentType(), body);
            } else {
                return x.next();
            }
        });
    }

    private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Limit =
            new LazySingletonValue<>(
                    "limit",
                    "10",
                    new TypeReference<Optional<Long>>() {});

    private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Offset =
            new LazySingletonValue<>(
                    "offset",
                    "0",
                    new TypeReference<Optional<Long>>() {});
}
