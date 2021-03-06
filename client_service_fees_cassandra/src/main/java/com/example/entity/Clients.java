package com.example.entity;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * Clients generated by hbm2java
 */

@Table(value = "DuyAn_Clients")
public class Clients implements java.io.Serializable {

	
	@PrimaryKey
	private int clientId;
	private RefCurencies refCurencies;
	private String clientName;
	private String clientFromDate;
	private String kpiAvgBillableRate;
	private String kpiBillingsToDate;
	private String kpiClientProjectCount;
	private String otherClientDetails;
	//private Set<Projects> projectses = new HashSet<Projects>(0);
	private ClientAddresses clientAddresses;

	
	
	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public RefCurencies getRefCurencies() {
		return refCurencies;
	}

	public void setRefCurencies(RefCurencies refCurencies) {
		this.refCurencies = refCurencies;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientFromDate() {
		return clientFromDate;
	}

	public void setClientFromDate(String clientFromDate) {
		this.clientFromDate = clientFromDate;
	}

	public String getKpiAvgBillableRate() {
		return kpiAvgBillableRate;
	}

	public void setKpiAvgBillableRate(String kpiAvgBillableRate) {
		this.kpiAvgBillableRate = kpiAvgBillableRate;
	}

	public String getKpiBillingsToDate() {
		return kpiBillingsToDate;
	}

	public void setKpiBillingsToDate(String kpiBillingsToDate) {
		this.kpiBillingsToDate = kpiBillingsToDate;
	}

	public String getKpiClientProjectCount() {
		return kpiClientProjectCount;
	}

	public void setKpiClientProjectCount(String kpiClientProjectCount) {
		this.kpiClientProjectCount = kpiClientProjectCount;
	}

	public String getOtherClientDetails() {
		return otherClientDetails;
	}

	public void setOtherClientDetails(String otherClientDetails) {
		this.otherClientDetails = otherClientDetails;
	}

	public ClientAddresses getClientAddresses() {
		return clientAddresses;
	}

	public void setClientAddresses(ClientAddresses clientAddresses) {
		this.clientAddresses = clientAddresses;
	}

	public Clients() {
	}

	public Clients(int clientId, RefCurencies refCurencies, String clientName, String clientFromDate,
			String kpiAvgBillableRate, String kpiBillingsToDate, String kpiClientProjectCount,
			String otherClientDetails) {
		this.clientId = clientId;
		this.refCurencies = refCurencies;
		this.clientName = clientName;
		this.clientFromDate = clientFromDate;
		this.kpiAvgBillableRate = kpiAvgBillableRate;
		this.kpiBillingsToDate = kpiBillingsToDate;
		this.kpiClientProjectCount = kpiClientProjectCount;
		this.otherClientDetails = otherClientDetails;
	}
	
}
