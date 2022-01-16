dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    runtimeOnly("com.h2database:h2")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
}

tasks.jar {
    enabled = true
}

tasks.bootJar {
    enabled = false
}
