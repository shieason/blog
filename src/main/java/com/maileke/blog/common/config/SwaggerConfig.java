package com.maileke.blog.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * shieason 2018.09.19
 * swagger2 通用配置类
 * 默认接口文档地址：http://localhost:8080/swagger-ui.html
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.maileke.blog")) // 配置扫描的包名
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("麦乐科微博客系统api接口文档") // 一般项目名字
                .description("单枪匹马你别怕，一腔孤勇又如何，这一路你可以哭，但你不能怂。")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}