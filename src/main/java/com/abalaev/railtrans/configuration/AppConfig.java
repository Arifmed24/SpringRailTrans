package com.abalaev.railtrans.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.Properties;

@EnableWebMvc //разрешает проект использовать MVC
@Configuration // данный класс является Java Configuration
@ComponentScan(basePackages = "com.abalaev.railtrans", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = Configuration.class)
}) //где искать компоненты проекта.
@Import({SecurityConfig.class, HibernateConfiguration.class}) //импорт Security
public class AppConfig extends WebMvcConfigurerAdapter {

    //отвечайте за показ View в нашем случае это jsp страницы
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver
                = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    //где будут лежать ресурсы нашего проекта, такие как css, image, js и другие.
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    //this allows for mapping the DispatcherServlet to "/"
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}


