package com.wipro.springauthdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {


	    @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http
	            .authorizeHttpRequests(auth -> auth
	                .requestMatchers("/hello").permitAll() 
	                .anyRequest().authenticated()          
	            )
	            .formLogin(Customizer.withDefaults())       
	            .logout(Customizer.withDefaults());         

	        return http.build();
	    }
	    
	    @Bean
	    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
	        var user = User.withUsername("jay")
	                .password(encoder.encode("pass"))
	                .build();

	        var user1 = User.withUsername("srikanth")
	                .password(encoder.encode("sri"))
	                .build();

	        return new InMemoryUserDetailsManager(user, user1); 
	    }


	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder(); 
	    }
}

