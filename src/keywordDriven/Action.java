package keywordDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Action 
{
		public static WebDriver driver ;
	
		public static void openBrowser()
		{
			driver= new ChromeDriver();
		}
		public static void navigate()
		{
			driver.get("https://www.craftsvilla.com/");
		}
		@Test
		public static void click() throws InterruptedException
		{
			driver.findElement(By.xpath("//span[contains(text(), 'Sign In')]")).click();
			Thread.sleep(3000);
		}
		
	
}
