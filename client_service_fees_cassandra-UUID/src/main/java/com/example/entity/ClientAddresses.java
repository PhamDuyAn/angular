package com.example.entity;
import java.util.UUID;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;


@Table(value = "client_addresses")
public class ClientAddresses implements java.io.Serializable {
	@PrimaryKey
	private UUID client_addreses_id;
	
	private UUID client_id;
	private UUID address_id;
	private String date_address_from;
	private String date_address_to;

	
	@Column("client_addreses_id")
	public UUID getClient_addreses_id() {
		return client_addreses_id;
	}

	public void setClient_addreses_id(UUID client_addreses_id) {
		this.client_addreses_id = client_addreses_id;
	}

	
	@Column("client_id")
	public UUID getClientId() {
		return client_id;
	}

	public void setClientId(UUID clientId) {
		this.client_id = clientId;
	}

	@Column("address_id")
	public UUID getAddress() {
		return address_id;
	}

	public void setAddress(UUID address) {
		this.address_id = address;
	}

	@Column("date_address_from")
	public String getDateAddressFrom() {
		return date_address_from;
	}

	public void setDateAddressFrom(String dateAddressFrom) {
		this.date_address_from = dateAddressFrom;
	}

	@Column("date_address_to")
	public String getDateAddressTo() {
		return date_address_to;
	}

	public void setDateAddressTo(String dateAddressTo) {
		this.date_address_to = dateAddressTo;
	}

	public ClientAddresses() {
		client_addreses_id = UUID.randomUUID();
	}

	public ClientAddresses(UUID address, UUID clients, String dateAddressFrom, String dateAddressTo) {
		this.address_id = address;
		this.client_id = clients;
		this.date_address_from = dateAddressFrom;
		this.date_address_to = dateAddressTo;
	}

	

}
