package com.demo.services.demohiservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="demo-hello-service")
@RibbonClient(name="demo-hello-service")
public interface DemoHiProxy {
	
	@GetMapping("/hello")
	public String sayHello();

}
