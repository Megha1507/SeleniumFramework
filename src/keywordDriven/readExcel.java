package keywordDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel 
{
	static XSSFSheet sheet;
	static XSSFWorkbook wb;
	static XSSFCell Cell;
	
		public static void setExcel(String filepath, String sheetName) throws IOException
		{
			FileInputStream fis = new FileInputStream(filepath);
			
			wb = new XSSFWorkbook(fis);
			
			sheet = wb.getSheet(sheetName);
			
		}
		
		public static String getCellData(int row , int col)
		{
			 Cell = sheet.getRow(row).getCell(col);
			 String Celldata = Cell.getStringCellValue();
			 return Celldata;
		}
	
}
