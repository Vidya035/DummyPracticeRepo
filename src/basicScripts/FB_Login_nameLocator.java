package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_Login_nameLocator
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}
}
