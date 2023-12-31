package com.doutown.config;
import java.util.Vector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//http://localhost:8080/swagger-ui/
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.doutown.member.controller")
						.or(RequestHandlerSelectors.basePackage("com.doutown.clubmember.controller"))
						.or(RequestHandlerSelectors.basePackage("com.doutown.club.controller")))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("REST API Documentation")
				.description("REST API 사용 설명서")
				.version("1.0")
				.termsOfServiceUrl("http://doutown.com/terms")
				.contact(new Contact("Your Name", "http://doutown.com", "your.email@example.com"))
				.license("Apache License Version 2.0")
				.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
				.extensions(new Vector<VendorExtension>())
				.build();
	}
}