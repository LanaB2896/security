package com.springsecurity.web.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Role_details")

public class Role {
	private int role_id;
	private String ROLE_ADMIN;
	private String ROLE_USER;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getROLE_ADMIN() {
		return ROLE_ADMIN;
	}

	public void setROLE_ADMIN(String rOLE_ADMIN) {
		ROLE_ADMIN = rOLE_ADMIN;
	}

	public String getROLE_USER() {
		return ROLE_USER;
	}

	public void setROLE_USER(String rOLE_USER) {
		ROLE_USER = rOLE_USER;
	}
}
