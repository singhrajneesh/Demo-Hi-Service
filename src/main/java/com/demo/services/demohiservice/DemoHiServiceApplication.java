package com.demo.services.demohiservice;

import java.io.FileReader;
import java.io.IOException;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.demo.services.demohiservice")
public class DemoHiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoHiServiceApplication.class, args);
	}
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
	
	@Bean
    public Docket api() throws IOException, XmlPullParserException {
   /*   MavenXpp3Reader reader = new MavenXpp3Reader();
       Model model = reader.read(new FileReader("pom.xml"));
       return new Docket(DocumentationType.SWAGGER_2)  
               .select()
               .apis(RequestHandlerSelectors.basePackage("com.demo.demo.zuul"))
               .paths(PathSelectors.any())                          
               .build().apiInfo(new ApiInfo("Product Service Api Documentation", "Documentation automatically generated", model.getParent().getVersion(), null, new Contact("vishruty mittal", null, "vishruty@gmail.com"), null, null));
*/       
		return new Docket(DocumentationType.SWAGGER_2);  
    }
}
