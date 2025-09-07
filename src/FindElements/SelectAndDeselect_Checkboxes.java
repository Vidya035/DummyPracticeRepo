package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectAndDeselect_Checkboxes 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		
		driver.navigate().to("file:///Users/nakusha/Desktop/HTML/CheckBox_10..html");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
		
		for(WebElement checkbox:checkboxes)
		if(!checkbox.isSelected())
		{
			checkbox.click();
			System.out.println("Checkbox is selected");
		}
		Thread.sleep(2000);
		for(WebElement checkbox:checkboxes)
		if(checkbox.isSelected())
			{
				checkbox.click();
				System.out.println("checkbox is not selected");
		}
		

		driver.quit();
	}
}
