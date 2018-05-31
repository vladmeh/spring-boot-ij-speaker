package com.vladmeh.speaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties(HelloProperties.class)
public class DemoApplication {


    /*@Configuration
    static class SecurityConfig extends GlobalAuthenticationConfigurerAdapter {

        @Override
        public void init(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication().withUser("user").password("{bcrypt}$2a$04$IEJMfDgF3ii.hsvEXszcw.UvemFMtSGwJ.CC4HCHWbg.yZCsHfula").roles("USER", "ADMIN");
        }
    }*/

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
