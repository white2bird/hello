package com.itwang;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//@MapperScan(basePackages = "com.itwang.hello")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ColaHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColaHelloApplication.class, args);
    }
}
