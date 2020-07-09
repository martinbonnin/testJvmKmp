plugins {
    `java-library`
    kotlin("jvm")
}

dependencies {
    api(project(":mpp"))
    implementation(kotlin("stdlib"))
}
