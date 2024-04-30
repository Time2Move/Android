import com.time2move.beuptou.configureHiltAndroid
import com.time2move.beuptou.libs

plugins {
    id("time2move.android.library")
    id("time2move.android.compose")
}

android {
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJunitRunner"
    }
}

configureHiltAndroid()

dependencies {
    with(project.extensions.libs) {
//    implementation(project(""))
        implementation(findLibrary("hilt.navigation.compose").get())
        implementation(findLibrary("androidx.compose.navigation").get())
        androidTestImplementation(findLibrary("androidx.compose.navigation.test").get())

        implementation(findLibrary("androidx.lifecycle.viewModelCompose").get())
        implementation(findLibrary("androidx.lifecycle.runtimeCompose").get())
    }
}
