plugins {
  id("com.grubhub.gradle.roux.service")
  id("com.grubhub.gradle.testing")
}

dependencies {
    implementation(project(":helloworld-api"))

    implementation("com.grubhub.roux5:roux-spring-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework:spring-web")

    implementation("com.grubhub.roux5:roux-metrics-spring")
    implementation("io.micrometer:micrometer-core")

    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

    testImplementation("com.grubhub.roux5:roux-test")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}