package com.example.cloud.zuul;

import com.example.cloud.zuul.filters.AccessLogFilter;
import com.example.cloud.zuul.filters.ErrorFilter;
import com.example.cloud.zuul.filters.PostFilter;
import com.example.cloud.zuul.filters.PreFilter;
import com.example.cloud.zuul.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuulProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulProxyApplication.class, args);
    }

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }

    @Bean
    public AccessLogFilter accessLogFilter() {
        return new AccessLogFilter();
    }
}
