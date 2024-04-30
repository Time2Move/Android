import com.time2move.beuptou.configureHiltAndroid
import com.time2move.beuptou.configureKotestAndroid
import com.time2move.beuptou.configureKotlinAndroid

plugins {
    id("com.android.application")
}

configureKotlinAndroid()
configureHiltAndroid()
configureKotestAndroid()

// dependencies {
//    with(project.extensions.libs) {
//        implementation(findLibrary("androidx.compose.navigation").get())
//        implementation(findLibrary("androidx.lifecycle.viewModelCompose").get())
//        implementation(findLibrary("androidx.lifecycle.runtimeCompose").get())
//    }
// }
