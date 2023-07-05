package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {
	// commonly used method
		//screenShot
		//Scrolling
		//Data reading
		//Wait
		
		
		public static  void takeScreenShot (WebDriver driver, String fileName) throws IOException
		{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		File dest=new File("C:\\Users\\Akshay Kora\\Desktop\\Velocity\\Selenium notes\\myscreenshot\\"+fileName+".png");
		FileHandler.copy(src, dest);
	Reporter.log("taking screenshot", true);
		
		}
		
		public static void scrollIntoView(WebDriver driver, WebElement element)
		{
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", element);
			Reporter.log("scrollingIntoView", true);
		}
		
		public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
		{
			FileInputStream myFile=new FileInputStream("‪‪D:\\New folder\\Book1.xlsx");
		String value = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(row).getCell(cell).getStringCellValue();
		return value;
		}
		
		public static void wait(int waitTime) throws InterruptedException
		{
			Thread.sleep(waitTime);
		}
}
