## [03-maven-graalvm-custom]: Building a native executable using GraalVM, run inside a custom docker container

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