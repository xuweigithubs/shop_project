package portal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Controller
@SpringBootApplication
@Configuration
@MapperScan("portal.dao")
@ComponentScan(basePackages = {"portal.*"})
@EnableSwagger2
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
