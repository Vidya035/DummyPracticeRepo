package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAttributes 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		
		
		// Facebook_2025.html Link	
		
		
		//driver.get("file:///Users/nakusha/Desktop/HTML/Facebook_2025.html");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@id='l1']")).click();   // XPath by Attribute
		//driver.findElement(By.xpath("//a[@id='l1' and @name='n1']")).click();  // XPath by multiple Attribute
		//driver.quit();
		
		
		//Flipkart
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//span[.='Grocery']"));
		//driver.quit();
		
		// Facebook  - LINKTEXT
		
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.linkText("ಕನ್ನಡ")).click();
//		driver.quit();
		
		// FaceBook_2025 - PARTIALLINKTEXT
		
		//driver.get("file:///Users/nakusha/Desktop/HTML/Facebook_2025.html");
		//driver.findElement(By.partialLinkText("book")).click();
//		driver.findElement(By.partialLinkText("Facebook")).click();
//		driver.quit();
		
;		
		
		
		
		
	}

}
