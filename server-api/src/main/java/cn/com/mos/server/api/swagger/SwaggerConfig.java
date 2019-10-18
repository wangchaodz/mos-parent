package cn.com.mos.server.api.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket userApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            //过滤的接口
            .apis(RequestHandlerSelectors.basePackage("cn.com.mos.server.api.controller"))
            .paths(PathSelectors.any())
            .build();
        return docket;
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("MOS接口平台").description("对公接口开放")
            .termsOfServiceUrl("http://www.zhang.box.cn/").contact("技术开发部")
            .license("Licence Version 1.0").licenseUrl("#").version("1.0").build();
    }
}
