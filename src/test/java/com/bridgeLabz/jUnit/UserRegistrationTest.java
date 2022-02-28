package com.bridgeLabz.jUnit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.firstName("Loki");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenFirstName_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.firstName("loki");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenLastName_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.lastName("Hassan");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenLastName_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.lastName("hassan");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenEmailAddress_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.emailAddress("lokeshbs619@gmail.com");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenEmailAddress_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.emailAddress("lok_sd@");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenMobileNumber_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.mobileNumber("91 9898989898");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenMobileNumber_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.mobileNumber("919898989898");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenPasswordAsPerRule1_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule1("abcAGH123@#");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenPasswordAsPerRule1_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule1("AG67@");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule2("ASasc123@");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenPasswordAsPerRule2_ShouldHaveAtleast1UpperCase_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule2("abc1234@df1");
        Assert.assertEquals(false,valid);
    }

    @Test
    public void  givenPasswordAsPerRule3_ShouldHaveAtleast1NumericNumber_WhenValid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule3("ABCabc123@");
        Assert.assertEquals(true,valid);
    }

    @Test
    public void  givenPasswordAsPerRule3_ShouldHaveAtleast1NumericNumber_WhenInvalid_ShouldReturnTrue(){
        boolean valid = userRegistration.passwordRule3("abcAFG$%");
        Assert.assertEquals(false,valid);
    }
}
