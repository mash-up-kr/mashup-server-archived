import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.6.2"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	id("jacoco")
	kotlin("jvm") version "1.5.21"
	kotlin("plugin.spring") version "1.5.21"
}

buildscript {
	repositories {
		mavenCentral()
	}
}

group = "kr.mashup.branding"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

allprojects {
	repositories {
		mavenCentral()
	}
}

subprojects {
	apply(plugin = "org.springframework.boot")
	apply(plugin = "io.spring.dependency-management")
	apply(plugin = "java")
	apply(plugin = "kotlin")
	apply(plugin = "kotlin-kapt")
	apply(plugin = "kotlin-spring")
	apply(plugin = "jacoco")

	repositories {
		mavenCentral()
	}

	dependencies {
		implementation("org.springframework.boot:spring-boot-starter")
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
		implementation("org.jetbrains.kotlin:kotlin-reflect")
		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
		testImplementation("org.springframework.boot:spring-boot-starter-test")
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict")
			jvmTarget = "11"
		}
	}

	tasks.test {
		useJUnitPlatform()
		finalizedBy("jacocoTestReport")
	}

	tasks.jacocoTestReport {
		dependsOn("test")
		reports {
			xml.required.set(true)
			csv.required.set(false)
			html.required.set(true)
		}
	}
}

tasks.bootJar {
	enabled = false
}

jacoco {
	toolVersion = "0.8.7"
}