package com.example.entity;

import java.util.UUID;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "address")
public class Address implements java.io.Serializable {

	@PrimaryKey
	private UUID address_id;
	private String line_1_number_building;
	private String line_2_number_street;
	private String line_3_area_locality;
	private String town_city;
	private String state_province;
	private int country_code;

	
	@Column("address_id")
	public UUID getAddressId() {
		return address_id;
	}

	public void setAddressId(UUID addressId) {
		this.address_id = addressId;
	}

	@Column("line_1_number_building")
	public String getLine1NumberBuilding() {
		return line_1_number_building;
	}

	public void setLine1NumberBuilding(String line1NumberBuilding) {
		this.line_1_number_building = line1NumberBuilding;
	}
	@Column("line_2_number_street")
	public String getLine2NumberStreet() {
		return line_2_number_street;
	}

	public void setLine2NumberStreet(String line2NumberStreet) {
		this.line_2_number_street = line2NumberStreet;
	}
	@Column("line_3_area_locality")
	public String getLine3AreaLocality() {
		return line_3_area_locality;
	}

	public void setLine3AreaLocality(String line3AreaLocality) {
		this.line_3_area_locality = line3AreaLocality;
	}
	
	@Column("town_city")
	public String getTownCity() {
		return town_city;
	}

	public void setTownCity(String townCity) {
		this.town_city = townCity;
	}

	@Column("state_province")
	public String getStateProvince() {
		return state_province;
	}

	public void setStateProvince(String stateProvince) {
		this.state_province = stateProvince;
	}

	@Column("country_code")
	public int getCountryCode() {
		return country_code;
	}

	public void setCountryCode(int countryCode) {
		this.country_code = countryCode;
	}

	// private Set<ClientAddresses> clientAddresseses = new
	// HashSet<ClientAddresses>(0);

	public Address() {
		address_id = UUID.randomUUID();
	}

	public Address( String line1NumberBuilding, String line2NumberStreet, String line3AreaLocality,
			String townCity, String stateProvince, int countryCode) {
		super();

		this.line_1_number_building = line1NumberBuilding;
		this.line_2_number_street = line2NumberStreet;
		this.line_3_area_locality = line3AreaLocality;
		this.town_city = townCity;
		this.state_province = stateProvince;
		this.country_code = countryCode;
	}

}
