package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	
	
	public static void TakeScreenShot(WebDriver driver, int TestID) throws IOException
	{
		String Date_Time = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dst = new File("test-output\\takescreenshots\\test_" +TestID +"Date_Time " + ".jpg");
		FileHandler.copy(src, dst);
		
	}

}
