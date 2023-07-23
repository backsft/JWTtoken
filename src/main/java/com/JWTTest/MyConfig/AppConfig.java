package com.JWTTest.MyConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
class MyConfig {
	
	@Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.driver-class-name}")
    private String driver;
	
    
    
    
    
    
    
    
    @Bean
	 AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
		return builder.getAuthenticationManager();
	}
	


	@Bean
	 PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	
	/*
	
	@Bean
	 UserDetailsService userDetailsService() {
		UserDetails user = User.builder().username("sam").password(passwordEncoder().encode("123"))
				.roles("ADMIN").build();
		UserDetails user1 = User.builder().username("kiran").password(passwordEncoder().encode("123456"))
				.roles("ADMIN").build();

		return new InMemoryUserDetailsManager(user,user1);
	}
	
	
	*/
	
	
	
	

	
	/*
	
	@Bean
	 JdbcUserDetailsManager detailsManager(DataSource dataSource) {
		return new JdbcUserDetailsManager(dataSource);
	}

	@Bean
	 DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(url);
		dataSource.setDriverClassName(driver);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}
	
	*/
	
		
}





