#Use the official AWS SAM base image or Amazon Linux 2 as a starting point
FROM public.ecr.aws/sam/build-provided.al2

# Add the Amazon Corretto repository
RUN rpm --import https://yum.corretto.aws/corretto.key
RUN curl -L -o /etc/yum.repos.d/corretto.repo https://yum.corretto.aws/corretto.repo

# Update the packages and install Amazon Corretto 17
RUN yum -y update
RUN yum install -y java-17-amazon-corretto-jmods

# Install newer Maven version
RUN curl -4 -L https://archive.apache.org/dist/maven/maven-3/3.8.8/binaries/apache-maven-3.8.8-bin.tar.gz | tar -xvz
RUN mv apache-maven-3.8.8 /usr/lib/maven
ENV M2_HOME=/usr/lib/maven
ENV PATH=${PATH}:${M2_HOME}/bin

# Set Java Home to Corretto 17
ENV JAVA_HOME /usr/lib/jvm/java-17-amazon-corretto

# Create Minified JRE with reduced modules (--add-modules contains only the modules relevant for this app)
# If you want to use this for your own app you need to first collect the needed modules
RUN jlink --verbose --compress 2 --strip-java-debug-attributes --no-header-files --no-man-pages --output /jre17-slim --add-modules java.base,java.sql,jdk.unsupported
RUN /jre17-slim/bin/java -Xshare:dump