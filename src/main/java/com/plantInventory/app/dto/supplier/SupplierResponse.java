package com.plantInventory.app.dto.supplier;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SupplierResponse {

	// Fields

	private Long id;
	private String name;
	private String contactName;
	private String phone;
	private String email;
	private String address;
	private Integer leadTimeDays;

	// constructors

	public SupplierResponse() {
	}

	public SupplierResponse(Long id, String name, String contactName, String phone, String email, String address,
			Integer leadTimeDays) {
		this.id = id;
		this.name = name;
		this.contactName = contactName;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.leadTimeDays = leadTimeDays;
	}

	//getter and setter
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getLeadTimeDays() {
		return leadTimeDays;
	}

	public void setLeadTimeDays(Integer leadTimeDays) {
		this.leadTimeDays = leadTimeDays;
	}
}
