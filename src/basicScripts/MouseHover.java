package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.driver.chrome", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement Login = driver.findElement(By.xpath("//span[.='Login']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(Login).perform();
		driver.quit();
	}
}
