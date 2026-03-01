package com.plantInventory.app.dto.supplier;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateSupplierRequest {

	//Fields
	
	@NotBlank(message = "Supplier name is required.")
	private String name;
	
	private String contactName;
	
	@Pattern(
		regexp = "^[+]?[0-9\\-\\s{7,15}$",
		message = "Invalid phone number format.")
	private String phone;
	
	@Email(message = "Please provide a valid email address.")
	private String email;
	
	private String address;
	
	@Min(value = 0, message = "Lead time cannot be negative.")
	private Integer leadTimeDays;
	
	//constructors
	
	public CreateSupplierRequest() {}
	
	 public CreateSupplierRequest(String name, String contactName, String phone,
             String email, String address, Integer leadTimeDays) {
		 this.name = name;
		 this.contactName = contactName;
		 this.phone = phone;
		 this.email = email;
		 this.address = address;
		 this.leadTimeDays = leadTimeDays;
	 }

	 //getter and setter
	 
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
