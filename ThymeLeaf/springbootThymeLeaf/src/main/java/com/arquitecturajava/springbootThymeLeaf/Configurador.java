package com.arquitecturajava.springbootThymeLeaf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
public class Configurador {

	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
		  registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/");
	  }
}
