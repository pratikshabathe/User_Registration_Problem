package com.bridgelabz.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("--Welcom to user resistration problem--");
		checkFirstName();
		checkLastName();
	}
		public static void checkFirstName() {
			System.out.println("Enter first name: ");
			String fName = sc.next();
			userRegistration(fName);
			}
		public static void checkLastName() {
			System.out.println("Enter Last name: ");
			String lName = sc.next();
			userRegistration(lName);
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
}
