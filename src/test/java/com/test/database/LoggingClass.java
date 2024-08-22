package com.test.database;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoggingClass {
	private static final Logger log = LogManager.getLogger(LoggingClass.class);

	@Test
	public void test() {
        log.info("test");
        Assert.assertTrue(true);
	}
	@Test
	public void test1() {
		log.info("test1");
		Assert.assertTrue(true);
	}
	@Test
	public void test2() {
		log.info("test2");
		Assert.assertTrue(false);
	}
	
}
