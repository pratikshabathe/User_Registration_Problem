package com.bridgelabz.user_registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistrationProblem userRegistration = new UserRegistrationProblem();

	@Test
    public void givenFirstName_WhenValid_ShouldReturnsTrue() {
        boolean result;
        try {
            Assert.assertTrue(userRegistration.validFirstName("Pratiksha"));
            System.out.println("First name is valid");
        }catch (InvalidFirstNameException e) {
            System.out.println("Invalid First Name because :- " + e);
        }
    }

    @Test
    public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
    	 try {
	            Assert.assertFalse(userRegistration.validFirstName("pratiksha"));
	            System.out.println("First name is valid");
	        }catch (InvalidFirstNameException e) {
	            System.out.println("Invalid First Name because :- " + e);
	        }
	    }
    @Test
    public void givenLastName_WhenValid_ShouldReturnsTrue() {
    	try {
            Assert.assertTrue(userRegistration.validLastName("Bathe"));
            System.out.println("Last name is valid");
        }catch (InvalidLastNameException e) {
            System.out.println("Invalid Last Name because :- " + e);
        }
    }

    @Test
    public void givenLastName_WhenInValid_ShouldReturnsFalse() {
    	try {
            Assert.assertFalse(userRegistration.validLastName("bathe"));
            System.out.println("Last name is valid");
        }catch (InvalidLastNameException e) {
            System.out.println("Invalid Last Name because :- " + e);
        }
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnsTrue() {
    	try {
    		Assert.assertTrue(userRegistration.isValidEmail("abc@yahoo.com"));
	        System.out.println("Email is valid");
    	}catch (InvalidEmailException e) {
	        System.out.println("Invalid Email because :- " + e);
    	}
    }

    @Test
    public void givenEmail_WhenInValid_ShouldReturnsFalse() {
    	try {
    		Assert.assertFalse(userRegistration.isValidEmail("ab-c@bl.in@.in"));
	        System.out.println("Email is valid");
    	}catch (InvalidEmailException e) {
	        System.out.println("Invalid Email because :- " + e);
    	}
       /* boolean result = userRegistration.isValidEmail("ab-c@bl.in@.in");
        Assert.assertFalse(result);*/
    }

    @Test
    public void givenMobileNo_WhenValid_ShdMouldReturnsTrue() {
    	 try {
	            Assert.assertTrue(userRegistration.isValidPhoneNumber("919965328901"));
	            System.out.println("Mobile Number is valid");
	        }catch (InvalidMobileNumberException e) {
	            System.out.println("Invalid Mobile Number because :- " + e);
	        }
	    }
      /*  boolean result = userRegistration.isValidPhoneNumber("919916519802");
        Assert.assertFalse(result);
    }*/

    @Test
    public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
    	try {
            Assert.assertFalse(userRegistration.isValidPhoneNumber("91 9965328901"));
            System.out.println("Mobile Number is valid");
        }catch (InvalidMobileNumberException e) {
            System.out.println("Invalid Mobile Number because :- " + e);
        }
    }
       
    @Test
    public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
    	 try {
	            Assert.assertTrue(userRegistration.isValidPassword1("Patuu045"));
	            System.out.println("Password Rule1 is valid");
	        }catch (InvalidPsswordRule1Exception e) {
	            System.out.println("Invalid Password Rule1 because :- " + e);
	        }
	    }

    @Test
    public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
    	 try {
	            Assert.assertFalse(userRegistration.isValidPassword1("Patuu04"));
	            System.out.println("Password Rule1 is valid");
	        }catch (InvalidPsswordRule1Exception e) {
	            System.out.println("Invalid Password Rule1 because :- " + e);
	        }
	    }
     
    @Test
    public void givenPasswordRule2_WhenValid_ShouldReturnsTrue()  {
    	 try {
	            Assert.assertTrue(userRegistration.isValidPassword2("Patuu05"));
	            System.out.println("Password Rule2 is valid");
	        }catch (InvalidPasswordRule2Exception e) {
	            System.out.println("Invalid Password Rule2 because :- " + e);
	        }
	    }

    @Test
    public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
    	 try {
	            Assert.assertFalse(userRegistration.isValidPassword2("patuu.45"));
	            System.out.println("Password Rule2 is valid");
	        }catch (InvalidPasswordRule2Exception e) {
	            System.out.println("Invalid Password Rule2 because :- " + e);
	        }
	    }
    
    @Test
    public void givenPasswordRule3_WhenValid_ShouldReturnsTrue() {
        try {
            Assert.assertTrue(userRegistration.isValidPassword3("Patuu@105"));
            System.out.println("Password Rule3 is valid");
        }catch (InvalidPasswordRule3Exception e) {
            System.out.println("Invalid Password Rule3 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() {
        try {
            Assert.assertFalse(userRegistration.isValidPassword3("Patuu@#$%"));
            System.out.println("Password Rule3 is valid");
        }catch (InvalidPasswordRule3Exception e) {
            System.out.println("Invalid Password Rule3 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() {
        try {
            Assert.assertTrue( userRegistration.oneSpecialCharector("A@gddtgj.gfst546"));
            System.out.println("Password Rule4 is valid");
        }catch (InvalidPasswordRule4Exception e) {
            System.out.println("Invalid Password Rule3 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() {
    	 try {
	            Assert.assertFalse(userRegistration.oneSpecialCharector("Patu555"));
	            System.out.println("Password Rule4 is valid");
	        }catch (InvalidPasswordRule4Exception e) {
	            System.out.println("Invalid Password Rule4 because :- " + e);
	        }
    }
    @Test
    public void givenEmailSample_WhenValid_ShouldReturnsTrue() {
    	try {
            Assert.assertTrue(userRegistration.allEmailSample("Aed.gfty@gyh09h.gmail.com"));
    	}catch (  InvalidEmailSampleException e) {
            System.out.println("Invalid Email sample because :- " + e);
        }
    }
    
    @Test
    public void givenEmailSample_WhenInValid_ShouldReturnsFalse() {
    	try {
            Assert.assertFalse(userRegistration.allEmailSample("A7656ftvjdj@gmail.com"));
    	}catch ( InvalidEmailSampleException e) {
            System.out.println("Invalid Email sample because :- " + e);
        }
    }
}
