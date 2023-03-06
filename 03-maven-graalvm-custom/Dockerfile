#Use the official AWS SAM base image or Amazon Linux 2 as a starting point
FROM public.ecr.aws/sam/build-java11:latest-x86_64

#Install GraalVM dependencies
ENV GRAAL_VERSION 22.2.0
ENV GRAAL_FOLDERNAME graalvm-ce-java11-${GRAAL_VERSION}
ENV GRAAL_FILENAME graalvm-ce-java11-linux-amd64-${GRAAL_VERSION}.tar.gz
RUN curl -4 -L https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.2.0/graalvm-ce-java11-linux-amd64-22.2.0.tar.gz | tar -xvz
RUN mv $GRAAL_FOLDERNAME /usr/lib/graalvm
RUN rm -rf $GRAAL_FOLDERNAME

#Install Native Image dependencies
RUN /usr/lib/graalvm/bin/gu install native-image
RUN ln -s /usr/lib/graalvm/bin/native-image /usr/bin/native-image
RUN ln -s /usr/lib/maven/bin/mvn /usr/bin/mvn

#Set GraalVM as default
ENV JAVA_HOME /usr/lib/graalvm