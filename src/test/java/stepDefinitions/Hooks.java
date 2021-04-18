package stepDefinitions;

import FirstCucumberProject.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {
	
	@Before("@WebTest")
	public void beforeWeb()
	{
		System.out.println("******Before Web**********");
	}
	
	@After("@WebTest")
	public void afterWeb()
	{
		System.out.println("******After Web**********");
	}
	
	@After("@Selenium")
	public void afterSelenium()
	{
		driver.close();
	}
	
	@Before("@MobileTest")
	public void beforeMob()
	{
		System.out.println("******Before Mobile**********");
	}
	
	@After("@MobileTest")
	public void afterMob()
	{
		System.out.println("******After Mob**********");
	}

}
