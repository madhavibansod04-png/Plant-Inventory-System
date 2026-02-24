package com.plantInventory.app.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "supplier")
public class Supplier {
	
	//attribute

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int supplierId;
	
	@NotBlank
	private String name;
	
	private String contactName;
	
	private String phone;
	
	@Email
	private String email;
	
	private String address;
	
	private int leadTimeDays;
	
	//relationship
	@OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<InventoryTransaction> transactions;
	
	//empty constructor
	public Supplier() {}
	
	//field constructor
	public Supplier(int supplierId, String name, String contactName,
			String phone, String email, String address, int leadTimeDays) {
		
		this.supplierId = supplierId;
		this.name = name;
		this.contactName = contactName;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.leadTimeDays = leadTimeDays;
	}

	//getter and setter
	
	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
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

	public int getLeadTimeDays() {
		return leadTimeDays;
	}

	public void setLeadTimeDays(int leadTimeDays) {
		this.leadTimeDays = leadTimeDays;
	}

	public List<InventoryTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<InventoryTransaction> transactions) {
		this.transactions = transactions;
	}
}
