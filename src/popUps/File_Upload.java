package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		WebElement upload = driver.findElement(By.id("resume"));
		upload.sendKeys("/Users/nakusha/Desktop/Screenshot 2025-07-20 at 12.38.46 AM.png");
		
		//upload.sendKeys("/Users/nakusha/Desktop/Screenshot 2025-07-20 at 12.38.46 AM.png");

		
		// '/Users/nakusha/Desktop/Screenshot 2025-07-20 at 12.38.46 AM.png'
	}
}
