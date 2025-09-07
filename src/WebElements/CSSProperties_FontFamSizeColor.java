package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSProperties_FontFamSizeColor
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.driver", "./softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement Loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
		String BC = Loginbutton.getCssValue("background-color");
		System.out.println(BC);
		String fontFamily = Loginbutton.getCssValue("font-family");
		System.out.println(fontFamily);
		driver.quit();
	}
}
