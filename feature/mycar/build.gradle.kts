plugins {
    id("time2move.android.feature")
}

android {
    namespace = "com.time2move.beuptou.feature.mycar"
}

dependencies {
    implementation(projects.feature.mycarApi)
}
