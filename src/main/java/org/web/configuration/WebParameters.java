package org.web.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class WebParameters {

	@Bean
	public HttpStatus httpStatus(){
		return HttpStatus.OK;
	}
	
}
