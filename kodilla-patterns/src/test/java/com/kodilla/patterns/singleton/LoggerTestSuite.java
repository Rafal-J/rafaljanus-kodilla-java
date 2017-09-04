package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void loggerTest(){
        Logger logger = Logger.getInstance();
        logger.log("Rejestr zdarzeń");

        String testLog = logger.getLastLog();

        Assert.assertEquals("Rejestr zdarzeń",testLog);
    }

}
