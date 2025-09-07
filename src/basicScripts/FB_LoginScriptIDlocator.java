package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_LoginScriptIDlocator
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.driver.chrome", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&flo=1&deoia=1&jlou=Afd7djoNsLDx7bBk5k2EwQ7__0moYv-eqjjgraYYwGUS0EG6VoUCHWIwzpSwYtm3jr64yLLSkm5nSbwr8z1_kwzi05L0D16UeBILUlJtC52orQ&smuh=48494&lh=Ac9O7vQZPwqWf-tsGts");
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin@123");
		driver.findElement(By.id("u_0_9_ge")).click();   // Id locator value not fetching so we have to check next locator.
//		Thread.sleep(2000);
//		driver.quit();
		
	}
}
