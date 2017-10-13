package com.example.entity;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "address")
public class Address implements java.io.Serializable {

	
	private int addressId;
	private String line1NumberBuilding;
	private String line2NumberStreet;
	private String line3AreaLocality;
	private String townCity;
	private String stateProvince;
	private int countryCode;

	@PrimaryKey
	@Column("address_id")
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	@Column("line_1_number_building")
	public String getLine1NumberBuilding() {
		return line1NumberBuilding;
	}

	public void setLine1NumberBuilding(String line1NumberBuilding) {
		this.line1NumberBuilding = line1NumberBuilding;
	}
	@Column("line_2_number_street")
	public String getLine2NumberStreet() {
		return line2NumberStreet;
	}

	public void setLine2NumberStreet(String line2NumberStreet) {
		this.line2NumberStreet = line2NumberStreet;
	}
	@Column("line_3_area_locality")
	public String getLine3AreaLocality() {
		return line3AreaLocality;
	}

	public void setLine3AreaLocality(String line3AreaLocality) {
		this.line3AreaLocality = line3AreaLocality;
	}
	
	@Column("town_city")
	public String getTownCity() {
		return townCity;
	}

	public void setTownCity(String townCity) {
		this.townCity = townCity;
	}

	@Column("state_province")
	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	@Column("country_code")
	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	// private Set<ClientAddresses> clientAddresseses = new
	// HashSet<ClientAddresses>(0);

	public Address() {
	}

	public Address(int addressId, String line1NumberBuilding, String line2NumberStreet, String line3AreaLocality,
			String townCity, String stateProvince, int countryCode) {
		super();
		this.addressId = addressId;
		this.line1NumberBuilding = line1NumberBuilding;
		this.line2NumberStreet = line2NumberStreet;
		this.line3AreaLocality = line3AreaLocality;
		this.townCity = townCity;
		this.stateProvince = stateProvince;
		this.countryCode = countryCode;
	}

}
