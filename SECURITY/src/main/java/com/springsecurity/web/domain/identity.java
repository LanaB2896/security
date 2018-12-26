package com.springsecurity.web.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

import javax.persistence.ManyToOne;

@Embeddable
public class identity implements Serializable {

	private static final long serialVersionUID = -3666406288157524276L;
	private Role role;
	private User user;

	@ManyToOne
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
