val projectName = "thanos"

plugins {
    id("org.springframework.boot") version "2.1.4.RELEASE"
    id("io.freefair.lombok") version "3.2.1"
    id("org.owasp.dependencycheck") version "5.0.0-M2"
    id("io.spring.dependency-management") version "1.0.7.RELEASE"
//    id("de.undercouch.download")
    idea
    base
    java
    checkstyle
    findbugs
    pmd
    jdepend
    jacoco
}

findbugs {
    isIgnoreFailures = true
}

pmd {
    isIgnoreFailures = true
}

jdepend {
    isIgnoreFailures = true
}


configure<JavaPluginConvention> {
    setSourceCompatibility(1.8)
    setTargetCompatibility(1.8)
}

allprojects {
    repositories {
        maven {
            url = uri("http://maven.aliyun.com/nexus/content/groups/public/")
        }
        maven {
            url = uri("http://maven.aliyun.com/nexus/content/repository/jcenter")
        }
//    mavenCentral()
    }
    group = "xyz.twocucao.thanos"

    version = "1.0"

}


subprojects {
    version = "1.0"
}

//tasks {
//    "bootJar"(BootJar::class) {
//        archiveName = projectName + "app.jar"
//    }
//
//    "bootRun"(BootRun::class) {
//        args("--spring.profiles.active=dev")
//    }
//}

dependencies {

    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-batch")
    implementation("org.springframework.boot:spring-boot-starter-cache")
    implementation("org.springframework.boot:spring-boot-starter-data-elasticsearch")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
    implementation("org.springframework.boot:spring-boot-starter-data-neo4j")
    implementation("org.springframework.boot:spring-boot-starter-data-redis")
    implementation("org.springframework.boot:spring-boot-starter-data-rest")
    implementation("org.springframework.boot:spring-boot-starter-mail")
    implementation("org.springframework.boot:spring-boot-starter-quartz")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-websocket")
    implementation("org.liquibase:liquibase-core")

    implementation("org.springframework.kafka:spring-kafka")
    implementation("org.springframework.retry:spring-retry")
    implementation("org.springframework.session:spring-session-data-redis")
//    implementation("org.springframework.statemachine:spring-statemachine-starter")

    implementation("org.joda:joda-money:1.0.1")
    implementation("org.jadira.usertype:usertype.core:6.0.1.GA")


    runtimeOnly("org.springframework.boot:spring-boot-devtools")
    runtimeOnly("com.h2database:h2")
    runtimeOnly("mysql:mysql-connector-java")
    runtimeOnly("org.postgresql:postgresql")

//    providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.batch:spring-batch-test")
    testImplementation("org.springframework.kafka:spring-kafka-test")
    testImplementation("org.springframework.security:spring-security-test")

}

//if (project.hasProperty("strict-security")) {
////    check.dependsOn(dependencyCheckAnalyze)
//}
tasks {
    jacocoTestCoverageVerification {
        violationRules {
            rule { limit { minimum = BigDecimal.valueOf(0.2) } }
        }
    }
    check {
        dependsOn(dependencyCheckAnalyze, jacocoTestCoverageVerification)
    }
}

