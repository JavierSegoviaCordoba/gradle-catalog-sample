
rootProject.name = "gradle-catalog-sample"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        jcenter()
        google()
        gradlePluginPortal()
    }

    versionCatalogs {
        val activity = "1.2.0"
        val appcompat = "1.2.0"
        val coroutines = "1.4.2"
        val fragment = "1.3.0"
        val material = "1.3.0"
        val recyclerView = "1.1.0"
        val retrofit = "2.9.0"

        create("androidLibs") {
            alias("activity").to("androidx.activity:activity:$activity")
            alias("appcompat").to("androidx.appcompat", "appcompat").version(appcompat)
            alias("coroutines")
                .to("org.jetbrains.kotlinx", "kotlinx-coroutines-android")
                .version(coroutines)
            alias("fragment").to("androidx.fragment", "fragment-ktx").version(fragment)
            alias("material").to("com.google.android.material", "material").version(material)
            alias("recyclerView").to("androidx.recyclerview", "recyclerview").version(recyclerView)

            bundle(
                "feature",
                listOf(
                    "appcompat",
                    "coroutines",
                    "fragment",
                    "material",
                ),
            )
        }
        create("jvmLibs") {
            alias("coroutines")
                .to("org.jetbrains.kotlinx", "kotlinx-coroutines-core")
                .version(coroutines)
            alias("retrofit-retrofit").to("com.squareup.retrofit2", "retrofit").version(retrofit)
            alias("retrofit-moshi")
                .to("com.squareup.retrofit2", "converter-moshi")
                .version(retrofit)

            bundle(
                "network",
                listOf(
                    "coroutines",
                    "retrofit-retrofit",
                    "retrofit-moshi",
                ),
            )
        }
    }
}

include(":app")

include(":core:network")

include(":features:users")
include(":features:user-detail")
