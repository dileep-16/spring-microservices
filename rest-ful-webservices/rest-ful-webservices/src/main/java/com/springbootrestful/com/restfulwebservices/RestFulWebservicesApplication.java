package com.springbootrestful.com.restfulwebservices;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class RestFulWebservicesApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(RestFulWebservicesApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RestFulWebservicesApplication.class);
    }
	
	@Bean
	public LocaleResolver localeResolver()
	{
		SessionLocaleResolver LocaleResolver=new SessionLocaleResolver();
		LocaleResolver.setDefaultLocale(Locale.US);
		
		return LocaleResolver;
		
	}
	
	@Bean
	public ResourceBundleMessageSource bundleMessageSource()
	{
		
		ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
		
	}
}
