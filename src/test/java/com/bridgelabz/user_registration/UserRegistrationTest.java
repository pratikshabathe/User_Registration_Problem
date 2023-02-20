package com.bridgelabz.user_registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistrationProblem userRegistration = new UserRegistrationProblem();

	@Test
    public void givenFirstName_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validFirstName("Pratiksha");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validFirstName("pratiksha");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validLastName("Bathe");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validLastName("bathe");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.isValidEmail("abc@yahoo.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.isValidEmail("ab-c@bl.in@.in");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNo_WhenValid_ShdMouldReturnsTrue() {
        boolean result = userRegistration.isValidPhoneNumber("919916519802");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.isValidPhoneNumber("91 9916519802");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.isValidPassword1("patuu005");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.isValidPassword1("Patuu04");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.isValidPassword2("Patuu05");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.isValidPassword2("patuu.45");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordRule3_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.isValidPassword3("Patuu@105");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.isValidPassword3("Patuu@#$%");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.oneSpecialCharector("A@gddtgj.gfst546");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.oneSpecialCharector("Patu555");
        Assert.assertFalse(result);
        }
    @Test
    public void givenEmailSample_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.allEmailSample("Aed.gfty@gyh09h.gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailSample_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.allEmailSample("A7656ftvjdj@gmail.com");
        Assert.assertFalse(result);
        }
}
