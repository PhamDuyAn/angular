package com.example.entity;
import java.util.UUID;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * Services generated by hbm2java
 */
@Table(value = "services")
public class Services implements java.io.Serializable {

	@PrimaryKey
	private UUID service_code;
	private UUID parent_service_code;
	private String service_name;

	public Services() {
		service_code=UUID.randomUUID();
	}

	public Services(UUID parentServiceCode, String serviceName) {
		
		this.parent_service_code = parentServiceCode;
		this.service_name = serviceName;
	}

	
	@Column("service_code")
	public UUID getServiceCode() {
		return service_code;
	}

	public void setServiceCode(UUID serviceCode) {
		this.service_code = serviceCode;
	}

	@Column("parent_service_code")
	public UUID getParentServiceCode() {
		return parent_service_code;
	}

	public void setParentServiceCode(UUID parentServiceCode) {
		this.parent_service_code = parentServiceCode;
	}

	@Column("service_name")
	public String getServiceName() {
		return service_name;
	}

	public void setServiceName(String serviceName) {
		this.service_name = serviceName;
	}

	

}