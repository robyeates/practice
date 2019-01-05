import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.11"
}

group = "io.robertyeates"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    // https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-test-junit
    testCompile("org.jetbrains.kotlin:kotlin-test-junit:1.3.11")

}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}