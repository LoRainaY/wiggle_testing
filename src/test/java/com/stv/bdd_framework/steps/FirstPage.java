package com.stv.bdd_framework.steps;

import com.stv.design.designtests.BasicTest;
import com.stv.factory.factorypages.AuthorizedPage;
import com.stv.factory.factorypages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;

public class FirstPage extends BasicTest {
    LoginPage loginPage=new LoginPage();
    @Given("the page is loaded")
    public void the_page_is_loaded() {
        getDriver().get(START_URL);
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();

    }

    @When("user enters email")
    public void user_enters_email() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.enterEmailTextForm();
    }

    @When("enters password")
    public void enters_password() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.enterPasswordTextForm();
    }

    @When("clicks on Sign in securely button")
    public void clicks_on_sign_in_securely_button() {
        // Write code here that turns the phrase above into concrete actions
       loginPage.clickOnLoginButton();
    }

    @Then("user goes to the account page")
    public void user_goes_to_the_main_page() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(new AuthorizedPage().isAccountContainerDisplayed(), true);

    }

}
