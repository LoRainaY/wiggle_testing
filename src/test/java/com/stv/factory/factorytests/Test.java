package com.stv.factory.factorytests;

import com.stv.factory.factorypages.AuthorizedPage;
import com.stv.factory.factorypages.LoginPage;
import com.stv.framework.core.lib.EmailString;
import com.stv.framework.core.lib.PasswordString;
import org.testng.Assert;

public class Test {
   LoginPage loginCustomer=new LoginPage();

    @org.testng.annotations.Test
    public void assertRegistrationPageOpened() {
        loginCustomer.enterEmailTextForm(EmailString.EMAIL);
        loginCustomer.enterPasswordTextForm(PasswordString.PASSWORD);
        loginCustomer.clickOnLoginButton();

        Assert.assertEquals(new AuthorizedPage().isAccountContainerDisplayed(), true);
    }
}
