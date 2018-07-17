package DataDriver_Frameworks;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFile 
{
	 XSSFWorkbook wb;
	 XSSFSheet sheet;
	  
	 public ReadExcelFile(String excelPath) throws IOException
	 {
	
	 File src = new File(excelPath);
	 FileInputStream fis = new FileInputStream(src);
	 wb = new XSSFWorkbook(fis);
	 
	 }
	  
	 public String getData(int sheetnumber, int row, int column)
	 {
	 sheet = wb.getSheetAt(sheetnumber);
	 String data = sheet.getRow(row).getCell(column).toString();
	 return data;
	 }
	  
	 public int getRowCount(int sheetIndex)
	 {
	 int row = wb.getSheetAt(sheetIndex).getLastRowNum();
	 row = row + 1;
	 return row;
	 }
	
}
