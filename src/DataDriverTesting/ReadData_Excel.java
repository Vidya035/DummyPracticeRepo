package DataDriverTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_Excel
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("./Exel/Book01.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(1);
		String value = cell.getStringCellValue();
		System.out.println(value);
		book.close();
		fis.close();
	}
}
