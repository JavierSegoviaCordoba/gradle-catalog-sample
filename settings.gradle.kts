
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
        create("androidLibs") {
            from(files("gradle/shared.versions.toml"))
            from(files("gradle/android.libs.versions.toml"))
        }
        create("jvmLibs") {
            from(files("gradle/shared.versions.toml"))
            from(files("gradle/jvm.libs.versions.toml"))
        }
    }
}

include(":app")

include(":core:network")

include(":features:users")
include(":features:user-detail")
