package com.stv.factory.factorypages;

import com.stv.framework.core.lib.EmailString;
import com.stv.framework.core.lib.PasswordString;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends FactoryPage {
    @FindBy(className = "bem-checkout__login-container")
    private WebElement loginContainer;

    public boolean isLoginContainerDisplayed(){
        return loginContainer.isDisplayed();
    }

    @FindBy(id = "DualRegisterEmailModel_Email")
    private WebElement emailForm;
    @FindBy(id = "qa-dual-register")
    private WebElement buttonNewCustomer;

    @FindBy(id = "LogOnModel_UserName")
    private WebElement emailTextForm;
    @FindBy(id = "LogOnModel_Password")
    private WebElement passwordTextForm;

    @FindBy(id = "qa-login")
    private WebElement buttonLogin;



    public void clickOnDualRegisterEmailModelEmail() {
        emailForm.sendKeys(EmailString.EMAIL);
    }

    public void clickOnContinueButton() {
        buttonNewCustomer.click();
    }

    public void enterEmailTextForm() {
        emailTextForm.sendKeys(EmailString.EMAIL);
    }

    public void enterPasswordTextForm() {
        passwordTextForm.sendKeys(PasswordString.PASSWORD);
    }

    public void clickOnLoginButton() {
        buttonLogin.click();
    }

}
