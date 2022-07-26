import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20"
    `maven-publish`
    application
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "org.jisoo"
            artifactId = "gradle-gitrepo-dependencies-test"
            version = "1.0"

            from(components["java"])
        }
    }
}

group = "org.jisoo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.13.3")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.3")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}