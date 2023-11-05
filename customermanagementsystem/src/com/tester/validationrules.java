package com.tester;

import java.time.LocalDate;
import java.util.List;

import com.code.customer;
import com.code.serviceplan;

public class validationrules {

	
	//add rules of planenum
	
	public static serviceplan parseplan(String plan)throws invalidexception{
	
		return serviceplan.valueOf(plan);
	}
	
	//add method to LocalDate
	
	public static LocalDate parsedate(String date)throws invalidexception{
		
		LocalDate date1=LocalDate.parse(date);
		return date1;
		
	}
	
	// add rule to amount
	
	public static void validationamount(serviceplan plan,double amount)throws invalidexception{
		
		if(plan.getCost()!=amount)
			throw new invalidexception("Invalid Amount not match");
		
	}
	
	
	// add rule for check duplicateemail
	
	public static void duplicate (String email,List<customer>list)throws invalidexception{
		
	String pattern=	"[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)";
		if(!email.matches(pattern)) {
			throw new invalidexception("email pattern not match");
		}
		
		
		customer c1=new customer(email);
		if(list.contains(c1))
			throw new invalidexception("Duplicate email already used");
		
		
		
	}
	
	
	//add method to validate all
	
	public static customer inputall( int customerid, String firstname, String lastname, String email, String password, double amount,
			String date, String plan,List<customer>list)throws invalidexception{
		serviceplan plan1=parseplan(plan);
		LocalDate date1=parsedate(date);
		
		duplicate(email, list);
		
		
		return new customer(customerid,firstname,lastname,email,password,amount,date1,plan);
	}

	
	
	
	
	
	
	
	
	
}
