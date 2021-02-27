plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        minSdkVersion(21)

        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    libs.apply {
        android.apply {
            implementation(appcompat)
            implementation(fragment)
            implementation(material)
            implementation(recyclerView)
        }
        coroutines.apply { implementation(android) }
    }
}
