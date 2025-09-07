package basicScripts;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot_Element 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement loginBtn = driver.findElement(By.name("login"));
		
		File temp=loginBtn.getScreenshotAs(OutputType.FILE);
		File perm=new File("./Screenshots/Defect4.png");
		
		// FileUtils.copyFile(temp, perm);
		
		
		
		 driver.quit();
		 

		
	}
}
