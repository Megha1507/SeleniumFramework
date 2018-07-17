package keywordDriven;

import java.io.IOException;

public class DriverScript
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		String spath = "C:\\Users\\admin\\Desktop\\KeyExcel.xlsx";
		
		
		readExcel.setExcel(spath , "Sheet1");
		
		for(int iRow = 1 ; iRow <= 7 ; iRow++)
		{
			String sActions = readExcel.getCellData(iRow, 1);
			
			if(sActions.equals("openBrowser"))
			{
				Action.openBrowser();
			}
			else if (sActions.equals("navigate"))
			{
				Action.navigate();
			}
			else if (sActions.equals("click"))
			{
				Action.click();
			}

		}
	}
}
