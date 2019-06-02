plugins {
    base
}

allprojects {
    repositories {
        mavenCentral()
    }
}

buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.3.31"))
    }
}