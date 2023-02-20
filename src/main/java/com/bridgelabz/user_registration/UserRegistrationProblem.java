package com.bridgelabz.user_registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistrationProblem {
	static Scanner sc = new Scanner(System.in);
	public static boolean validFirstName(String fname) throws InvalidFirstNameException {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(fname);
		boolean result = m.matches();
		System.out.println(result);
		if (!result) {
            throw new InvalidFirstNameException("first Name should start with a Cap and should have minimum 3 characters");
        }
        else {
            return true;
        }
	}
	public static boolean validLastName(String lname) throws InvalidLastNameException {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lname);
		boolean result = m.matches();
		System.out.println(result);
		 if (!result) {
	            throw new InvalidLastNameException("Last Name should start with a Cap and should have minimum 3 chars");
	        }
	        else {
	            return true;
	        }
	}
	public static boolean isValidEmail(String name) throws InvalidEmailException {
		String regex = "^[A-Za-z0-9.]+[@][a-zA-z]{3,}[.][a-zA-z]{2,5}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		boolean result = m.matches();
		System.out.println(result);
		if (!result) {
            throw new InvalidEmailException("Enter a valid email address");
        }
        else {
            return true;
        }
	}
	public static boolean isValidPhoneNumber(String num) throws InvalidMobileNumberException {
		String regex = "^[+][0-9]{1,2}[6-9]{1}[0-9]{9}$";	
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(num);
		boolean result = m.matches();
		System.out.println(result);
		if (!result) {
            throw new InvalidMobileNumberException("Enter the Valid Mobile number with county code");
        }
        else {
            return true;
        }
	}
	public static boolean isValidPassword1(String password) throws InvalidPsswordRule1Exception {
		String regex = "^[a-zA-Z0-9]{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		boolean result = m.matches();
		System.out.println(result);
		if (!result) {
            throw new InvalidPsswordRule1Exception("Password must have 8 character");
        }
        else {
            return true;
        }
	}
	public static boolean isValidPassword2(String password) throws  InvalidPasswordRule2Exception {
		String regex = "^[A-Z]{1}[a-z0-9.]{7,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		boolean result = m.matches();
		System.out.println(result);
		if (!result) {
            throw new InvalidPasswordRule2Exception("Password must have atleast one uppercase letter");
        }
        else {
            return true;
        }
	}
	// should have at least 1 numeric number in password
	public static boolean isValidPassword3(String password) throws InvalidPasswordRule3Exception {
		String regex = "^[A-Z][@][a-z0-9]{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		boolean result = m.matches();
		System.out.println(result);
		if (!result) {
            throw new InvalidPasswordRule3Exception("Password must have atleast one numeric number");
        }
        else {
            return true;
        }
	}
	public static boolean oneSpecialCharector(String password4) throws InvalidPasswordRule4Exception {
		String regex = "^[A-Z]{1}+[!@#%^&*()_+]{1}+[a-zA-z0-9@._-]{6,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password4);
		boolean result = m.matches();
		System.out.println(result);
		 if (!result) {
	            throw new InvalidPasswordRule4Exception("Password must has exactly one special charecrter");
	        }
	        else {
	            return true;
	        }
	}
	public static boolean allEmailSample(String email) throws InvalidEmailSampleException {
		String regex = "^[A-Za-z]{3,}[.+-]?[A-Za-z0-9]*[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,}[.]?[a-z]*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		boolean result = m.matches();
		System.out.println(result);
		 if (!result) {
	            throw new InvalidEmailSampleException("all email sample");
	        }
	        else {
	            return true;
	        }
	}
}
