val swaggerVersion: String by project

dependencies {
    implementation(project(":mashup-domain"))

    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("io.springfox:springfox-boot-starter:$swaggerVersion")
}

tasks.jar {
    enabled = false
}
