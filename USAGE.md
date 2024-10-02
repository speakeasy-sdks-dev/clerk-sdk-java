<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.clerk.backend_api.Clerk;
import com.clerk.backend_api.models.errors.ClerkErrors;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClerkErrors, Exception {

        Clerk sdk = Clerk.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        sdk.clients().list()
                .limit(10L)
                .offset(0L)
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Create Actor Tokens

This example shows how to create an actor token that can be used to impersonate the given user.

```java
package hello.world;

import com.clerk.backend_api.Clerk;
import com.clerk.backend_api.models.errors.ClerkErrors44;
import com.clerk.backend_api.models.operations.CreateActorTokenRequestBody;
import com.clerk.backend_api.models.operations.CreateActorTokenResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws ClerkErrors44, Exception {

        Clerk sdk = Clerk.builder()
                .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CreateActorTokenRequestBody req = CreateActorTokenRequestBody.builder()
                .userId("<id>")
                .actor(Map.ofEntries(
                    Map.entry("sub", "user_2OEpKhcCN1Lat9NQ0G6puh7q5Rb")))
                .build();

        CreateActorTokenResponse res = sdk.actors().createToken()
                .request(req)
                .call();

        if (res.actorToken().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->