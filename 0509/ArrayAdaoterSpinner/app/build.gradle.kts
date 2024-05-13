plugins {
<<<<<<< HEAD
    alias(libs.plugins.androidApplication)
=======
    alias(libs.plugins.android.application)
>>>>>>> 4edeee94cdaa5e74a5aaaa2ab9346fbb81760974
}

android {
    namespace = "com.example.arrayadaoterspinner"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.arrayadaoterspinner"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
<<<<<<< HEAD
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
=======
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
>>>>>>> 4edeee94cdaa5e74a5aaaa2ab9346fbb81760974
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}