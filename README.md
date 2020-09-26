# ExamenCalculator


Minima version [Spring Boot](http://projects.spring.io/spring-boot/) 2.3.4.RELEASE.

## Requerimientos

Para construir la aplicación necesitamos:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3.6.3](https://maven.apache.org)

## Ejecutar la aplicación en un ambiente local

Una vez contando con las dependencias sólo se deberá hacer lo siguiente:

```shell
mvn install
mvn spring-boot:run
```

## Ejemplos Para consumir

```java
SUMA

http://localhost:8080/calculator/suma?firstParam=2&secondParam=10.4

RESTA

http://localhost:8080/calculator/resta?firstParam=2&secondParam=10.4

MULTIPLICACIÓN

http://localhost:8080/calculator/multiplicacion?firstParam=2&secondParam=10.4

DIVISIÓN

http://localhost:8080/calculator/division?firstParam=2&secondParam=10.4
```