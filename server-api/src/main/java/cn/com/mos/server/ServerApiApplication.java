package cn.com.mos.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApiApplication.class, args);
    }

}
