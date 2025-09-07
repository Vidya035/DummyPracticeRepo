package basicScripts;

import java.util.jar.Manifest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealTime_JioApp_Testing 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.driver.chrome", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jio.com/selfcare/login/");
		driver.findElement(By.linkText("Mobile")).click();
		driver.findElement(By.linkText("Recharge")).click();
		driver.findElement(By.id("submitNumber")).sendKeys("8591004149");
			
	}

}
