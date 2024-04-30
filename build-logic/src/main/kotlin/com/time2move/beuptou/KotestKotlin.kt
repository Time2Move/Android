package com.time2move.beuptou

import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.withType

internal fun Project.configureKotest() {
    configureJunit()
    with(extensions.libs) {
        dependencies {
            "testImplementation"(findLibrary("kotest.runner").get())
            "testImplementation"(findLibrary("kotest.assertions").get())
        }
    }
}

internal fun Project.configureJunit() {
    tasks.withType<Test>().configureEach(Test::useJUnitPlatform)
}