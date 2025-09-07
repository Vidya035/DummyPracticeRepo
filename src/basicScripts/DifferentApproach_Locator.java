package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentApproach_Locator 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.driver.chrome", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin");
		
		//    OR
		
		//driver.findElement(By.xpath("//input[@id='email' and @type='text']")).sendKeys("Admin");
		driver.findElement(By.xpath(null));
		
	}

}
