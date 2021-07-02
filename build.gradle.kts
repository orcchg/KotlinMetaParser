plugins {
	id("org.jetbrains.kotlin.jvm") version "1.4.32" 
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.3.0")
}

application {
    mainClass.set("com.orcchg.ktmetaparser.KtModuleMetaParserKt")
}
