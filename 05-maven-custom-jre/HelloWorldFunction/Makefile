build-HelloWorldFunctionCustomJre:
	mvn clean package
	cp -r /jre17-slim $(ARTIFACTS_DIR)
	chmod +x bootstrap
	cp bootstrap $(ARTIFACTS_DIR)
	cp target/HelloWorldCustomJRE-1.0.jar $(ARTIFACTS_DIR)