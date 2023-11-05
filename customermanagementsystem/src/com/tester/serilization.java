package com.tester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.code.customer;

public class serilization {

	public static void main(String[] args) {
		
	
	List<customer>cust=new ArrayList<>();
	try(Scanner sc=new Scanner(System.in)) {
		System.out.println("Enter path");
		BufferedReader br =new BufferedReader(new FileReader(sc.next()));
		PrintWriter pw=new PrintWriter(new FileWriter(sc.next()));
		System.out.println("path");
		
		String line=null;
		while((line=br.readLine())!=null)
		//	System.out.println(line);
		pw.println(line);
		
		
		
		
		
	}catch(Exception e) {
		System.out.println(e);
		e.printStackTrace();
	}
	
	
	
	
	}
}
