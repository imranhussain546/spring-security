package com.example.springsecurity.config;

import org.springframework.security.config.Customizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class SecurityConfig {

        private final PasswordEncoder passwordEncoder;

      @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        //for no authentication

        //  http
        //     .csrf(csrf -> csrf.disable())
        //     .authorizeHttpRequests(auth -> auth
        //         .anyRequest().permitAll()
        //     );

        // for basic authentication

        // http
        //         .csrf(csrf -> csrf.disable())
        //         .authorizeHttpRequests(auth -> auth
        //                 .anyRequest().authenticated()
        //         )
        //         .httpBasic(Customizer.withDefaults());

        // for form based on role authentication
        http
         .authorizeHttpRequests(auth->auth
                .requestMatchers("/district/all").permitAll()
                .requestMatchers("/admin/**").hasRole("ADMIN")
                .requestMatchers("/state/**").hasRole("STATE")
                .anyRequest().authenticated()
               
         )
         .httpBasic(Customizer.withDefaults());

        return http.build();
    }

    @Bean
    UserDetailsService userDetailsService() {
       UserDetails user1 =User.withUsername("admin")
                .password(passwordEncoder.encode("12345"))
                .roles("ADMIN")
                .build();
         
        UserDetails user2 = User.withUsername("state")
                  .password(passwordEncoder.encode("12345"))
                  .roles("STATE")
                  .build();        
        return new InMemoryUserDetailsManager(user1, user2 );
    }

}
