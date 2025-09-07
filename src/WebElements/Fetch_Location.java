package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetch_Location 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///Users/nakusha/Desktop/HTML/Facebook.html");
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		Point location = checkbox.getLocation();
		System.out.println(location);
		System.out.println(location.getX());
		System.out.println(location.getY());
		driver.quit();
	}
}
