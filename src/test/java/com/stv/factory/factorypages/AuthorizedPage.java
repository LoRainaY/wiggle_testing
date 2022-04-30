package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorizedPage extends FactoryPage{


    @FindBy(className = "bem-navigation-menu")
    private WebElement accountPage;

    public boolean isAccountContainerDisplayed(){
        return accountPage.isDisplayed();
    }
}
