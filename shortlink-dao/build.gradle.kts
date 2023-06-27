plugins {
    id("java")
}

group = "site.zelenev"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":shortlink-usecase"))
    implementation(project(":shortlink-domain"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.1.1")
    implementation("com.h2database:h2:2.1.214")
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