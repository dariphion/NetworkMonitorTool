package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger("info");

    public static void main(String[] args) throws InterruptedException {

        logger.info("Network Monitor tool starting...");

        while(true)
        {
            ping.isHostAvailable("8.8.8.8", 443, 300);
            Thread.sleep(2000);
        }

    }
}