package com.feign.user.application;


import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringCloudApplication
public class FeignUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignUserServiceApplication.class,args);
    }
}
