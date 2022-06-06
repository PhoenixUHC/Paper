plugins {
    java
}

subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
        maven("https://repo.md-5.net/content/repositories/releases/")
        maven("https://repo.rocco.dev/repository/releases/")
        maven("https://repo.rocco.dev/repository/snapshots/")
    }

    dependencies {
        implementation("commons-lang:commons-lang:2.6")
        implementation("com.google.guava:guava:31.1-jre")
        implementation("org.avaje:ebean:2.8.1")
        implementation("org.yaml:snakeyaml:1.30")
        implementation("net.md-5:bungeecord-chat:1.8-SNAPSHOT")
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
}
