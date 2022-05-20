package com.stv.factory.factorypages;

import com.stv.framework.core.lib.EmailString;
import com.stv.framework.core.lib.PasswordString;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends FactoryPage {
    @FindBy(className = "bem-checkout__login-container")
    private WebElement loginContainer;
    @FindBy(className = "bem-checkout__logo")
    private WebElement linkMainPage;

    public boolean isLoginContainerDisplayed(){
        return loginContainer.isDisplayed();
    }
    @FindBy(xpath = "//*[@id=\"wiggle\"]/div/div[4]/div/a")
    private WebElement linkSecure;

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

    public void enterEmailTextForm(String email) {
        emailTextForm.sendKeys(email);
    }

    public void enterPasswordTextForm(String password) {
        passwordTextForm.sendKeys(password);
    }

    public void clickOnLoginButton() {
        buttonLogin.click();
    }

    public void clickOnLinkSecureBySectigo(){linkSecure.click();}

    public void clickOnLinkMainPage(){linkMainPage.click();}


}
