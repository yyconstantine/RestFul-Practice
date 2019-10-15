package me.sxl.billbook.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger配置,扫描全部Controller
 * 默认启动方式为:域名/项目名/swagger-ui.html访问
 * 如本项目: http://localhost:8080/billbook/swagger-ui.html
 *
 * @author yyconstantine
 * @date 2019/10/14 13:18
 */
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("me.sxl.billbook.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger2集成演示")
                .termsOfServiceUrl("https://yyconstantine.github.io")
                .description("使用Restful API构建项目")
                .version("1.0")
                .build();
    }

}
