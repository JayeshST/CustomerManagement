package com.code;

import java.time.LocalDate;

public class customer implements Comparable<customer> {

private int customerid;
private String firstname,lastname,email,password;
private double amount;
private LocalDate date;
private serviceplan plan;
private static int idcounter;
static {
	idcounter=1;
	
}
public customer(int customerid, String firstname, String lastname, String email, String password, double amount,
		LocalDate date, String plan) {
	super();
	this.customerid = idcounter++;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.password = password;
	this.amount = amount;
	this.date = date;
	this.plan = serviceplan.valueOf(plan);
}
	


	
	public customer(String email) {
		this.email=email;
	
	}




	public int getCustomerid() {
		return customerid;
	}




	public void setCustomerid(int customerid) {
		this.customerid = customerid;
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




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public double getAmount() {
		return amount;
	}




	public void setAmount(double amount) {
		this.amount = amount;
	}




	public LocalDate getDate() {
		return date;
	}




	public void setDate(LocalDate date) {
		this.date = date;
	}




	public serviceplan getPlan() {
		return plan;
	}




	public void setPlan(serviceplan plan) {
		this.plan = plan;
	}




	public static int getIdcounter() {
		return idcounter;
	}




	public static void setIdcounter(int idcounter) {
		customer.idcounter = idcounter;
	}




	@Override
	public String toString() {
		return "customer [customerid=" + customerid + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", password=" + password + ", amount=" + amount + ", date=" + date + ", plan=" + plan + "]";
	}




	@Override
	public int compareTo(customer o) {
		System.out.println("compate To");
		return this.email.compareTo(o.email);
	}

	
	@Override
		public boolean equals(Object obj) {
		if(obj instanceof customer) {
			customer c1=(customer)obj;
	return this.email.equals(c1.email);
		}
			return  false;
		}
	
	
	
	
	
	
	
	
}
