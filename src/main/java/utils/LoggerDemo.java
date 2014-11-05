package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemo {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(LoggerDemo.class.getName());
        logger.fatal("Log de fatal");
        logger.error("Log de error");
        logger.warn("Log de warning");
        logger.info("Log de info");
        logger.debug("Log de debug");
        logger.trace("Log de trace");
    }

}
