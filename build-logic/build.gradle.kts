plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

dependencies {
    implementation(libs.tools.build.gradle)
    implementation(libs.kotlin.gradle.plugin)
//    implementation(libs.verify.detektPlugin)
}

//gradlePlugin {
//    plugins {
//        register("androidHilt") {
//            id = "time2move.android.hilt"
//            implementationClass = "com.time2move.beuptou.HiltAndroidPlugin"
//        }
//        register("kotlinHilt") {
//            id = "time2move.kotlin.hilt"
//            implementationClass = "com.time2move.beuptou.HiltKotlinPlugin"
//        }
//    }
//}
