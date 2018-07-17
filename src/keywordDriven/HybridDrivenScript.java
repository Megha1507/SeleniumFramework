package keywordDriven;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class HybridDrivenScript 
{
	public static Action actionKeywords;
	public static String sActions;
	public static Method method[] ;
	
	 public static void main(String[] args) throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
		{
			try {
				String spath = "C:\\Users\\admin\\Desktop\\KeyExcel.xlsx";
				
				readExcel.setExcel(spath , "Sheet1");
				
					for(int iRow = 1 ; iRow <= 3 ; iRow++)
					{
						sActions= readExcel.getCellData(iRow,1);
						executeAction();
					}
					System.exit(0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}

	private static void executeAction() throws Exception, IllegalArgumentException, InvocationTargetException 
	{
	
		actionKeywords = new Action();
		try {
			System.out.println(method +" , "+ actionKeywords);
			 method = actionKeywords.getClass().getMethods();
			 
			 for(int i = 0;i<method.length;i++)
			 {
				
				 //This is now comparing the method name with the ActionKeyword value received from the excel
				 if(method[i].getName().equals(sActions))
				 { 
					 System.out.println("method["+i+"] :" + method[i]);
					 System.out.println("sActions:" + sActions);
					 //In case of match found, it will execute the matched method 
					 method[i].invoke(actionKeywords);
			 
					 //Once any method is executed, this break statement will take the flow outside of for loop
					 break;
				 }
			 }
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		  
	
}
