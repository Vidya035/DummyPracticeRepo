package DataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookCredentiialEnter 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		FileInputStream fis=new FileInputStream("./Exel/FacebookCred.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("Sheet1");
		XSSFRow firstrow=sheet.getRow(0);
		XSSFCell cell0=firstrow.getCell(0);	
		XSSFCell cell1=firstrow.getCell(1);
		
		
		String username=cell0.getStringCellValue();
		String password= cell1.getStringCellValue();
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		driver.findElement(By.name("login")).click();
		book.close();
		fis.close();
		driver.quit();
		
	}
}
