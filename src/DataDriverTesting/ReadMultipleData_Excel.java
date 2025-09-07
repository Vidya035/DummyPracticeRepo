package DataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleData_Excel 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./Exel/FlipKartLiinks.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("links");
		int lastRowNum = sheet.getLastRowNum();
		for(int i=0;i<=lastRowNum;i++)
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(0);
			String value = cell.getStringCellValue();
			System.out.println(i + " " +value);
			
		}
		book.close();
		fis.close();
		
		
	}
}
