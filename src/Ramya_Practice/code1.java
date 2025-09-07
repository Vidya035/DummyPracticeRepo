package Ramya_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class code1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.driver.chrome", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?_rdr");
		driver.findElement(By.name("pass")).sendKeys("hello");
	}
}
