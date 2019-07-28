package com.lf2a.Java_Examples;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

class TableFormatter extends Formatter {
    public String format(LogRecord logRecord) {
        return
            "LogRecord info: " + 
            logRecord.getSourceClassName() + "\n" +
            "Level\t|\tLoggerName\t|\tMessage\t|\n" +
            logRecord.getLevel() + "\t|\t" +
            logRecord.getLoggerName() + "\t|\t" +
            logRecord.getMessage() + "\t|\n\n";
    }
}

public class TableFormatterTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("tableFormatter");
        
        try {
            for(Handler h : logger.getParent().getHandlers()) {
                if(h instanceof ConsoleHandler) {
                    h.setFormatter(new TableFormatter());
                }
            }
            
            logger.info("a");
            logger.warning("b");
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
