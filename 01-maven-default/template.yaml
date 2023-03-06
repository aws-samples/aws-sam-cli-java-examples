AWSTemplateFormatVersion: '2010-09-09'
Transform: AWS::Serverless-2016-10-31
Description: >
  Example of deploying a Serverless Java app via AWS SAM


Resources:
  HelloWorldFunction:
    Type: AWS::Serverless::Function 
    Properties:
      FunctionName: 01-maven-default
      CodeUri: HelloWorldFunction/
      Handler: helloworld.App::handleRequest
      Runtime: java11
      Timeout: 20
      Architectures:
        - x86_64
      MemorySize: 1024
      Environment: 
        Variables:
          JAVA_TOOL_OPTIONS: -XX:+TieredCompilation -XX:TieredStopAtLevel=1

Outputs:
  HelloWorldFunction:
    Description: "Hello World Lambda Function ARN"
    Value: !GetAtt HelloWorldFunction.Arn
