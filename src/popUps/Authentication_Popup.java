package popUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Popup
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
	}
}
