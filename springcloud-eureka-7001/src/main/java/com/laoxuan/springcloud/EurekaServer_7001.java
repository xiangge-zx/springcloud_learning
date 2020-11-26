package com.laoxuan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient//EnableEurekaServer服务端的启动
public class EurekaServer_7001 {
    public  static  void  main(String[] args){
        SpringApplication.run(EurekaServer_7001.class,args);
    }
}
