plugins {
	kotlin("multiplatform")
}

group = "fr.ayfri"
version = "1.0-SNAPSHOT"

repositories {
	google()
	mavenCentral()
	maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
	js {
		browser {
			commonWebpackConfig {
				devServer?.open = false
				sourceMaps = true
			}
		}
		useEsModules()
		binaries.executable()
	}
}
