package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllURL_FlipKart
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.driver.chrome", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
	}
}
