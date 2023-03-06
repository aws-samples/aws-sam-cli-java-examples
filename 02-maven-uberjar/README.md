# 02-maven-uberjar

## Description

Using maven-shade-plugin to package an uber-jar and deploy to AWS Lambda using a Makefile

## Instructions

Build the application via the [Makefile](HelloWorldFunction/Makefile) referenced in the [template.yaml](template.yaml).

```bash
sam build
```

Deploy the application via the standard deploy mechanism.

```bash
sam deploy
```

## Reference

Please follow the [blog post]() for additional information.

