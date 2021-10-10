package model;

import java.text.NumberFormat;

public class Account {
	protected String accountName;
	protected String address;
	protected String phoneNumber;
	
	public Account(String accountName, String address, String phoneNumber) {
		this.accountName = accountName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void display() {
		System.out.println("conflic local");
		System.out.println("modified");
		System.out.println("conflic in server");
		System.out.println("modified in mybrach");
		System.out.println("Name : "+accountName);
		System.out.println("Adress : "+address);
		System.out.println("Phone Number : "+phoneNumber);
	}
	
	public void display() {
		System.out.println("conflic in server");
	}
	
}
