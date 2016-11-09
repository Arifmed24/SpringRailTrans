package com.abalaev.railtrans.configuration;


import com.abalaev.railtrans.controller.AccessFilter;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    // Этот метод должен содержать конфигурации которые инициализируют Beans
    // для инициализации бинов у нас использовалась аннотация @Bean
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {
                AppConfig.class
        };
    }

    // Тут добавляем конфигурацию, в которой инициализируем ViewResolver
    @Override
    protected Class<?>[] getServletConfigClasses() {
       return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    //enable lazy loading of JPA entity graphs in view rendering phase
    @Override
    protected Filter[] getServletFilters() {
        return new Filter[]{
//                new DelegatingFilterProxy("springSecurityFilterChain"),
                new OpenEntityManagerInViewFilter()
        };
    }
}
