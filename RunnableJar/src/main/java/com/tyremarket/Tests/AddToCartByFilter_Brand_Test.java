package com.tyremarket.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tyremarket.BusinessFlows.Filter_TyreBrand_BusinessFlow;
import com.tyremarket.BusinessFlows.Search_CarTyre_ByVehicle_BusinessFlows;
import com.tyremarket.BusinessFlows.SignUp_BusinessFlows;
import com.tyremarket.Reporting.Report_Setup;
import com.tyremarket.Utilities.Common_Functions;
import com.tyremarket.Utilities.Driver_Setup;
import com.tyremarket.Utilities.WrapperMethods;

public class AddToCartByFilter_Brand_Test {
	public WebDriver driver;
	WrapperMethods method = new WrapperMethods();
	@Parameters({ "browserType", "appURL", "tcID" })
	@Test
	public void TC_filterTyreBrand_addToCart(String browserType, String appURL, String TC_ID) throws Throwable{
		
		
		try
		{	Search_CarTyre_ByVehicle_BusinessFlows carSearch=new Search_CarTyre_ByVehicle_BusinessFlows();
			Filter_TyreBrand_BusinessFlow addToCart=new Filter_TyreBrand_BusinessFlow();
			Common_Functions commonFunctions = new Common_Functions();	
			Driver_Setup n = new Driver_Setup();
			Report_Setup.InitializeReport(TC_ID);
			driver = n.initializeTestBaseSetup(browserType, appURL, TC_ID);
			commonFunctions.startRecording();
			
			
			//signUP
			/*SignUp_BusinessFlows signUp=new SignUp_BusinessFlows();
			signUp.Enter_signUp_details(driver, TC_ID);*/
			//calling serach tyre  method
			
			carSearch.search_CarTyre_by_Vehicle(driver, TC_ID);
			//calling filter
			
			addToCart.filter_brand(driver, TC_ID);
			
			
			
			
			
			
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
			System.out.println("TC_Login_Error");
		}
		}
}
