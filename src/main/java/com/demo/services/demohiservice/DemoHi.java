package com.demo.services.demohiservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoHi {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private DemoHiProxy proxy;
	
	@GetMapping("/hi")
	public String hiservice() {

		logger.info("{}", "hi");
		return proxy.sayHello();
	}

}
