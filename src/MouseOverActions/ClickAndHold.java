package MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		Actions act=new Actions(driver);
		WebElement element = driver.findElement(By.id("circle"));
		act.clickAndHold(element).perform();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
