package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Select_Even_Odd
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		
		driver.navigate().to("file:///Users/nakusha/Desktop/HTML/CheckBox_10..html");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0;i<checkboxes.size();i++)
		{
			//if(i%2!=0)   // Even Number
			if(i%2==0)    // Odd Number
			{
				WebElement checkbox = checkboxes.get(i);
				if(!checkbox.isSelected())
				{
					checkbox.click();
					System.out.println(i + 1  + "  Select Odd numbered checkboxes");
				}
				
			}
			
		}
		driver.quit();
	}
}
