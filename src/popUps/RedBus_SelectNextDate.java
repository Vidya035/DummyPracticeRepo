package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus_SelectNextDate 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.redbus.in/");
		
		WebElement popup = driver.findElement(By.xpath("//span[.='Date of Journey']"));
		
		popup.click();
		
		
		// Freeze the Calender
		//Steps: Open Developer Tool>> cmd+shift+p>> type(focused)>>click rendering
		
		driver.findElement(By.xpath("//span[.='30']")).click();
		
	}
}
