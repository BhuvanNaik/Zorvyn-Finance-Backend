package com.zorvyn.financebackend.config;

import com.zorvyn.financebackend.security.AuthFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<AuthFilter> registerFilter(AuthFilter filter){

        FilterRegistrationBean<AuthFilter> reg=new FilterRegistrationBean<>();

        reg.setFilter(filter);
        reg.addUrlPatterns("/*");

        return reg;
    }
}