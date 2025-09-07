package DataDriverTesting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Crede_Write 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		FileOutputStream fos=new FileOutputStream("./Excel/FB_Multiple_Cred_Write.xlsx");
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		
	}
}
