package com.zyh.config;

import com.zyh.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author GG_B
 * @version 1.0
 */
//其作用等同于springmvc.xml
@Configuration
@ComponentScan(basePackages = "com.zyh")
@EnableWebMvc   //开启处理器映射器、处理器适配器的自动配置
public class SpringMVCConfig implements WebMvcConfigurer {
    //    配置视图解析器
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

//    配置文件上传解析器
    @Bean
    public CommonsMultipartResolver multipartResolver(){
        return new CommonsMultipartResolver();
    }

//    初测拦截器


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        MyInterceptor myInterceptor = new MyInterceptor();
        registry.addInterceptor(myInterceptor).addPathPatterns("/hello/demo1");
    }
}