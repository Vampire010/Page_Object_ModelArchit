package DataSource;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataEnginr 
{
	String path = "C:\\Users\\giris\\eclipse-workspace\\Page_Object_ModelArchit\\src\\main\\java\\DataSource\\DataEngine.xlsx";
	
	public String getdata(String sname , int rno , int cno) throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
				
		XSSFSheet sheet = workbook.getSheet(sname);
		String s1 = sheet.getRow(rno).getCell(cno).getStringCellValue();
		
		return s1;
	}
}
