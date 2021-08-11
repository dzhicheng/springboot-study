package com.dongzhic;

import com.dongzhic.druid.config.DruidConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 开启了事务
 * 开启了MVC
 * 开启了AOP
 */
// 核心注解
@SpringBootApplication(scanBasePackages = "com.dongzhic")
@MapperScan("com.dongzhic.dao")
@EnableConfigurationProperties(DruidConfig.class)
public class SpringbootStudyApplication {

    /**
     * 1.完成spring容器的启动
     * 2.把项目部署到tomcat
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudyApplication.class, args);
    }

}
