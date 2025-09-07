package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PerformActions_ClickClear
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///Users/nakusha/Desktop/HTML/Facebook.html");
		Thread.sleep(2000);
		WebElement USN = driver.findElement(By.xpath("//input[@type='text'][1]"));
		WebElement Pwd = driver.findElement(By.xpath("//input[@type='text'][2]"));
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		WebElement radiobtn = driver.findElement(By.xpath("//input[@type='radio']"));
		WebElement link = driver.findElement(By.tagName("a"));
		USN.clear();
		Pwd.sendKeys("Vidya");
		checkbox.click();
		radiobtn.click();
		link.click();
		
		driver.quit();
		
	}
}
