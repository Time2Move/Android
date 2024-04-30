package com.time2move.beuptou

import org.gradle.api.Project

internal fun Project.configureKotestAndroid() {
    configureKotest()
    configureJunitAndroid()
}

internal fun Project.configureJunitAndroid() {
    androidExtension.apply {
        testOptions {
            unitTests.all { it.useJUnitPlatform() }
        }
    }
}
