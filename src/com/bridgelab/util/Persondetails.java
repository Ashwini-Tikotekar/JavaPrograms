package com.bridgelab.util;

public class Persondetails {
	private String firstname;
	private String lastname;
    private long phonenno;
	Addressdetails addressdetails=new Addressdetails();
	public Addressdetails getAddressdetails() {
		return addressdetails;
	}
	public void setAddressdetails(Addressdetails addressdetails) {
		this.addressdetails = addressdetails;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public long getPhonenno() {
		return phonenno;
	}
	public void setPhonenno(long phonenno) {
		this.phonenno = phonenno;
	}
	
		
	}
	

