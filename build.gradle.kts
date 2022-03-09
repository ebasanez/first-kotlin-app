import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    id("com.diffplug.spotless") version "6.3.0"
    application
}

group = "com.bprojects.courses"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.diffplug.spotless:spotless-plugin-gradle:6.3.0") // Es un plugin que genera varias tareas de Gradle, siendo la más útil spotlessApply, que pasa el linter y aplica soluciones

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("com.tngtech.archunit:archunit:0.23.0")
}
application {
    mainClass.set("com.bprojects.courses.kotlin.ClassesAndMethods.kt")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

spotless {
    kotlin {
        ktlint() // El linter que usamos con una regla custom que hemos puesto
            .userData(
                mapOf(
                    "insert_final_newline" to "true"
                )
            )
    }
    kotlinGradle {
        ktlint()
    }
}

tasks.check {
    dependsOn(tasks.spotlessCheck)
}
