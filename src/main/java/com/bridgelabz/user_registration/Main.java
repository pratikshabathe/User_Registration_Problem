package com.bridgelabz.user_registration;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--Welcom to user resistration problem--");
		System.out.println("Enter a number: \n1. valid first name. \n2. valid last name. \n3. valid email ID. \n4. valid mobile number. \n5. valid passeord. \6.valid password1.\n7. valid password2. \n8 valid password3. \n9. special email id");
		switch(sc.nextInt()) {
		case 1 :
			UserRegistrationProblem.validFirstName("Pratiksha");
		case 2 :
			UserRegistrationProblem.validLastName("Bathe");	
		case 3:
			UserRegistrationProblem.isValidEmail("abc@yahoo.com");
		case 4 :
			UserRegistrationProblem.isValidPhoneNumber("919916519802");
		case 5:
			UserRegistrationProblem.isValidPassword1("Patuu04");
		case 6:
			UserRegistrationProblem.isValidPassword2("Patuu.05");
		case 7:
		UserRegistrationProblem.isValidPassword3("Patuu@105");
		case 8:
			UserRegistrationProblem.oneSpecialCharector("A@#gyd908.09gf-hg-fd");
		case 9:
			UserRegistrationProblem.allEmailSample("Aedg.gfty@gyh09h.gmail.com");
		}	
	}
}
