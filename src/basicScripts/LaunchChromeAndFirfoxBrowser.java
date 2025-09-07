package basicScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeAndFirfoxBrowser 
{
	public static void main(String[] args)
	{
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		
		String key1="webdriver.firefox.driver";
		String value1="./softwares/geckodriver";
		System.setProperty(key1, value1);
		FirefoxDriver driver1=new FirefoxDriver();
		
	}
}
