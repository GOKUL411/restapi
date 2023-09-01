package com.example.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	Logger logger =LoggerFactory.getLogger(Controller.class);
	@GetMapping("/test")
	public String hello()
	{
		logger.trace("A TRACE MESSAGE");
		logger.debug("A DEBUG MESSAGE");
		logger.info("A INFO MESSAGE");
		logger.warn("A WARN MESSAGE");
		logger.error("A ERROR MESSAGE");
		return "Hello Scalar!";
		
	}

}
