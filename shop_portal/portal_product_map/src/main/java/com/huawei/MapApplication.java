package com.huawei;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
@Configuration
@MapperScan("com.huawei.dao")
@ComponentScan(basePackages = {"com.huawei.*"})
@EnableSwagger2Doc
public class MapApplication {
    public static void main(String[] args) {
        SpringApplication.run(MapApplication.class, args);
    }
}
