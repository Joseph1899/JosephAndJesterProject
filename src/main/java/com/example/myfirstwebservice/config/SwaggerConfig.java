package com.example.myfirstwebservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.myfirstwebservice.model.MyStringConstant;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;
/**
 *This is the swagger config package
 *@author Joseph and Jester
 *@version 1.0
 *@since March 22, 2021
 *
 *<h1>Git:</h1>
 *<ul>
 * <li>Joseph1899@github.com</li>
 * <li>JesterAlcantara@github.com</li>
 * </ul>
 * <p>This is the package that configures the swagger-ui for the project: myfirstwebservice. </p>
 **/

@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName(MyStringConstant.GROUP_NAME)
				.apiInfo(getApiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage(MyStringConstant.API_INFO_BASE_PACKAGE))
				.paths(PathSelectors.any())
				.build();
		
	}
	
	/*
	 * private ApiInfo apiInfo() { ApiInfo apiInfo=new
	 * ApiInfo("Sample- test","sample","test","api","sample","test","api"); return
	 * apiInfo; }
	 */
	
	  private ApiInfo getApiInfo() { return new
	  ApiInfoBuilder().title(MyStringConstant.API_INFO_TITLE)
	  .description(MyStringConstant.API_INFO_DESCRIPTION)
	  .licenseUrl(MyStringConstant.API_INFO_LICENSE_URL)
	  .termsOfServiceUrl(MyStringConstant.API_INFO_TERMS_SERVICE_URL)
	  .license(MyStringConstant.API_INFO_LICENSE)
	  .version(MyStringConstant.API_INFO_VERSION).build(); }
	 
}