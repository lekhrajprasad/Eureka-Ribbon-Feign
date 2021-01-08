package com.coursecube.springboot;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRibbonConfig {

    @Autowired
    IClientConfig iClientConfig;

    public MyRibbonConfig() {
        System.out.println("MyRibbonConfig - D.C");
    }

    @Bean
    public IPing ribbonPing(IClientConfig iClientConfig){
        System.out.println("MyRibbonConfig - ribbonPing()");
        return new PingUrl();
    }

    @Bean
    public IRule ribbonRule(IClientConfig iClientConfig){
        System.out.println("MyRibbonConfig - ribbonRule()");
        return new WeightedResponseTimeRule();
    }
}
