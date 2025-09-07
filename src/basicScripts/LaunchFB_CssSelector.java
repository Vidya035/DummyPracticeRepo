package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFB_CssSelector 
{

	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.driver.chrome", "./softwares/chromedriver");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.fb.com");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Admin");
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Admin@123");
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		
		//String key1="webdriver.firefox.driver";
		//String value1="./softwares/geckodriver";
		
		System.setProperty("webdriver.driver.firefox", "./softwares/geckodriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Admin@123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}
}
