plugins {
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

base {
    archivesBaseName = property("archivesBaseName") as String
    group = property("mavenGroup") as String
    version = property("projectVersion") as String
    description = "Modify server ping data to EZ"
}

tasks {
    processResources {
        expand("version" to project.version, "description" to project.description)
    }

    withType<JavaCompile> {
        options.encoding = Charsets.UTF_8.name()
    }

    test {
        useJUnitPlatform()
    }
}

repositories {
    maven(url = "https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    /* Paper API */
    val bukkitAPIVersion: String by project
    compileOnly("com.destroystokyo.paper", "paper-api", bukkitAPIVersion)
    testImplementation("com.destroystokyo.paper", "paper-api", bukkitAPIVersion)

    /* JUnit */
    val jUnitVersion: String by project
    testImplementation("org.junit.jupiter", "junit-jupiter-api", jUnitVersion)
    testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", jUnitVersion)
}
