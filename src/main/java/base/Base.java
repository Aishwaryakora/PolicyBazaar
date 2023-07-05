package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;


public class Base {

	//driver & browser setup
		 protected static WebDriver driver;
		
		public void launchBrowser()
		{
			 driver=new ChromeDriver();
			 driver.get("https://www.policybazaar.com/");
			 Reporter.log("Launching browser", true);
		}
		
		public void closeBrowser()
		{
			Reporter.log("Closing Browser", true);
			driver.quit();
	
		}	
}
