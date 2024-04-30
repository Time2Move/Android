package com.time2move.beuptou

import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureComposeAndroid() {
    val libs = extensions.libs

    androidExtension.apply {
        buildFeatures {
            compose = true
        }

        composeOptions {
            kotlinCompilerExtensionVersion =
                libs.findVersion("androidxComposeCompiler").get().toString()
        }
    }

    with(libs) {
        dependencies {
            val bom = findLibrary("androidx-compose-bom").get()
            "implementation"(platform(bom))
            "androidTestImplementation"(platform(bom))

            "implementation"(findLibrary("androidx.activity.compose").get())
            "implementation"(findLibrary("androidx.ui").get())
            "implementation"(findLibrary("androidx.ui.graphics").get())
            "debugImplementation"(findLibrary("androidx.ui.tooling").get())
            "implementation"(findLibrary("androidx.ui.tooling.preview").get())
            "implementation"(findLibrary("androidx.material3").get())
            "debugImplementation"(findLibrary("androidx.ui.test.manifest").get())
        }
    }
}
