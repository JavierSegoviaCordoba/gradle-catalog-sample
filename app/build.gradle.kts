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
    implementation(project(":core:network"))
    implementation(project(":features:user-detail"))
    implementation(project(":features:users"))

    implementation(Libs.activity)
    implementation(Libs.appcompat)
    implementation(Libs.material)

    implementation(Libs.retrofit)
}
