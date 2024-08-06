package com.zyh.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author GG_B
 * @version 1.0
 */
//该类就类似于web.xml的作用
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
//指定加载Spring的配置文件
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }
//加载SpringMVC的配置文件
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMVCConfig.class};
    }
//设置前端控制的映射路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
//定义过滤器方法
    @Override
    protected Filter[] getServletFilters() {
//        设置编码过滤器
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
//        设置HiddenHttpMethodFilter
        HiddenHttpMethodFilter methodFilter = new HiddenHttpMethodFilter();
        encodingFilter.setForceEncoding(true);
        return new Filter[]{encodingFilter,methodFilter};
    }
}
