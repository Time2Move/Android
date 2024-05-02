import com.time2move.beuptou.configureCoroutineAndroid
import com.time2move.beuptou.configureKotest
import com.time2move.beuptou.configureKotlinAndroid

plugins {
    id("com.android.library")
}

configureKotlinAndroid()
configureKotest()
configureCoroutineAndroid()
