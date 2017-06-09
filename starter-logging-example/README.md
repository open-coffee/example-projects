# Starter Logging Example Project

This is an example project to show the behaviour of the logging starter.

Normally the activation of the logging appenders are based on the
CoffeeNet profile `coffeenet.profile` in your application properties file.
In this example project all appenders has been activated for demonstration
purposes.

## Graylog (GELF appender)

Please start the provided graylog docker containers with

```bash
./docker-compose up
```

and wait until it is fully started.
Now on
```
http://localhost:9000 (admin/admin)
```
the graylogserver
is available. Log in and  configure an UDP Input:

```
System -> Inputs ->  Select 'GELF UDP' -> 'Launch new input' with following configuration

Global: true
Title: CoffeeNet Starter Logging Test

and take the defaults.
```

after you start this application, the application can push the
logs via udp packages to the graylog through the 12201 port.


## File

You can see the file logging in the `logs/` directory.

## Console

The default console logging behaviour is also activated.


## Trigger logs?

You can trigger logs through:

```
http://localhost:8080
```