object Dependencies {
    const val androidAppCompat = "androidx.appcompat:appcompat:${Versions.androidAppCompat}"
    const val androidConstraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.androidConstraintLayout}"
    const val androidCore = "androidx.core:core:${Versions.androidCore}"
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
    const val junit = "junit:junit:${Versions.junit}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinStdLib}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinStdLib}"
    const val materialDesign = "com.google.android.material:material:${Versions.materialDesign}"
    const val androidKtx = "androidx.core:core-ktx:${Versions.androidKtxVersion}"
    const val shimmer = "com.facebook.shimmer:shimmer:${Versions.shimmerVersion}"
    const val lifecycle = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycleVersion}"
    const val compatibilityValidator = "org.jetbrains.kotlinx:binary-compatibility-validator:${Versions.validatorVersion}"
    const val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    const val androidRecyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerViewVersion}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"
    const val safeArgsPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigationVersion}"
}

object Versions {
    internal const val androidAppCompat = "1.0.2"
    internal const val androidConstraintLayout = "2.0.0-beta5"
    internal const val androidCore = "1.0.2"
    internal const val androidGradlePlugin = "3.6.3"
    internal const val junit = "4.12"
    internal const val kotlinStdLib = "1.3.72"
    internal const val materialDesign = "1.3.0-alpha01"
    internal const val androidKtxVersion = "0.1"
    internal const val shimmerVersion = "0.5.0"
    internal const val lifecycleVersion = "2.2.0"
    internal const val validatorVersion = "0.2.3"
    internal const val coroutinesVersion = "1.3.7"
    internal const val recyclerViewVersion = "1.1.0"
    internal const val navigationVersion = "2.3.0-beta01"
}

object Kotlin {
    const val version = "1.3.72"
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
    const val plugin = "kotlin"
    const val androidPlugin = "kotlin-android"
    const val androidExtensionsPlugin = "kotlin-android-extensions"
}

object Android {
    const val appPlugin = "com.android.application"
    const val libPlugin = "com.android.library"
}

object Release {
    object MavenPublish {
        const val plugin = "maven-publish"
    }

    object Bintray {
        const val version = "1.8.5"
        const val plugin = "com.jfrog.bintray"
    }
}

object Developer {
    const val id = "ericktijerou"
    const val name = "Erick Tijero"
}

object Koleton {
    const val name = "koleton"
    const val description = "The easiest library to show skeleton screens in an Android app."
    const val licenseName = "Apache-2.0"
    const val licenseUrl = "https://www.apache.org/licenses/LICENSE-2.0.txt"
    const val mainModule = "koleton-singleton"
}