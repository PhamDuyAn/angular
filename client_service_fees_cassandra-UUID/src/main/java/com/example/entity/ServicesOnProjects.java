package com.example.entity;
// Generated Sep 27, 2017 11:56:10 AM by Hibernate Tools 5.2.5.Final

import java.util.UUID;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * ServicesOnProjects generated by hbm2java
 */
@Table(value = "service_on_projects")
public class ServicesOnProjects {

	@PrimaryKey
	private UUID service_on_project_id;
	private UUID service_code;
	private UUID project_id;

	public ServicesOnProjects(UUID servicecode, UUID projectid) {
		super();
		this.service_code = servicecode;
		this.project_id = projectid;
	}

	public ServicesOnProjects() {
		super();
		// TODO Auto-generated constructor stub
		service_on_project_id =UUID.randomUUID();
	}

	@Column("service_on_project_id")
	public UUID getService_on_project_id() {
		return service_on_project_id;
	}

	public void setService_on_project_id(UUID service_on_project_id) {
		this.service_on_project_id = service_on_project_id;
	}

	@Column("service_code")
	public UUID getService_code() {
		return service_code;
	}

	public void setService_code(UUID service_code) {
		this.service_code = service_code;
	}

	@Column("project_id")
	public UUID getProject_id() {
		return project_id;
	}

	public void setProject_id(UUID project_id) {
		this.project_id = project_id;
	}

}