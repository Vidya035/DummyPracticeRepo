package popUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Child_Browser_FetchTitle_CloseOnly_ParentTab 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		driver.findElement(By.xpath("//button[.='Shop Now']")).click();
		String parentTab = driver.getWindowHandle();
		System.out.println(parentTab);
		Set<String> childTabs = driver.getWindowHandles();
		for(String tab:childTabs)
		{
			WebDriver individualTab = driver.switchTo().window(tab);
			System.out.println(individualTab.getTitle());
			Thread.sleep(2000);
			
			if(tab.equals(parentTab))
			{
				individualTab.close();
			}
			
		}
	}
}
