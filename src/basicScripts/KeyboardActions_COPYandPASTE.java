package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyboardActions_COPYandPASTE 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/virtual?sublist=0");
		//WebElement Txt1 = driver.findElement(By.xpath("//input[@value='ABCD'][1]"));
		
		WebElement Txt1 = driver.findElement(By.id("email"));
		WebElement Txt2 = driver.findElement(By.id("password"));
		
		
		Txt1.sendKeys(Keys.COMMAND+"A");
		Thread.sleep(2000);
		Txt1.sendKeys(Keys.COMMAND+"x");
		Txt2.sendKeys(Keys.COMMAND+"V");
	//	Text2.Sendkeys(Keys.COMMAND+"V");
		
		
		
	}
}




