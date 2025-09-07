package ScrollActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillEndRightAndleft
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.driver.chrome", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/scroll/newTabHorizontal");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("windows.scrollBy(document.body.scrollWidth,0)");
		Thread.sleep(2000);
		js.executeScript("windows.scrollBy(-document.body.scrollWidth,0)");
		driver.quit();
	}
}
