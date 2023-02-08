package com.bridgelabz.user_registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
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
		public static void isValidPassword(String password) {
			String regex = "^[a-zA-Z]{8,}$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(password);
			if(m.matches())
				System.out.println("valid");
			else
				System.out.println("Invalid");
		}
}
