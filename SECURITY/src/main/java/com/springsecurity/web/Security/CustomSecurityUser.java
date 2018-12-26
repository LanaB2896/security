package com.springsecurity.web.Security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.jdbc.object.UpdatableSqlQuery;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.springsecurity.web.domain.User;

public class CustomSecurityUser extends User implements UserDetails {

	private static final long serialVersionUID = -3157637035680797140L;

	public CustomSecurityUser() {

	}

	public CustomSecurityUser(User user) {
		this.setAuthorities(user.getAuthorities());
		this.setUser_id(user.getUser_id());
		this.setUserName(user.getUserName());
		this.setPassword(user.getPassword());
	}

	@Override
	public Set<Authority> getAuthorities() {

		return super.getAuthorities();
	}

	@Override
	public String getPassword() {

		return super.getPassword();
	}

	@Override
	public String getUsername() {

		return super.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {

		return true;
	}

	@Override
	public boolean isAccountNonLocked() {

		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}

	@Override
	public boolean isEnabled() {

		return true;
	}

}
