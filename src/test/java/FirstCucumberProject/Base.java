package FirstCucumberProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	
	public WebDriver getDriver() throws IOException
	{
		WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	
    	FileInputStream fs = new FileInputStream("C:\\Users\\chipl\\Java\\CucumberWithJava-workspace\\FirstCucumberProject\\src\\test\\java\\FirstCucumberProject\\global.properties");
    	
    	Properties prop = new Properties();
    	prop.load(fs);
    	
    	driver.get(prop.getProperty("url"));
    	return driver;
	}

}
