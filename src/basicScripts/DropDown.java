package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.driver.chrome", "./softwares/chromedriver");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///Users/nakusha/Desktop/HTML/dropdown.html");
		WebElement dropdown = driver.findElement(By.id("skills"));
		Select s=new Select(dropdown);
		if(s.isMultiple())
		{
			System.out.println("It is a Multiselect dropdown");
			s.selectByValue("i");
			s.selectByVisibleText("TESTNG");
			Thread.sleep(2000);
			s.deselectByValue("i");
			s.deselectByVisibleText("TESTNG");
			
		}
		else
		{
			System.out.println("It is not a Multiselect dropdown");
		}
		//driver.quit();
		
		
	}
}
