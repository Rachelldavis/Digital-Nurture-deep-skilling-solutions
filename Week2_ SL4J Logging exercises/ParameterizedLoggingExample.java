package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String user = "Alice";
        int attempts = 5;

        logger.info("User {} has attempted to login {} times", user, attempts);
        logger.debug("Debug message for user: {}", user);
    }
}
