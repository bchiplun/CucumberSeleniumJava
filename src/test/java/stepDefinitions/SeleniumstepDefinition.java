package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;


import FirstCucumberProject.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

import pageObjects.CheckOutPage;
import pageObjects.Homepage;

@RunWith(Cucumber.class)
public class SeleniumstepDefinition extends Base {
	
	public WebDriver driver;
	Homepage h ;
	CheckOutPage c;
	
    @Given("^User is on Greenkart home page$")
    public void user_is_on_greenkart_home_page() throws IOException  {
    	
    	driver = getDriver();	
    }

   
    @When("^User seach \"([^\"]*)\" in search box$")
    public void user_seach_something_in_search_box(String strArg1) throws Throwable {
    	h = new Homepage(driver);
        h.getSearchBox().sendKeys(strArg1);;
    	Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" is displayed on the page$")
    public void something_is_displayed_on_the_page(String strArg1) throws Throwable {
    	h = new Homepage(driver);
    	Assert.assertTrue(h.getProductName().getText().contains(strArg1));
    }
    
    @When("^User adds the vegetable into cart$")
    public void user_adds_the_vegetable_into_cart() throws Throwable {
    	h = new Homepage(driver);
        h.getIncrement().click();
        h.getAddtoCart().click();
        Thread.sleep(3000);
    }

    @When("^User goes to cart page$")
    public void user_goes_to_cart_page() throws Throwable {
    	h = new Homepage(driver);
    	h.getCart().click();
    	h.getProceedtoCheckout().click();
    }

    @Then("^\"([^\"]*)\" is displayed on the cart page$")
    public void is_displayed_on_the_cart_page(String arg1) throws Throwable {
       c = new CheckOutPage(driver);
    	Assert.assertTrue(c.getProductName().getText().contains(arg1));
    	
    }

}
