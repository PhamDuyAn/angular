package com.example.entity;

import java.util.UUID;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "ref_roles")
public class RefRoles implements java.io.Serializable {

	@PrimaryKey
	private UUID role_code;
	private String role_name;
	private String eg_Project_Manager;

	public RefRoles() {
		role_code=UUID.randomUUID();
	}

	public RefRoles(String roleName, String egProjectManager) {
		this.role_name = roleName;
		this.eg_Project_Manager = egProjectManager;
	}

	
	@Column("role_code")
	public UUID getRoleCode() {
		return role_code;
	}

	public void setRoleCode(UUID roleCode) {
		this.role_code = roleCode;
	}

	@Column("role_name")
	public String getRoleName() {
		return role_name;
	}

	public void setRoleName(String roleName) {
		this.role_name = roleName;
	}

	@Column("eg_Project_Manager")
	public String getEgProjectManager() {
		return eg_Project_Manager;
	}

	public void setEgProjectManager(String egProjectManager) {
		this.eg_Project_Manager = egProjectManager;
	}
	
	
}
