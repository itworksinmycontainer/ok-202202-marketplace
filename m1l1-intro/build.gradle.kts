plugins {
    kotlin("jvm") version "1.6.10"
}

group = "ru.otus.otuskotlin.marketplace"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test-junit"))
}
