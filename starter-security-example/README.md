# Starter Security Example Project

This is an example project to show the behaviour of the security starter.

You an starter this application with the following spring profile:

* `integration` will authenticate this application against the CoffeeNet Auth Server
* `development` will authenticate this application against local authentication

## Integration Profile

Please start the provided ldap and mariaDB docker containers with

```bash
./docker-compose up
```

Now on the CoffeeNet Auth Server is available with all its dependencies (ldap, mariaDB).

This example project is fully secure except of the http://localhost:8094/not-secure endpoints
that was made available for everyone through the `SecurityIntegrationProfileConfiguration`.

If you want all endpoints to be secure, you do _not_ have to create your own security configuration,
because by **default all endpoints are secured**. See the development profile example.

The endpoints http://localhost:8094 is still secure and needs authentication against the
**CoffeeNet Auth Server**.

#### Logout

CoffeeNet Auth Server on http://localhost:9999/logout and delete the cookie on localhost:8094


## Development Profile

Also in _development_ mode the complete application is already secured by the provided
`DevelopmentCoffeeNetWebSecurityConfigurerAdapter` but not against the CoffeeNet Auth Server
rather against a local spring security with predefined users. There are _no_ access roles defined
for the endpoint `/admin` like in the `SecurityIntegrationProfileConfiguration`.


#### Logout

Go to http://localhost:8094/logout

## Users

..to login with both provided profiles.

Admin user with COFFEENET-ADMIN & USER role:
```
Username: admin
Password: admin
```

Normal user with USER role:
```
Username: user
Password: user
```

as described in the security starters documentation.