package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAppMultiDropdown
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.driver.chrome", "./softwares/chromedriver");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		Select s=new Select(dropdown);
		if(s.isMultiple())
		{
			System.out.println("It is a Multiselect dropdown");
			driver.findElement(By.xpath("//button[.='Add']")).click();
			s.selectByValue("Mens Casual Premium Slim Fit T-Shirts ");
		}
		else
		{
			System.out.println("It is not a Multiselect dropdown");
		}
	}
}
