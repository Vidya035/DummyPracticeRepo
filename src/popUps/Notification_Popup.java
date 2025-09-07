package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popup 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver");
		
		ChromeOptions opts=new ChromeOptions();
		opts.addArguments("disable-notifications");
		
		WebDriver driver=new ChromeDriver(opts);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		
		WebElement notification = driver.findElement(By.id("browNotButton"));
		notification.click();
	}
}
