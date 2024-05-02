plugins {
    id("time2move.android.library-no-hilt")
    id("time2move.android.compose")
}

android {
    namespace = "com.time2move.beuptou.feature.main.nav"
}

dependencies {
    implementation(libs.androidx.compose.navigation)
}
