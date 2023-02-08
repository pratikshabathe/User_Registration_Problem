package com.bridgelabz.user_registration;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("--Welcom to user resistration problem--");
		System.out.println("enter a number");
		switch(sc.nextInt()) {
		case 1 :
			System.out.println("Enter first name: ");
			String fName = sc.next();
			UserRegistrationProblem.userRegistration(fName);
			
		case 2 :
			System.out.println("Enter Last name: ");
			String lName = sc.next();
			UserRegistrationProblem.userRegistration(lName);
			
		case 3:
			System.out.println("Enter an email: ");
			String email = sc.next();
			UserRegistrationProblem.isValidEmail(email);
		
		case 4 :
			System.out.println("Enter a phone number: ");
			sc.nextLine();
			String phNum = sc.nextLine();
			UserRegistrationProblem.isValidPhoneNumber(phNum);
		
		case 5:
			System.out.println("Enter an password: ");
			String password = sc.next();
			UserRegistrationProblem.isValidPassword(password);
		}
	}

}
