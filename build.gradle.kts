import org.jetbrains.intellij.platform.gradle.TestFrameworkType

plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.9.24"
    id("org.jetbrains.intellij.platform") version "2.0.0-rc1"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    testImplementation("junit:junit:4.13.2")
    intellijPlatform {
        bundledPlugin("com.intellij.spring")
        testFramework(TestFrameworkType.Platform)
        intellijIdeaUltimate("242.20224.91")
    }
}

intellijPlatform {
    buildSearchableOptions = false
    instrumentCode = false
}
