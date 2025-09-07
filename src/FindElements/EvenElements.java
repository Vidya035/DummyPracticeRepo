package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EvenElements
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		for(int i=0;i<count-1;i=i+2)
		{
			WebElement link = links.get(i);
			String url = link.getAttribute("href");
			System.out.println(i+ " " +url);
		}
		
//		
		// Print ODD Using IF CONDITION
		
//		for(int i=0;i<count;i++)
//		{
//			if(i%2==0)
//			{
//				WebElement link=links.get(i);
//				String url=link.getAttribute("href");
//				System.out.println(i+ " " +url);
//			}
//		}
		driver.quit();
	}
}
