package com.bridgelabz.user_registration;

@FunctionalInterface
public interface IUserEntryValidator {

	public boolean validate(String inpute) throws UserValidationException;
}

