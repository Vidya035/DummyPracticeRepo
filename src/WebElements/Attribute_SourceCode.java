package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Attribute_SourceCode 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///Users/nakusha/Desktop/HTML/Facebook.html");
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.tagName("a"));
		String av = link.getAttribute("href");
		System.out.println(av);
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		String av1 = checkbox.getAttribute("type");
		System.out.println(av1);
		driver.quit();
	}
}
