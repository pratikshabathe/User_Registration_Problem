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
		checkEmail();
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
		public static void checkEmail() {
			System.out.println("Enter an email: ");
			String email = sc.next();
			isValidEmail(email);
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
}
