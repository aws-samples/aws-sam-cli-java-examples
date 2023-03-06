# 04-maven-skip-sam-build

## Description

Deploying a jar file that has been built outside the SAM build process

![Overview](../resources/sam_skip.png)

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

## Reference

Please follow the [blog post]() for additional information.