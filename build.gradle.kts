import org.gradle.api.publish.PublishingExtension

plugins {
    `build-scan`
    `maven-publish`
    kotlin("jvm") version "1.2.71"
}

group = "com.ampnet.aeppsdk"
version = "0.0.1"

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.1.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.1.1")
}