package com.tester;

import java.util.List;

import com.code.customer;

public class findcustomer {

	public static  customer findcustomerdetail(String email,List<customer>list)throws invalidexception{
		
		customer c1=new customer(email);
		int index=list.indexOf(c1);
		if(index==-1) {
			throw new invalidexception("Invalid email");
			
		}
		

		
		return c1;
	}
	
	
	
}
