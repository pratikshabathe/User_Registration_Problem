package com.bridgelabz.user_registration;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--Welcom to user resistration problem--");
		System.out.println("Enter a number: \n1. valid first name. \n2. valid last name. \n3. valid email ID. \n4. valid mobile number. \n5. valid passeord. \6.valid password1.\n7. valid password2. \n8 valid password3");
		switch(sc.nextInt()) {
		case 1 :
			UserRegistrationProblem.validFirstName();
		case 2 :
			UserRegistrationProblem.validLastName();	
		case 3:
			UserRegistrationProblem.isValidEmail();
		case 4 :
			UserRegistrationProblem.isValidPhoneNumber();
		case 5:
			UserRegistrationProblem.isValidPassword();
		case 6:
			UserRegistrationProblem.isValidPassword();
		case 7:
		UserRegistrationProblem.isValidPassword();
		case 8:
			UserRegistrationProblem.oneSpecialCharector();
		}	
	}
}
