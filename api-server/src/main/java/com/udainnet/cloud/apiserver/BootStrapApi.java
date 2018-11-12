package com.udainnet.cloud.apiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : RaoJun
 * @date : Created in 2018/11/6 17:24
 * @description :
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BootStrapApi {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BootStrapApi.class);
        app.run();
    }
}
