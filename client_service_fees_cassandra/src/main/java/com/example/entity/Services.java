package com.example.entity;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * Services generated by hbm2java
 */
@Table(value = "services")
public class Services implements java.io.Serializable {

	@PrimaryKey
	private String service_code;
	private String parent_service_code;
	private String service_name;
	public String getService_code() {
		return service_code;
	}
	public void setService_code(String service_code) {
		this.service_code = service_code;
	}
	public String getParent_service_code() {
		return parent_service_code;
	}
	public void setParent_service_code(String parent_service_code) {
		this.parent_service_code = parent_service_code;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public Services(String service_code, String parent_service_code, String service_name) {
		super();
		this.service_code = service_code;
		this.parent_service_code = parent_service_code;
		this.service_name = service_name;
	}
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}


	

}
