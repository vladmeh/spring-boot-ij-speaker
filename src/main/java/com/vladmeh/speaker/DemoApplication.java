package com.vladmeh.speaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;


@SpringBootApplication
@EnableConfigurationProperties(HelloProperties.class)
public class DemoApplication {


    @Configuration
    @Profile("prod")
    static class SecurityConfig extends GlobalAuthenticationConfigurerAdapter {

        @Override
        public void init(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication().withUser("user").password("qwerty").roles("USER", "ADMIN");
        }
    }

   /* @Bean
    @Profile("dev")
    public ServletRegistrationBean<WebServlet> h2Console() {
        ServletRegistrationBean<WebServlet> reg = new ServletRegistrationBean<>(new WebServlet(), "/console/*");
        reg.setLoadOnStartup(1);
        return reg;
    }*/

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
