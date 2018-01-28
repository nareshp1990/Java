package com.example.cloud.eureka;

import com.example.cloud.eureka.resources.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableFeignClients(basePackageClasses = GreetingService.class)
public class SpringCloudEurekaFeignClientApplication {

    @Autowired
    private GreetingService greetingService;

    @Autowired
    private RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaFeignClientApplication.class, args);
    }

    @RequestMapping("/get-greeting")
    public String greeting() {
        return greetingService.greeting();
    }

    @RequestMapping("/get-greeting/v1")
    public String getGreeting() {
        ResponseEntity<String> exchange = restTemplate
            .exchange("http://spring-cloud-eureka-client/greeting", HttpMethod.GET, null,
                String.class);
        if (exchange != null) {
            return exchange.getBody();
        } else {
            return "Erro while connecting to eureka client";
        }
    }
}
