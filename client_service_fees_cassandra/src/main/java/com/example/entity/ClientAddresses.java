package com.example.entity;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;


@Table(value = "client_addresses")
public class ClientAddresses implements java.io.Serializable {

	private int clientId;
	private Address address;
	private Clients clients;
	private String dateAddressFrom;
	private String dateAddressTo;

	
	@PrimaryKey
	@Column("client_id")
	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	@Column("address_id")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Column("client_id")
	public Clients getClients() {
		return clients;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
	}

	@Column("date_address_from")
	public String getDateAddressFrom() {
		return dateAddressFrom;
	}

	public void setDateAddressFrom(String dateAddressFrom) {
		this.dateAddressFrom = dateAddressFrom;
	}

	@Column("date_address_to")
	public String getDateAddressTo() {
		return dateAddressTo;
	}

	public void setDateAddressTo(String dateAddressTo) {
		this.dateAddressTo = dateAddressTo;
	}

	public ClientAddresses() {
	}

	public ClientAddresses(Address address, Clients clients, String dateAddressFrom, String dateAddressTo) {
		this.address = address;
		this.clients = clients;
		this.dateAddressFrom = dateAddressFrom;
		this.dateAddressTo = dateAddressTo;
	}

	

}
