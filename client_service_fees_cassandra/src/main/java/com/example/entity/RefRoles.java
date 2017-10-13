package com.example.entity;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "ref_roles")
public class RefRoles implements java.io.Serializable {

	
	private String roleCode;
	private String roleName;
	private String egProjectManager;

	public RefRoles() {
	}

	public RefRoles(String roleCode, String roleName, String egProjectManager) {
		this.roleCode = roleCode;
		this.roleName = roleName;
		this.egProjectManager = egProjectManager;
	}

	@PrimaryKey
	@Column("role_code")
	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	@Column("role_name")
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Column("eg_Project_Manager")
	public String getEgProjectManager() {
		return egProjectManager;
	}

	public void setEgProjectManager(String egProjectManager) {
		this.egProjectManager = egProjectManager;
	}
	
	
}
