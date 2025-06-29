package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {
    private static final Logger logger = LoggerFactory.getLogger(AppenderExample.class);

    public static void main(String[] args) {
        logger.info("Info message logged to console and file");
        logger.warn("Warning message logged to both outputs");
        logger.error("Error message will appear in app.log and console");
    }
}
