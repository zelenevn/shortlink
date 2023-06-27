plugins {
    id("java")
}

group = "site.zelenev"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":shortlink-domain"))
    implementation("org.apache.commons:commons-lang3:3.12.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}