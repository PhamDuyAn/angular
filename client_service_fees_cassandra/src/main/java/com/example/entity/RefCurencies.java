package com.example.entity;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "ref_curencies")
public class RefCurencies implements java.io.Serializable {

	
	private String currencyCode;
	private String currencyName;
	private String nominalEchangeRate;
	//private Set<Clients> clientses = new HashSet<Clients>(0);

	public RefCurencies() {
	}

	public RefCurencies(String currencyCode, String currencyName, String nominalEchangeRate) {
		this.currencyCode = currencyCode;
		this.currencyName = currencyName;
		this.nominalEchangeRate = nominalEchangeRate;
	}

	@PrimaryKey
	@Column("currency_code")
	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	@Column("currency_name")
	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	@Column("nominal_echange_rate")
	public String getNominalEchangeRate() {
		return nominalEchangeRate;
	}

	public void setNominalEchangeRate(String nominalEchangeRate) {
		this.nominalEchangeRate = nominalEchangeRate;
	}
	
}
