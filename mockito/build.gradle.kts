plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // Mockito Core
    testImplementation ("org.mockito:mockito-core:4.0.0")

    // Mockito JUnit 5 Integration
    testImplementation ("org.mockito:mockito-junit-jupiter:4.0.0")
}

tasks.test {
    useJUnitPlatform()
}