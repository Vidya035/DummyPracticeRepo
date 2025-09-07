package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetch_innerText
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///Users/nakusha/Desktop/HTML/Facebook_2025.html");
		WebElement link = driver.findElement(By.tagName("a"));
		String elementText = link.getText();
		System.out.println(elementText);
		driver.quit();
	}
}
