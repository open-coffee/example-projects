# Integration profile example project

This is an example project to show how to use the **integration** profile.
The **integration** profile was created to develop applications _with_ external dependencies.
All external dependencies like the [authentication server](https://github.com/coffeenet/coffeenet-auth) and the
[service discovery](https://github.com/coffeenet/coffeenet-discovery) have to be provided.
You can use the [dockerized](https://github.com/coffeenet/coffeenet-dockerized) project or
just start each application you need by hand.

All default configurations are preconfigured with _http://localhost:${port}_ so you can just start the
application and their dependencies and start coding. If you want to change the default values you can override them
in the default properties file. You find all default values in the Readmes of the specific starters.

The **integration** an be activated in the configuration file with

```yaml
coffeenet:
  profile: integration
```

Before you add the _CoffeeNet starters_ to your pom you can use the _CoffeeNet parent_ to fix the versions.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    ...

    <parent>
        <groupId>coffee.synyx</groupId>
        <artifactId>coffeenet-starter-parent</artifactId>
        <version>0.19.0</version>
    </parent>

    ...

</project>
```

## Security

Just add [security starter](https://github.com/coffeenet/coffeenet-starter/tree/master/coffeenet-starter-sso) to you pom
and the security is ready.

```xml
<dependency>
    <groupId>coffee.synyx</groupId>
    <artifactId>starter-sso</artifactId>
</dependency>
```

and add the preconfigured _client-id_ and _client-secret_ to your default properties file.
These client information will be added when the
[development mode](https://github.com/coffeenet/coffeenet-auth/blob/master/README.md#development-mode)
of the auth server is activated.

```yaml
coffeenet:
  application-name: ExampleProjectWithIntegrationProfile
  profile: integration
  security:
    client:
      client-id: coffeeNetClient
      client-secret: coffeeNetClientSecret
```

## Service Discovery

Just add the [discovery starter](https://github.com/coffeenet/coffeenet-starter/tree/master/coffeenet-starter-discovery) to your pom
and the discovery server will be configured for you.

```xml
<dependency>
    <groupId>coffee.synyx</groupId>
    <artifactId>starter-discovery</artifactId>
</dependency>
```

## Logging

If you want to have a consistent logging through you applications
with direct support to your graylog all you have to add is the
[logging starter](https://github.com/coffeenet/coffeenet-starter/tree/master/coffeenet-starter-logging) dependency

```xml
<dependency>
    <groupId>coffee.synyx</groupId>
    <artifactId>starter-logging</artifactId>
</dependency>
```

## Web

Now we want an consistent look and feel through all our applications and for that we just add one of the
[web starters](https://github.com/coffeenet/coffeenet-starter/) dependencies.

If we want e.g. a server side rendered application with thymeleaf we use the provided
[web thymeleaf starter](https://github.com/coffeenet/coffeenet-starter/tree/master/coffeenet-starter-web-thymeleaf).

```xml
<dependency>
    <groupId>coffee.synyx</groupId>
    <artifactId>starter-web-thymeleaf</artifactId>
</dependency>
```


All information about the configuration for each [starter](https://github.com/coffeenet/coffeenet-starter/)
are described in the specific starters.