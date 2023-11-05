package com.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import static com.tester.validationrules.inputall;
import com.code.customer;
import static com.tester.findcustomer.findcustomerdetail;

public class tester {

	public static void main(String[] args) {
		

		try (Scanner sc = new Scanner(System.in)) {
			List<customer> cust = new ArrayList<>();
			
			boolean exit = false;

			while (!exit) {

				System.out.println("  choose 1 signup \n 2 signin(login) \n  3 dispaly customer details \n "
						+ " 4 change password \n 5 sort by email \n   6 sort by date \n 7 remove customer \n "
						+ "  8 get specific customer details \n  9 sort by firstname \n 10  for subscription \n 11 exit \n");

				try {

					switch (sc.nextInt()) {

					case 1:
						// for signup
						System.out.println(
								"Enter customer details= int customerid, String firstname, String lastname, String email, String password, double amount,\r\n"
										+ "		String date, String plan");
						customer c1 = inputall(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(), cust);
						cust.add(c1);
						System.out.println("customer added.....");

						break;

					case 2:
						// signin(login)
						System.out.println("Enter email and password");
						customer c2 = new customer(sc.next());
						boolean check = false;
						for (customer c : cust) {
							if (c.equals(c2))
								check = true;
				
							String s = sc.next();
							if (c.getPassword().contains(s)) {
								System.out.println("login succsessfully");
								System.out.println(c);
							}
						}
						if (check == false) {
							System.out.println("invalid email");
						}

					case 3:
						// display all customer
						for (customer c : cust) {
							System.out.println(c);
							System.out.println("all customers.....");
						}

						break;

					case 4:
						// change password
						System.out.println("Enter email=");
						customer c4 = new customer(sc.next());
						for (customer c : cust) {
							if (c4.equals(c)) {
								System.out.println("enter password");
								if (c.getPassword().contains(sc.next())) {
									System.out.println("Enter new password=");
									c.setPassword(sc.next());
									System.out.println("Password change successfully");
									;

								}
							}
						}
						break;

					case 5:

						// sort by email
						Collections.sort(cust);
						System.out.println(cust);
						break;

					case 6:
						// sort by date
						Collections.sort(cust, new Comparator<customer>() {

							@Override
							public int compare(customer o1, customer o2) {
								System.out.println("in comparator");
				return o1.getDate().compareTo(o2.getDate());
							}
						});

						break;

					case 7:
						// remove customer
						System.out.println("Enter email=");
						boolean removed = cust.remove(new customer(sc.next()));
						if (removed) {
							System.out.println("Customer removed successfully");
							throw new invalidexception("Please enter valid email");

						}

						break;

					case 8:
						// get specific customer details
						System.out.println("Enter emails=");
						System.out.println(findcustomerdetail(sc.next(), cust));
						break;

					case 9:
						// sort by firsrname

						Collections.sort(cust, new Comparator<customer>() {

							@Override
							public int compare(customer o1, customer o2) {
								System.out.println("Compare To");
								return o1.getFirstname().compareTo(o2.getFirstname());
							}
						});

						break;

				
						
						
					case 10:
						// for subscription

						break;

					case 0:
						exit = true;
						break;

					}

				} catch (Exception e) {
					System.out.println(sc.nextLine());
					e.printStackTrace();

				}

			}
		}
	}
}




//11 Jayesh Thombare jay1@gmail.com abc1 34000 2001-01-01 GOLD
//12 Pooja patil jay2@gmail.com abc1 34000 2001-01-01 GOLD
//13 Rahul patil jay3@gmail.com abc1 34000 2001-01-01 GOLD
//14 raj patel jay4@gmail.com abc1 34000 2001-01-01 GOLD
//15 Anil sharma jay7@gmail.com abc1 34000 2001-01-01 GOLD
//16 bhavesh patil jay6@gmail.com abc1 34000 2001-01-01 GOLD
//17 Jayesh Thombare jay1@gmail.com abc1 34000 2001-01-01 GOLD
//18 Jayesh Thombare jay1@gmail.com abc1 34000 2001-01-01 GOLD


