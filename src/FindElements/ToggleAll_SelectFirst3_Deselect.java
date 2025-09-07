package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToggleAll_SelectFirst3_Deselect
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		
		driver.navigate().to("file:///Users/nakusha/Desktop/HTML/CheckBox_10..html");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		// Select All Checkboxes
		
		for (WebElement checkbox : checkboxes)
		{
			if (!checkbox.isSelected())
			{
				checkbox.click();
				//Thread.sleep(2000);
			}
		}
		
		// Deselect all checkboxes
		 for (WebElement checkbox : checkboxes) 
		 {
	            if (checkbox.isSelected())  // Corrected condition
	            {   
	                checkbox.click();
						//Thread.sleep(2000);
				}
		 }
	
		
		// Select First 3 checkboxes
		
				 for (int i = 0; i < 3; i++) 
				 {
			            WebElement checkbox = checkboxes.get(i);
			            if (!checkbox.isSelected()) 
			            {
			                checkbox.click();
			                Thread.sleep(2000);
			            }
				 }
		
		
		driver.quit();
	}
}
