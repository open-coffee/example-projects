# Starter Discovery Example Project

This is an example project to show the behaviour of the discovery starter.

You an starter this application with the following spring profile:

* `integration` to use the `CoffeeNetAppService` with an implementation that calls the discovery service
* `development` to use the `CoffeeNetAppService` with a mock implementation

## Integration Profile

Please start the provided eureka (service discovery server) docker containers with

```bash
./docker-compose up
```

Now on http://localhost:8761 the service discovery server is available and
after you start this application, this application will register itself

You can see all registered applications on

```
http://localhost:8090 or
http://localhost:8090/filtered
```

On `/filtered` you see only applications that can be accessed with
the role `SPECIAL`, that is why there is no application listed.
Because the `Discovery Sever` have the role `COFFEENET-ADMIN`.

## Development Profile

Just start this application and see the mocked applications
"registered" at the "service discovery server"

```
http://localhost:8090  or
http://localhost:8090/filtered
```

In development mode the mock is not so intelligent to
filter the applications, so you always see all of them.
