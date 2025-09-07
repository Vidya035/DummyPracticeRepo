package DataDriverTesting;


import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_MultiCredentials
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		FileInputStream fis=new FileInputStream("./Exel/FB_Multiple_Cred.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		for(int i=0;i<rowCount;i++)
		{
			String username=sheet.getRow(i).getCell(0).getStringCellValue();
			String password=sheet.getRow(i).getCell(1).getStringCellValue();
			
			driver.navigate().to("https://www.facebook.com/");
			

			driver.findElement(By.id("email")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(By.id("pass")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("pass")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.name("login")).click();
			
			Thread.sleep(2000);	
			
		}
		book.close();
		fis.close();
		driver.quit();
		
	}
}
