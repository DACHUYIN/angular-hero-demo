package com.gradleSpringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.gradleSpringboot.config.JwtFilter;

@SpringBootApplication
@MapperScan("com.gradleSpringboot.*")
public class SpringbootApplication {
	
	@Bean
	public FilterRegistrationBean jwtFilter() {
		FilterRegistrationBean rbean = new FilterRegistrationBean();
		rbean.setFilter(new JwtFilter());
		rbean.addUrlPatterns("/user/*");// 过滤webapp下的链接
		return rbean;
	}
	
	public static void main( String[] args )
    {
    	SpringApplication.run(SpringbootApplication.class, args);
    }
}
