package com.wikipedia.information.myself;

import java.util.*;

public class Form {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Kindly fill the form below points :");
		
		// Create an Scanner Object 01
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter your full name");
		String full_name = sc1.next();
		
		// Create an Scanner Object 02
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter your Correct Age");
		int age = sc2.nextInt();
		
		// Create an Scanner Object 03
		Scanner sc3 = new Scanner(System.in);
				
		System.out.println("Enter your blood group");
		String blood_group = sc3.nextLine();
		
		// Create an Scanner Object 04
		Scanner sc4 = new Scanner(System.in);
						
		System.out.println("Enter your permanant address");
		String address = sc4.nextLine();
		
		// Create an Scanner Object 05
		Scanner sc5 = new Scanner(System.in);
								
		System.out.println("Enter your marital status");
		String marital_status = sc5.nextLine();
		
		// Create an Scanner Object 06
		Scanner sc6 = new Scanner(System.in);
														
		System.out.println("Enter your SSC percentage");
		float ssc_percentage = sc6.nextFloat();
		
		// Create an Scanner Object 07
		Scanner sc7 = new Scanner(System.in);
										
		System.out.println("Enter your Email address");
		String email_address = sc7.nextLine();
		
		// Create an Scanner Object 08
		Scanner sc8 = new Scanner(System.in);
												
		System.out.println("Enter your contact number");
		long contact_number = sc8.nextLong();
		System.out.println();
		
		
	  // Print All Information on Console
	System.out.println("Full Name :" + full_name);
	System.out.println("Age :" + age);
	System.out.println("Blood Group :" + blood_group);
	System.out.println("Permanant Address :" + address);
	System.out.println("Marital Status :" + marital_status);
	System.out.println("SSC Percentage :" + ssc_percentage);
	System.out.println("E-mail Address :" + email_address);
	System.out.println("Contact Number :" + contact_number);
	System.out.println();
	System.out.println("Your form is submitted, thank you for filling the entire form.");
   }
 }
