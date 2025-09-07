package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script01
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.driver.chrome", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.fb.com");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.close();

	}

}
