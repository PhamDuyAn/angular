package com.example.entity;
// Generated Sep 27, 2017 11:56:10 AM by Hibernate Tools 5.2.5.Final

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "services_on_projects")
public class ServicesOnProjects implements java.io.Serializable {

	@PrimaryKey
	private int service_on_project_id;
	private String service_code;
	private int project_id;
	public int getService_on_project_id() {
		return service_on_project_id;
	}
	public void setService_on_project_id(int service_on_project_id) {
		this.service_on_project_id = service_on_project_id;
	}
	public String getService_code() {
		return service_code;
	}
	public void setService_code(String service_code) {
		this.service_code = service_code;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public ServicesOnProjects(int service_on_project_id, String service_code, int project_id) {
		super();
		this.service_on_project_id = service_on_project_id;
		this.service_code = service_code;
		this.project_id = project_id;
	}
	public ServicesOnProjects() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
