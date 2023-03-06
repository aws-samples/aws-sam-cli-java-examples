# 03-maven-graalvm-customer

## Description

Building a native executable using GraalVM inside a custom Docker container

![Overview](../resources/sam_container.png)

## Instructions

Build a custom build image as referenced in the [Dockerfile](Dockerfile).

```bash
docker build . -t sam/custom-graal-image
```

Build the application via the custom build image:

```bash
sam build --use-container --build-image sam/custom-graal-image
```

Deploy the application:

```bash
sam deploy
```

Test the application:


```bash
sam deploy
```

## Reference

Please follow the [blog post]() for additional information.