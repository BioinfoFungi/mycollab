package com.mycollab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;

@SpringBootApplication(exclude = {FreeMarkerAutoConfiguration.class, FlywayAutoConfiguration.class},
        scanBasePackages = "com.mycollab.**.spring, com.mycollab.**.configuration, com.mycollab.**.servlet")
public class MainApplication {
    public static void main(String[] args) {
        // Customize the spring config location
//        System.setProperty("spring.config.additional-location", "file:${user.home}/cms/application.yml");
//		System.setProperty("spring.config.additional-location",
//				"optional:file:${user.home}/cms/");
        SpringApplication.run(MainApplication.class, args);
    }
}
