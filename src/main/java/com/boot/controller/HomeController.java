package com.boot.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vadulasp on 8/23/16.
 */
@RestController
public class HomeController {

    static final Logger LOGGER = Logger.getLogger(HomeController.class);

    @RequestMapping ("/")
    public String home(){
        LOGGER.info("Testing the INFO log level");
        LOGGER.error("Testing the ERROR log level");
        LOGGER.warn("Testing the WARN log level");
        LOGGER.debug("Test debug.............");
        return "<html> <body bgcolor='green'> <b> Welcome to Das Boot </b> </body> </html>";
    }
}
