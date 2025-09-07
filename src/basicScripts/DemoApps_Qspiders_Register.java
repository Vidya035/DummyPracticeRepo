package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoApps_Qspiders_Register
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Admin");
		driver.findElement(By.id("email")).sendKeys("Admin@123");
		driver.findElement(By.id("password")).sendKeys("Passwod@123");
		//driver.findElement(By.className("")).click();
		driver.findElement(By.className("poppins text-[12px] font-sans font-bold text-slate-500 relative top-3 hover:text-slate-700 cursor-pointer underline")).click();
		
		
	}

}
