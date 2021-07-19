package com.dxz.zktestclient.controller;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig {
	
	 @Bean
	    public Docket createRestApi(){
	        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
	                .select()
	                .apis(RequestHandlerSelectors.any())
	                .paths(PathSelectors.any()).build();
	    }

	    private ApiInfo apiInfo(){
	        return new ApiInfoBuilder()
	                .title("Kitty API Doc")
	                .description("This is a restful api document of Kitty.")
	                .version("1.0")
	                .build();
	    }

}
