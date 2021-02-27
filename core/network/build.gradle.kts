plugins {
    kotlin("jvm")
}

dependencies {
    implementation(libs.coroutines.core)
    implementation(libs.retrofit.retrofit)
    implementation(libs.retrofit.moshi)
}
