dependencies {
    implementation(project(":mashup-domain"))

    // spring
    implementation("org.springframework.boot:spring-boot-starter-web")

    // library
    implementation("io.springfox:springfox-boot-starter:3.0.0")
}

tasks.jar {
    enabled = false
}
