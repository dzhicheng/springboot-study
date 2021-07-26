package com.dongzhic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 开启了事务
 * 开启了MVC
 * 开启了AOP
 */
@SpringBootApplication(scanBasePackages = "com.dongzhic")
public class SpringbootStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudyApplication.class, args);
    }

}
