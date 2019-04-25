package com.tyremarket.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.tyremarket.BusinessFlows.SignUp_BusinessFlows;
import com.tyremarket.Reporting.Report_Setup;
import com.tyremarket.Utilities.Common_Functions;
import com.tyremarket.Utilities.Driver_Setup;
import com.tyremarket.Utilities.WrapperMethods;


public class SignUp_Test {
	//private static Logger Log = Logger.getLogger(Log.class.getName());
	public WebDriver driver;
	WrapperMethods method = new WrapperMethods();
	@Parameters({ "browserType", "appURL", "tcID" })
	@Test
	public void TC_SignUp(String browserType, String appURL, String TC_ID) throws Throwable{
		try
		{	
			SignUp_BusinessFlows signup_details=new SignUp_BusinessFlows();
			Common_Functions commonFunctions = new Common_Functions();	
			Driver_Setup n = new Driver_Setup();
			Report_Setup.InitializeReport(TC_ID);
			driver = n.initializeTestBaseSetup(browserType, appURL, TC_ID);
			commonFunctions.startRecording();
			
			//calling methods from signUp flow
			
			
			
			
			signup_details.Enter_signUp_details(driver, TC_ID);
		
			Report_Setup.extent.endTest(Report_Setup.test);
			Report_Setup.extent.flush();
			commonFunctions.stopRecording();
			
		}
		catch (Exception e) {
				
		
			Common_Functions commonFunctions = new Common_Functions();
			commonFunctions.stopRecording();
			Report_Setup.extent.endTest(Report_Setup.test);
			Report_Setup.extent.flush();
			//driver.close();
			System.out.println("TC_HLS_Error");

		}
		
		}
	
	
	/*@AfterTest
	void close_driver() {
	//driver.quit();

	}*/
}
