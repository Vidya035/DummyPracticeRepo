package ScrollActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollParticularElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.driver.chrome", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//h3[.='Free Materials']"));
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+" ,"+y+")");
	}
}
