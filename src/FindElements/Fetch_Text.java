package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetch_Text 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(WebElement link:links)
		{
			String text = link.getText();
			System.out.println(text);
		}
		driver.quit();
	}
}
