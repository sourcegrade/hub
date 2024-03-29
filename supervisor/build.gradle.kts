plugins {
    application
    id("lab-ktor")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":lab-model"))
    implementation(libs.koin)
    implementation(libs.ktor.client.cio)
    implementation(libs.ktor.client.content.negotiation)
    implementation(libs.ktor.server.netty)
    implementation(libs.kubernetes.client)
    implementation(libs.logging.core)
    implementation(libs.logging.slf4jimpl)
}

application {
    mainClass.set("org.sourcegrade.lab.supervisor.MainKt")
}
