package com.medicare.ProjectforMedical.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;

@Configuration
public class MyConfig {

    @Bean
    public AuthenticationManager manager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }

}
