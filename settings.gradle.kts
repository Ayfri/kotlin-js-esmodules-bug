pluginManagement {
	repositories {
		google()
		gradlePluginPortal()
		mavenCentral()
		maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
	}

	plugins {
		kotlin("js").version(extra["kotlin.version"] as String)
	}
}

rootProject.name = "test-js-bug"