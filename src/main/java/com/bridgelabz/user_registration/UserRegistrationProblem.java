package com.bridgelabz.user_registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistrationProblem {
	static Scanner sc = new Scanner(System.in);
	public static boolean validFirstName(String fname) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(fname);
		boolean result = m.matches();
		System.out.println(result);
		return result;
	}
	public static boolean validLastName(String lname) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lname);
		boolean result = m.matches();
		System.out.println(result);
		return result;
	}
	public static boolean isValidEmail(String name) {
		String regex = "^[A-Za-z0-9.]+[@][a-zA-z]{3,}[.][a-zA-z]{2,5}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		boolean result = m.matches();
		System.out.println(result);
		return result;
	}
	public static boolean isValidPhoneNumber(String num) {
		String regex = "^[+][0-9]{1,2}[6-9]{1}[0-9]{9}$";	
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(num);
		boolean result = m.matches();
		System.out.println(result);
		return result;
	}
	public static boolean isValidPassword1(String password) {
		String regex = "^[a-zA-Z0-9]{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		boolean result = m.matches();
		System.out.println(result);
		return result;
	}
	public static boolean isValidPassword2(String password) {
		String regex = "^[A-Z]{1}[a-z0-9.]{7,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		boolean result = m.matches();
		System.out.println(result);
		return result;
	}
	// should have at least 1 numeric number in password
	public static boolean isValidPassword3(String password) {
		String regex = "^[A-Z][@][a-z0-9]{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		boolean result = m.matches();
		System.out.println(result);
		return result;
	}
	public static boolean oneSpecialCharector(String password4) {
		String regex = "^[A-Z]{1}+[!@#%^&*()_+]{1}+[a-zA-z0-9@._-]{6,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password4);
		boolean result = m.matches();
		System.out.println(result);
		return result;
	}
	public static boolean allEmailSample(String email) {
		String regex = "^[A-Za-z]{3,}[.+-]?[A-Za-z0-9]*[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,}[.]?[a-z]*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		boolean result = m.matches();
		System.out.println(result);
		return result;
	}
}
