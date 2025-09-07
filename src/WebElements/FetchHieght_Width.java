package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchHieght_Width 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///Users/nakusha/Desktop/HTML/Facebook.html");
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.tagName("a"));
		Dimension size = link.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		driver.quit();
	}
}
