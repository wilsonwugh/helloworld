plugins {
  id("com.grubhub.gradle.roux.service")
}


dependencies {
    implementation("com.grubhub.roux5:roux-api")
    implementation("com.grubhub.roux5:roux-rpc-api")
    implementation("com.grubhub.roux5:roux-shared")
    implementation("com.grubhub.roux5:roux-discovery-annotations-spring")
    implementation("org.springframework:spring-web")
}