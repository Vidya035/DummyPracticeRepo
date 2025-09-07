package ScrollActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElement_UseArgument 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///Users/nakusha/Desktop/HTML/Textfields_Disabled.html");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//input[@value='admin']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value=' '",element);
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='user@gmail.com'",element);
		driver.quit();
	}
}
