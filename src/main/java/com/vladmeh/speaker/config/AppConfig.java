package com.vladmeh.speaker.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.security.RolesAllowed;

/**
 * @autor mvl on 30.05.2018.
 */

@Configuration
public class AppConfig {

    @Bean
    @Profile("dev")
    @RolesAllowed("ADMIN")
    public ServletRegistrationBean<WebServlet> h2Console() {
        ServletRegistrationBean<WebServlet> reg = new ServletRegistrationBean<>(new WebServlet(), "/console/*");
        reg.setLoadOnStartup(1);
        return reg;
    }
}
