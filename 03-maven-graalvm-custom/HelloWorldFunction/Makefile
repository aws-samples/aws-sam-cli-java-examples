build-HelloWorldFunctionGraalVM:
	mvn clean package -Pnative
	chmod +x target/native
	cp target/native $(ARTIFACTS_DIR)
	chmod +x bootstrap
	cp bootstrap $(ARTIFACTS_DIR)