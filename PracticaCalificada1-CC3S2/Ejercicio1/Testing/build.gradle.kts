plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.8.2") //Agrega la API de JUnit
    testImplementation ("org.junit.jupiter:junit-jupiter-params:5.8.2") //Permite metodos de prueba parametrizados
    testImplementation ("org.assertj:assertj-core:3.23.1") //Agrega asserJ al proyecto

    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.8.2") //Motor de JUnit
}

tasks.test {
    useJUnitPlatform()
}