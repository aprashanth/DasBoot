package com.boot.controller;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vadulasp on 2/12/17.
 */
@RestController
public class LogLevelConfigurator {

    static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(LogLevelConfigurator.class);

    @RequestMapping("/logLevel")
    public String setLogLevel(){
        LOGGER.info("Log level is set at.." + LogManager.getRootLogger().getLevel());
        org.apache.log4j.LogManager.getRootLogger().setLevel(Level.ERROR);

        LOGGER.info("Log level is now set to.." + LogManager.getRootLogger().getLevel());
        return "";
    }
}
