package com.dxz.zktestclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *服务消费者启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ZktestClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZktestClientApplication.class,args);
    }

}