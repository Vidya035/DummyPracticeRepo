package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementsExample 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///Users/nakusha/Desktop/HTML/Facebook.html");
		
		
	}
}
