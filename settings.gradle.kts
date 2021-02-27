
rootProject.name = "gradle-catalog-sample"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        jcenter()
        google()
        gradlePluginPortal()
    }
}

include(":app")

include(":core:network")

include(":features:users")
include(":features:user-detail")
