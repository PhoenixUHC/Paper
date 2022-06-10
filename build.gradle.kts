plugins {
    java
    `java-library`
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "java-library")

    repositories {
        mavenCentral()
        maven("https://repo.md-5.net/content/repositories/releases/")
        maven("https://repo.rocco.dev/repository/releases/")
        maven("https://repo.rocco.dev/repository/snapshots/")
    }

    dependencies {
        api("commons-lang:commons-lang:2.6")
        api("com.google.guava:guava:31.1-jre")
        api("org.avaje:ebean:2.8.1")
        api("org.yaml:snakeyaml:1.30")
        api("net.md-5:bungeecord-chat:1.8-SNAPSHOT")
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
}
