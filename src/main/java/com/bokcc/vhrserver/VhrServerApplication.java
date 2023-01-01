package com.bokcc.vhrserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiaowang
 */
@SpringBootApplication
@MapperScan("com.bokcc.vhrserver.mapper")
public class VhrServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VhrServerApplication.class, args);
    }

}
