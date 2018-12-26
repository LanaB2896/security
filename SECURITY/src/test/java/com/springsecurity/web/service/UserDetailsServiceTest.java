package com.springsecurity.web.service;


import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserDetailsServiceTest {

	@Test
	public void generate_encrypted_password() {
		BCryptPasswordEncoder encoder =  new BCryptPasswordEncoder();
	String rawPassword="lana1234";
		String encoderPassword=encoder.encode(rawPassword);
	System.out.println(encoderPassword);	
	assertThat(rawPassword, not(encoderPassword));
	}

}
