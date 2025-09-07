package MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		//Thread.sleep(2000);
		driver.navigate().to("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		Thread.sleep(2000);
		WebElement mobileCharger = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		
		WebElement mobileAccessories = driver.findElement(By.xpath("//div[.='Mobile Accessories']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(mobileCharger, mobileAccessories).perform();
		
		//Thread.sleep(2000);
		
		
		//driver.quit();
	}
}
//div[@class='drop-target-container']"

//div[normalize-space(text())='Mobile Accessories']\n