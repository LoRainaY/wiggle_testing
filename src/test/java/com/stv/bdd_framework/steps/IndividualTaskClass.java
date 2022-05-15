package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import com.stv.framework.core.drivers.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL2;

public class IndividualTaskClass extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage=new MainFactoryPage();
    LoginPage loginPage=new LoginPage();
    JavascriptExecutor js = ((JavascriptExecutor) getDriver());


    @Given("^Main page is loaded$")
    public void main_page_is_loaded() throws InterruptedException {
        getDriver().get(START_URL2);
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();

    }
    @When("^click on link Your Account$")
    public void click_on_link_your_account() throws InterruptedException {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        Thread.sleep(5000);
    }
    @When("^Scrolling down to find the link Secured by SECTIGO$")
    public void scrolling_down_to_find_the_link_secured_by_sectigo() throws InterruptedException {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);
        loginPage.clickOnLinkSecureBySectigo();
        Thread.sleep(3000);
    }
    @When("^come back and check first tab$")
    public void come_back_and_check_first_tab() throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(0));
        loginPage.isLoginContainerDisplayed();
        Thread.sleep(3000);
    }
    @When("^go to main page$")
    public void go_to_main_page() {
        loginPage.clickOnLinkMainPage();
    }
    @Then("^link Your Account is disabled$")
    public void link_your_account_is_disabled() {
        // Write code here that turns the phrase above into concrete actions
        mainFactoryPage.isAccountLinkDisplayed();
    }

}
