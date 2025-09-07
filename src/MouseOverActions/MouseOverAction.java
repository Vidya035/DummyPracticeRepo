package MouseOverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
		WebElement account = driver.findElement(By.xpath("//span[contains(@class,'nav-line-2') and contains(text(),'Account')]\n"+ ""));
		
		Actions act=new Actions(driver);
		act.moveToElement(account).perform();
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
