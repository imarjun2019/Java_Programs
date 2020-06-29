package com.ex;

import org.apache.log4j.Logger;

public class LogSample {
    static Logger log = Logger.getLogger(LogSample.class.getName());

    public static void main(String[] args) {
        log.debug("This is debug");
        log.info("This is info method");
        log.warn("This is warn method");
        log.trace("This is trace method");
        log.error("This is error message");
        log.fatal("This is fatal method");

        System.out.println("Logging Example");
    }
}
