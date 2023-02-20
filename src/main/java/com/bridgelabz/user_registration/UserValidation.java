package com.bridgelabz.user_registration;

import com.bridgelabz.user_registration.UserValidationException.ExceptionType;

public class UserValidation {
	UserRegistrationProblem usrReg = new UserRegistrationProblem();

	  public IUserEntryValidator validateName = (String userInput) -> {
	    try {
	      if (userInput.length() == 0)
	        throw new UserValidationException(ExceptionType.IS_EMPTY, "name cannot be empty. enter a valid name.");
	      return usrReg.validFirstName(userInput);
	    } catch (NullPointerException e) {
	      throw new UserValidationException(ExceptionType.IS_NULL, "name cannot be null. enter a valid name.");
	    }
	  };

	  public IUserEntryValidator validateEmail = (String userInput) -> {
	    try {
	      if (userInput.length() == 0)
	        throw new UserValidationException(ExceptionType.IS_EMPTY, "email cannot be left empty. enter a valid email.");
	      return usrReg.isValidEmail(userInput);
	    } catch (NullPointerException e) {
	      throw new UserValidationException(ExceptionType.IS_NULL, "email cannot be null. enter a valid email.");
	    }
	  };

	  public IUserEntryValidator validatePassword = (String userInput) -> {
	    try {
	      if (userInput.length() == 0) throw new UserValidationException(ExceptionType.IS_EMPTY,
	        "password cannot be left empty. enter a valid password.");
	      return usrReg. oneSpecialCharector(userInput);
	    } catch (NullPointerException e) {
	      throw new UserValidationException(ExceptionType.IS_NULL, "password cannot be null. enter a valid password.");
	    }
	  };

	 
	  public IUserEntryValidator validateMobileNumber = (String userInpute) -> {
	    try {
	      if (userInpute.length() == 0) throw new UserValidationException(ExceptionType.IS_EMPTY,//(String userInput)
	        "phone number cannot be left empty. enter a valid phone number.");
	      return usrReg.isValidPhoneNumber(userInpute);
	    } catch (NullPointerException e) {
	      throw new UserValidationException(ExceptionType.IS_NULL,
	        "phone number cannot be null. enter a valid phone number.");
	    }
	  };
}
