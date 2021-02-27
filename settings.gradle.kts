
rootProject.name = "gradle-catalog-sample"

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
