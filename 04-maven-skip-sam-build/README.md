## [04-maven-skip-sam-build]: Building a native executable using GraalVM, run inside a custom docker container

## Instructions

Build the package on your own via:

```bash
mvn clean package -f HelloWorldFunction/pom.xml
```

Depoy the application directly without sam build:

```bash
sam deploy
```

Test the application:


```bash
sam deploy
```