package com.uninove.arcaneink.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            .authorizeHttpRequests(auth -> auth
                // libera arquivos estáticos
                .requestMatchers("/img/**", "/css/**", "/js/**").permitAll()

                // libera acesso às páginas de login e autenticação
                .requestMatchers("/login", "/login/**").permitAll()

                // libera todo o resto (se desejar)
                .anyRequest().permitAll()
            )
            // desabilita CSRF para permitir forms simples
            .csrf(csrf -> csrf.disable());

        return http.build();
    }
}
