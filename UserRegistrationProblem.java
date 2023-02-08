package com.bridgelabz.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("--Welcom to user resistration problem--");
		System.out.println("enter a number");
		switch(sc.nextInt()) {
		case 1 :
			System.out.println("Enter first name: ");
			String fName = sc.next();
			userRegistration(fName);
			
		case 2 :
			System.out.println("Enter Last name: ");
			String lName = sc.next();
			userRegistration(lName);
			
		case 3:
			System.out.println("Enter an email: ");
			String email = sc.next();
			isValidEmail(email);
		
		case 4 :
			System.out.println("Enter a phone number: ");
			sc.nextLine();
			String phNum = sc.nextLine();
			isValidPhoneNumber(phNum);
		}
	}
		
		public static void userRegistration(String firstName) {
			String regex = "^[A-Z]{1}[a-z]{2,}$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(firstName);
			if(m.matches())
				System.out.println("valid");
			else
				System.out.println("Invalid");
		}
		public static void isValidEmail(String email) {
			String regex = "^[A-Za-z0-9.]+[@][a-zA-z]{3,}[.][a-zA-z]{2,5}$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(email);
			if(m.matches())
				System.out.println("valid");
			else
				System.out.println("Invalid");
		}
		public static void isValidPhoneNumber(String phNum) {
			System.out.println(phNum);
			String regex = "^[+][0-9]{1,2}[6-9]{1}[0-9]{9}$";	
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(phNum);
			if(m.matches())
				System.out.println("valid");
			else
				System.out.println("Invalid");	
		}
}
