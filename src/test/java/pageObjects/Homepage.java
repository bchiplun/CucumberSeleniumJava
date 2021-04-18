package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	public WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By search = By.xpath("//input[@type='search']");
	By productName = By.cssSelector("h4.product-name");
	By increment = By.cssSelector("a[class='increment']");
	By addtocart = By.xpath("//button[text()='ADD TO CART']");
	By cart = By.xpath("//img[@alt='Cart']");
	By proceedtocheckout = By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
	
	
	
	
	public WebElement getSearchBox()
	{
		return driver.findElement(search);
	}
	
	public WebElement getProductName()
	{
		return driver.findElement(productName);
	}
	
	public WebElement getIncrement()
	{
		return driver.findElement(increment);
	}
	
	public WebElement getAddtoCart()
	{
		return driver.findElement(addtocart);
	}
	
	public WebElement getCart()
	{
		return driver.findElement(cart);
	}
	
	public WebElement getProceedtoCheckout()
	{
		return driver.findElement(proceedtocheckout);
	}
	

}
