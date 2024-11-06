plugins {
    id("scala")
    id("com.grubhub.gradle.grublish.bigtests")
    id("com.grubhub.garcon.roux-big-testing")
    id("com.grubhub.gradle.testing")
    id("com.grubhub.gradle.roux.service")
    id("io.freefair.lombok")
}

ext {
    set("gatlingInMainSource", true)
}

dependencies {
    implementation(project(":helloworld-api")) {
        exclude(module = "guava")
    }
    implementation("com.fasterxml.jackson.core:jackson-databind")
    implementation("com.grubhub.roux5:roux-big-tests-gatling")
}
