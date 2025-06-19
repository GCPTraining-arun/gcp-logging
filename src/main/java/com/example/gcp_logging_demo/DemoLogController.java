package com.example.gcp_logging_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoLogController {
    private static final Logger logger = LoggerFactory.getLogger(DemoLogController.class);

    @GetMapping
    public String info() {

        logger.info("INFO log from Spring Boot");
        logger.warn("WARN log from Spring Boot");
        logger.error("ERROR log from Spring Boot");
        return "GCP logging demo";
    }


    @GetMapping("/user")
    public String log() {

        logger.info("User service ");

        return "User service";
    }

}
