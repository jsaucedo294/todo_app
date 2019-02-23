package com.jorgesaucedo.todo_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import java.awt.image.RescaleOp;

@Configuration
public class TemplateConfig {
  @Bean
  public SpringResourceTemplateResolver templateResolver(){
    final SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
    templateResolver.setCacheable(false);
    templateResolver.setPrefix("classpath:/templates");
    templateResolver.setSuffix(".html");
    return templateResolver;
  }

  @Bean
  public SpringTemplateEngine templateEngine(){
    final SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
    springTemplateEngine.addTemplateResolver(templateResolver());

    return springTemplateEngine;
  }

  @Bean
  public ThymeleafViewResolver viewResolver(){
    final ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
    viewResolver.setTemplateEngine(templateEngine());
    viewResolver.setOrder(1);
    return viewResolver;
  }
}
