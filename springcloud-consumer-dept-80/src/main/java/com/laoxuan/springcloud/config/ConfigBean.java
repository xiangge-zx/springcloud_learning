package com.laoxuan.springcloud.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
//相当于@Configuration ---spring applicationContext.xml


public class ConfigBean {
    //配置负载均衡实现RestTemplate
    //理解：消费者，不应该用service层~
    @Bean

    public RestTemplate getResTemplate(){
        return  new RestTemplate();
    }

}
