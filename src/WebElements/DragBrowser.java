package WebElements;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DragBrowser
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Point p = new Point(200,200);
		driver.manage().window().setPosition(p);
		driver.quit();
	}

}
