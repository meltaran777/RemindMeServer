package com.bohdankhrystov.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Bodia on 07.02.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.bohdankhrystov.remindme.server")
public class WebConfig extends WebMvcConfigurerAdapter{
}
