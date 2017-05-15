# Example Project

This is an example project to show how to use the **development** profile.
The **development** profile was created to develop applications _without_ external dependencies, e.g. for local development.
All external dependencies like the [authentication server](https://github.com/coffeenet/coffeenet-auth) and the
[service discovery](https://github.com/coffeenet/coffeenet-discovery) are mocked.

The **development** an be activated in the configuration file with

```yaml
coffeenet:
  profile: development
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

The CoffeeNet provides, when the [CoffeeNetCurrentUserService](https://github.com/coffeenet/coffeenet-starter/blob/master/coffeenet-autoconfigure/src/main/java/coffee/synyx/autoconfigure/security/service/DevelopmentCoffeeNetCurrentUserService.java)
to the [authentication server](https://github.com/coffeenet/coffeenet-auth) is mocked,
[two default logins](https://github.com/coffeenet/coffeenet-starter/tree/master/coffeenet-starter-sso#aktivierung-des-single-sign-ons) will be provided.
One is the _admin_ with the role _COFFEENET-ADMIN_ and the other one is the _user_ with the role _COFFEENET-USER_.

## Service Discovery

Same here. Just add the [discovery starter](https://github.com/coffeenet/coffeenet-starter/tree/master/coffeenet-starter-discovery) to your pom.

```xml
<dependency>
    <groupId>coffee.synyx</groupId>
    <artifactId>starter-discovery</artifactId>
</dependency>
```

When the [service discovery](https://github.com/coffeenet/coffeenet-discovery) is mocked a specific development
[CoffeeNetAppService](https://github.com/coffeenet/coffeenet-starter/blob/master/coffeenet-autoconfigure/src/main/java/coffee/synyx/autoconfigure/discovery/service/DevelopmentCoffeeNetAppService.java)
will be injected and provides three predefined _CoffeeNetApps_ with different roles and information.


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


All information about the configuration per [starter](https://github.com/coffeenet/coffeenet-starter/)
are described in the specific starters.