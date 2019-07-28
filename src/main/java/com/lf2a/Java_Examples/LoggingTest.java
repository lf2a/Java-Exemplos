package com.lf2a.Java_Examples;

import java.util.logging.Logger;

public class LoggingTest {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("loggingTest");

		logger.severe("grave");
		logger.warning("aviso");
		logger.info("info");
	}
}
