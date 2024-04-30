import com.time2move.beuptou.configureHiltAndroid
import com.time2move.beuptou.configureKotest
import com.time2move.beuptou.configureKotlinAndroid

plugins {
    id("com.android.library")
}

configureKotlinAndroid()
configureKotest()
configureHiltAndroid()