plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.hilt) version libs.versions.hilt apply false

    alias(libs.plugins.ksp) version libs.versions.ksp apply false
    alias(libs.plugins.jvm) version libs.versions.kotlin apply false
}