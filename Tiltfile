# OS Identification
#gradlew = "./gradlew"
mvnw = "./mvnw"
expected_ref = "$EXPECTED_REF"
if os.name == "nt":
  #gradlew = "gradlew.bat"
  mvnw = "mvnw"
  expected_ref = "%EXPECTED_REF%"
  
# Build
custom_build(
    # Name of the container image
    ref = 'order-service',
	# Command to build the container image
    command = mvnw + ' spring-boot:build-image -DskipTests=true -Dspring-boot.build-image.imageName=' + expected_ref,
	# Files to watch that trigger a new build
    deps = ['pom.xml', 'src']
    # Command to build the container image
    # command = gradlew + ' bootBuildImage --imageName ' + expected_ref,
    # Files to watch that trigger a new build
    # deps = ['build.gradle', 'src']
)

# Deploy
k8s_yaml(['k8s/deployment.yml', 'k8s/service.yml'])

# Manage
k8s_resource('order-service', port_forwards=['9002'])