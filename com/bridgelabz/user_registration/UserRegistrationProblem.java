package com.bridgelabz.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
	static Scanner sc = new Scanner(System.in);
	public static void validFirstName() {
		System.out.println("Enter the Fist name: ");
		String fname = sc.next();
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(fname);
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("Invalid");
	}
	public static void validLastName() {
		System.out.println("Enter the last name: ");
		String lname = sc.next();
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lname);
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("Invalid");
	}
	public static void isValidEmail() {
		System.out.println("Enter the email id: ");
		String name = sc.next();
		String regex = "^[A-Za-z0-9.]+[@][a-zA-z]{3,}[.][a-zA-z]{2,5}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("Invalid");
	}
	public static void isValidPhoneNumber() {
		System.out.println("Enter the phone number: ");
		String num = sc.next();
		String regex = "^[+][0-9]{1,2}[6-9]{1}[0-9]{9}$";	
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(num);
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("Invalid");	
	}
	public static void isValidPassword() {
		System.out.println("Enter the password: ");
		String password = sc.next();
		String regex = "^[a-zA-Z]{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("Invalid");
	}
	public static void isValidPassword1() {
		System.out.println("Enter the password1: ");
		String password1 = sc.next();
		String regex = "^[A-Z]{1}[a-z0-9]{7,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password1);
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("Invalid");
	}
	// should have at least 1 numeric number in password
	public static void isValidPassword2() {
		System.out.println("Enter the password2: ");
		String password2 = sc.next();
		String regex = "^[A-Z][a-z0-9]{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password2);
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("Invalid");
	}
	public static void oneSpecialCharector() {
		System.out.println("Enter the password3: ");
		String password3 = sc.next();
		String regex = "^[A-Z]{1}+[!@#%^&*()_+]{1}+[a-zA-z0-9@._-]{6,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password3);
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("Invalid");
	}
	public static void allEmailSample() {
		System.out.println("Enter the special eail id: ");
		String email = sc.next();
		String regex = "^[A-Za-z]{3,}[.+-]?[A-Za-z0-9]*[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,}[.]?[a-z]*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("Invalid");
	}
}
