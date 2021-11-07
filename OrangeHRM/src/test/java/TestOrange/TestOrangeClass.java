package TestOrange;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseOrange.BaseClass;
import POMClass.HomePage;
import POMClass.LeavePage;
import POMClass.LoginPage;
import Utility.Utility;

public class TestOrangeClass extends BaseClass {

		
	public LoginPage loginpage;
	public HomePage homepage;
	public LeavePage leavepage;

	int TestID;
		@BeforeClass
	
		public void beforetest () {
			 loginpage = new LoginPage (driver);	
			 homepage = new HomePage (driver);
			leavepage = new LeavePage (driver);
		}
		
		@BeforeMethod
		public void beforemethod () {
			loginpage.Username();
			loginpage.Password();
			loginpage.Login();	
		}
		
		
		@Test
		public void test1 () {
			TestID = 100;
		homepage.PIM();
		homepage.Time();
		homepage.Leave();
		
		
		
		}
		
		@Test
		public void test2 () {
			TestID = 200;
		leavepage.subunit();
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		}
		
		@AfterMethod
		public void aftermethod (ITestResult result) throws IOException, InterruptedException{
			if (ITestResult.FAILURE== result.getStatus())
			{
				Utility.TakeScreenShot(driver, TestID);
				
			}
			
			Thread.sleep(10000);
			System.out.println("After Method");
		}
		
		@AfterClass
		public void afterclass(){
			System.out.println("Null");
		}
		
				

	}


