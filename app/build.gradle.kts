plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        minSdkVersion(21)

        applicationId = "com.javiersc.catalogs.sample.app"

        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    projects.apply {
        implementation(core.network)

        features.apply {
            implementation(userDetail)
            implementation(users)
        }
    }

    androidLibs.apply {
        implementation(activity)
        implementation(appcompat)
        implementation(material)
    }

    jvmLibs.apply { implementation(retrofit.retrofit) }
}
