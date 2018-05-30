package com.vladmeh.speaker.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @autor mvl on 30.05.2018.
 */

@Configuration
public class AppConfig {

    /*@Bean
    @Profile("prod")
    public UserDetailsService userDetailsService() throws Exception {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("user")
                .password("{bcrypt}$2a$04$VoGImG2/Z7C/N7vU72KphOdsJBK7C6zpz02r1z4DcEIvd/VSfRkuq")
                .roles("USER").build());
        manager.createUser(User.withUsername("admin")
                .password("{bcrypt}$2a$04$Egu0A7sbJFWXAp7Rq7ORxe9NYYt2WYFrCDVpKSm9V4KvnGRxPd.dO")
                .roles("USER", "ADMIN").build());
        return manager;
    }*/

    @Bean
    @Profile("dev")
    public ServletRegistrationBean<WebServlet> h2Console() {
        ServletRegistrationBean<WebServlet> reg = new ServletRegistrationBean<>(new WebServlet(), "/console/*");
        reg.setLoadOnStartup(1);
        return reg;
    }
}
