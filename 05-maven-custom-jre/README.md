# 03-maven-graalvm-customer

## Description

Building a custom JRE inside a customer container image

![Overview](../resources/sam_container.png)

## Instructions

Build a custom build image as referenced in the [Dockerfile](Dockerfile).

```bash
docker build . -t sam/custom-jre17
```

Build the application via the custom build image:

```bash
sam build --use-container --build-image sam/custom-jre17
```

Deploy the application:

```bash
sam deploy --guided
```

Test the application:

```bash
aws lambda invoke --function-name 05-maven-custom-jre /dev/stdout | cat
```

## Reference

Please follow the [blog post](https://aws.amazon.com/blogs/compute/building-serverless-java-applications-with-the-aws-sam-cli/) for additional information.