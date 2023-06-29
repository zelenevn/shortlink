plugins {
    java
    id("org.springframework.boot") version "3.1.1"
}

group = "site.zelenev"
version = "1.0.0"

repositories {
    mavenCentral()
}

val springBootStarterWebVersion: String by project

dependencies {
    implementation(project(":shortlink-api"))
    implementation(project(":shortlink-usecase"))
    implementation(project(":shortlink-dao"))
    implementation(project(":shortlink-domain"))

    implementation("org.springframework.boot:spring-boot-starter-web:$springBootStarterWebVersion")
    compileOnly("org.projectlombok:lombok:1.18.28")
    annotationProcessor("org.projectlombok:lombok:1.18.28")
    implementation("org.mapstruct:mapstruct:1.5.5.Final")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.5.Final")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}