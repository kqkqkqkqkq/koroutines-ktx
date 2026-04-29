plugins {
    alias(libs.plugins.kotlin.jvm)
    `java-library`
    id("maven-publish")
    id("org.jetbrains.dokka") version "2.2.0"
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation(libs.junit.jupiter.engine)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    api(libs.commons.math3)
    implementation(libs.guava)

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
}

dokka {
    dokkaPublications.html {
        moduleName.set("Koroutines")
        moduleVersion.set(project.version.toString())
        outputDirectory.set(layout.buildDirectory.dir("dokka/html"))
    }
}

publishing {
    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])
            groupId = "com.github.kqkqkqkqkq"
            artifactId = "koroutines"
            version = "1.0.0"
        }
    }
}
