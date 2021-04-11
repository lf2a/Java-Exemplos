package com.github.lf2a;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Hello world!
 */
public class App {

    private static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {

        int v = 7;
        
        switch (v) {
            case 1:
                logger.setLevel(Level.DEBUG);
                logger.debug("Enabled 'DEBUG' Mode ....!");
                break;

            case 2:
                logger.setLevel(Level.INFO);
                logger.info("Enabled 'INFO' Mode ....!");
                break;

            case 3:
                logger.setLevel(Level.WARN);
                logger.warn("Enabled 'WARN' Mode ....!");
                break;

            case 4:
                logger.setLevel(Level.ERROR);
                logger.error("Enabled 'ERROR' Mode ....!");
                break;

            case 5:
                logger.setLevel(Level.TRACE);
                logger.trace("Trace");
                break;

            case 6:
                logger.setLevel(Level.OFF);
                break;

            case 7:
                logger.debug("Enabled 'DEBUG' Mode ....!");
                logger.trace("Enabled 'TRACE' Mode ....!");
                logger.info("Enabled 'INFO' Mode ....!");
                logger.warn("Enabled 'WARN' Mode ....!");
                logger.error("Enabled 'ERROR' Mode ....!");
                break;
        }
    }
}
