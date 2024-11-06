plugins {
  id("base")
}

subprojects {
 apply {
        plugin("java")
        plugin("java-library")
        plugin("com.grubhub.gradle.checks.project")
 }

 tasks.withType<JavaCompile> {
        sourceCompatibility = JavaVersion.VERSION_17.toString()
        targetCompatibility = JavaVersion.VERSION_17.toString()
 }

 tasks.withType<Test> {
        useJUnitPlatform()
 }
}

tasks.wrapper {
    distributionUrl =
        "https://grubhub.jfrog.io/artifactory/garcon-service-dependencies/grubhub-gradle/gradle-8.7-grubhub-5.0.0.zip"
}
