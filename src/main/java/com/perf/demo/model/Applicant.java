package com.perf.demo.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Applicant implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private String name;
	private Integer annualincome;
	private String address;
	private Integer ssn;
	private Integer creditrating;

	public Applicant() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getAnnualincome() {
		return this.annualincome;
	}

	public void setAnnualincome(java.lang.Integer annualincome) {
		this.annualincome = annualincome;
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public java.lang.Integer getSsn() {
		return this.ssn;
	}

	public void setSsn(java.lang.Integer ssn) {
		this.ssn = ssn;
	}

	public java.lang.Integer getCreditrating() {
		return this.creditrating;
	}

	public void setCreditrating(java.lang.Integer creditrating) {
		this.creditrating = creditrating;
	}
}