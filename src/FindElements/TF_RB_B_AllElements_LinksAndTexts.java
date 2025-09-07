package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TF_RB_B_AllElements_LinksAndTexts 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElements(By.xpath("//input[@type='text']"));
	}
}
