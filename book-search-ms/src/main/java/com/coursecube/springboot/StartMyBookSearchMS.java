package com.coursecube.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages={"com.netflix.client.config.IClientConfig"})
@EnableEurekaClient
@EnableFeignClients
@RibbonClient(name = "myjc", configuration = MyRibbonConfig.class)
public class StartMyBookSearchMS {
    public static void main(String[] args) {
        SpringApplication.run(StartMyBookSearchMS.class, args);
    }
}
