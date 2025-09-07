package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertOrJavaScript_PopUP 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/alert?sublist=0");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		
		Alert popup = driver.switchTo().alert();
		
		popup.sendKeys("Delete this product");
		
		System.out.println(popup.getText());
		popup.accept();
		
		
		driver.quit();
		
	}
}
