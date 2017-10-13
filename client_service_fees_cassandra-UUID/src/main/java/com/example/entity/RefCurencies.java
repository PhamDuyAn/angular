package com.example.entity;

import java.util.UUID;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "ref_curencies")
public class RefCurencies implements java.io.Serializable {

	@PrimaryKey
	private UUID currency_code;
	private String currency_name;
	private String nominal_echange_rate;
	//private Set<Clients> clientses = new HashSet<Clients>(0);

	public RefCurencies() {
		currency_code = UUID.randomUUID();
	}

	public RefCurencies(UUID currencyCode, String currencyName, String nominalEchangeRate) {
		this.currency_code = currencyCode;
		this.currency_name = currencyName;
		this.nominal_echange_rate = nominalEchangeRate;
	}

	
	@Column("currency_code")
	public UUID getCurrencyCode() {
		return currency_code;
	}

	public void setCurrencyCode(UUID currencyCode) {
		this.currency_code = currencyCode;
	}

	@Column("currency_name")
	public String getCurrencyName() {
		return currency_name;
	}

	public void setCurrencyName(String currencyName) {
		this.currency_name = currencyName;
	}

	@Column("nominal_echange_rate")
	public String getNominalEchangeRate() {
		return nominal_echange_rate;
	}

	public void setNominalEchangeRate(String nominalEchangeRate) {
		this.nominal_echange_rate = nominalEchangeRate;
	}
	
}
