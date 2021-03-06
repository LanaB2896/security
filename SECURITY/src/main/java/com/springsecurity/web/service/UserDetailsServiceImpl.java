package com.springsecurity.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecurity.web.Repository.UserRepository;
import com.springsecurity.web.Security.CustomSecurityUser;
import com.springsecurity.web.domain.User;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUserName(username);

		if (user == null)
			throw new UsernameNotFoundException("Invalid UserName and Password ");

		return new CustomSecurityUser(user);
	}

}
