package com.stv.factory.factorytests;

import com.stv.factory.factorypages.AuthorizedPage;
import com.stv.factory.factorypages.LoginPage;
import org.testng.Assert;

public class Test {
   LoginPage loginCustomer=new LoginPage();

    @org.testng.annotations.Test
    public void assertRegistrationPageOpened() {
        loginCustomer.enterEmailTextForm();
        loginCustomer.enterPasswordTextForm();
        loginCustomer.clickOnLoginButton();

        Assert.assertEquals(new AuthorizedPage().isAccountContainerDisplayed(), true);
    }
}
