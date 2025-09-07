package ScrollActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisableElement
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///Users/nakusha/Desktop/HTML/Textfields_Disabled.html");
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('USN').value='user@gmail.com'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('PWD').value='Pass@123'");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		//driver.quit();
		
		 // Use JavaScriptExecutor to set value for a disabled input
        //JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("document.getElementById('USN').value='user@gmail.com'");
	}
}
