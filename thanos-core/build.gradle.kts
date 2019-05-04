plugins {
    id("org.springframework.boot")
    id("io.freefair.lombok")
    id("org.owasp.dependencycheck")
    id("io.spring.dependency-management")
    idea
    base
    war
    java
}


configurations {
    runtimeOnly
    runtimeClasspath {
        extendsFrom
    }
}

dependencies {
    implementation("com.google.guava:guava:26.0-jre")
    testImplementation("junit:junit:4.12")
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
//    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-websocket")
//    implementation("org.liquibase:liquibase-core")

    implementation("org.springframework.kafka:spring-kafka")
    implementation("org.springframework.retry:spring-retry")
//    implementation("org.springframework.session:spring-session-data-redis")
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