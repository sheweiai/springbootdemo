package com.offcn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//配置类
@Configuration   //配置类的注解Configuration   不加，则配置类无效
public class WebMvcConfig implements WebMvcConfigurer{
    //配置自定义的静态资源路径
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //将resources下的aaaa包作为静态资源路径  访问的时候使用
//        registry.addResourceHandler("/aaaa/**").addResourceLocations("classpath:\\aaaa\\");
//        registry.addResourceHandler("/myPic/**").addResourceLocations("file:D:\\ApplicationSoftware\\office2016\\look");

    }



}
