package manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Controller
@SpringBootApplication
@Configuration
@MapperScan("manager.**.dao")
@ComponentScan(basePackages = {"manager.*"})
@EnableTransactionManagement
public class ProductManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductManagerApplication.class, args);
    }
}
