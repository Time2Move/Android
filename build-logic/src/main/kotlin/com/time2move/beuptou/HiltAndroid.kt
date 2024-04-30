package com.time2move.beuptou

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureHiltAndroid() {
    with(pluginManager) {
        apply("dagger.hilt.android.plugin")
        apply("org.jetbrains.kotlin.kapt")
    }

    with(extensions.libs) {
        dependencies {
            "implementation"(findLibrary("hilt.android").get())
            "kapt"(findLibrary("hilt.android.compiler").get())
            "kaptAndroidTest"(findLibrary("hilt.android.compiler").get())
        }
    }
}

internal class HiltAndroidPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.configureHiltAndroid()
    }
}
