package WebElements;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Resize_Browser
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		
		
        Dimension d = new Dimension(400,1000);	
        driver.manage().window().setSize(d);
       
		
		driver.quit();
	}

}
