package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.internal.Errors;
import org.modelmapper.internal.InheritingConfiguration;
import org.modelmapper.internal.MappingEngineImpl;
import org.modelmapper.internal.util.Assert;
import org.modelmapper.internal.util.Types;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	//adding a method to configure spring beann
	@Bean // <bean id , class , scope  ... />
	public ModelMapper myModelMapper();
	mapper.getConfiguration().

}
