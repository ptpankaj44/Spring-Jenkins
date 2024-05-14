package com.example.Jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {
	
	public static Logger logger=LoggerFactory.getLogger(JenkinsApplicationTests.class);
	

	@Test
	void contextLoads() {
		
		logger.info("Test case executing");
		assertEquals(true, true);
	}

}
