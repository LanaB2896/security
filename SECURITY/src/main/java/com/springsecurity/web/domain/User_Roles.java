package com.springsecurity.web.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class User_Roles {

	private identity pk;
//	private int user_id;
//	private int role_id;

	
	@EmbeddedId
	public identity getPk() {
		return pk;
	}

	public void setPk(identity pk) {
		this.pk = pk;
	}
//
//	public int getUser_id() {
//		return user_id;
//	}
//
//	public void setUser_id(int user_id) {
//		this.user_id = user_id;
//	}
//
//	public int getRole_id() {
//		return role_id;
//	}
//
//	public void setRole_id(int role_id) {
//		this.role_id = role_id;
//	}

	
}
