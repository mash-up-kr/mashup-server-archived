dependencies {
    implementation(project(":mashup-domain"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.jar {
    enabled = false
}
