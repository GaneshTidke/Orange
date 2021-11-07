package BaseOrange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class BaseClass {
		public WebDriver driver;
		int TestID;
		static ExtentHtmlReporter reporter;
		
	public static WebDriver openChromeBrowser () {
		System.setProperty("webdriver.chrome.driver", "D:\\DATA\\Pramod\\DATA-PRAMOD\\Resume\\testing\\Chrome\\Chrome 95\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
return driver;
	}
	
	
	@BeforeTest
@Parameters ("browser")
public void beforetest(String browser) {
		
		reporter = new ExtentHtmlReporter("test-output\\ExtentReporter\\Extent.html");
		ExtentReports extend= new ExtentReports();
		extend.attachReporter (reporter);
		System.out.println("before test");
		
	if (browser.equalsIgnoreCase("Chrome"))
	{
		driver = openChromeBrowser();
	}
	else
	{
		driver = openFirefoxBrowser();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@AfterTest
	public void aftertest(){
		driver.quit();

		System.out.println("end");
      
	}

}
