package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//建议放到根目录下面，是项目的启动类，Spring Boot 项目只能有一个 main() 方法
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class McJavaSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(McJavaSpringbootApplication.class, args);
    }
}
