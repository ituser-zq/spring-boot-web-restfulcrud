package com.jxau.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 *
 * @PackageName: com.jxau.springboot
 * @ClassName: SpringBootWebRestfulcrudApplication.java
 * @Description:
 * @Author: ZQ
 * @Date: 2019/04/07 00:37
 *
 */
@SpringBootApplication
public class SpringBootWebRestfulcrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebRestfulcrudApplication.class, args);
    }

    @Bean
    public ViewResolver myViewReolver(){
        return new MyViewResolver();
    }

    public static class MyViewResolver implements ViewResolver{

        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }
}
