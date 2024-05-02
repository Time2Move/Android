import com.time2move.beuptou.libs

plugins {
    id("time2move.android.library-no-hilt")
    id("time2move.android.compose")
}

android {
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    with(project.extensions.libs) {
        implementation(findLibrary("androidx.compose.navigation").get())
        androidTestImplementation(findLibrary("androidx.compose.navigation.test").get())
    }
}
