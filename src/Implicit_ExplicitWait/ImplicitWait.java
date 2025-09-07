package Implicit_ExplicitWait;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		
		
		//Thread.sleep(1300);
		//Thread.sleep means we should only mention the time to wait the page load, but we dont know the exact time , to overcome
		// this confusion we should use the ImplicitWait
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//This works only in older Java versions (Java 8). Since you're using Java 17, switch to:

	
		 // Implicit Wait for Java 17+
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element = driver.findElement(By.id("name"));
	
		element.sendKeys("admin@123");
		driver.findElement("[]")
		
	}
}
