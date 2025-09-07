package WebElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox_Displayed 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///Users/nakusha/Desktop/HTML/CheckBox_10..html");
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(checkbox.isDisplayed())
		{
			System.out.println("The element is Dispalyed");
			if(checkbox.isEnabled())
			{
				System.out.println("Is Enabled");
				if(checkbox.isSelected())
				{
					System.out.println("Is Selected");
				}
				else
				{
					System.out.println("Not Selected");
				}
			}
			else
			{
				System.out.println("Is Disabled");
			}
		}
		else
		{
			System.out.println("The element is not d=Displayed");
		}
		driver.quit();
		
	}
}
