package com.xk.springcloudinvoker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudInvokerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudInvokerApplication.class, args);
    }

}
