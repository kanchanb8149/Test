package com.tyremarket.BusinessFlows;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tyremarket.Locators.SignUP_Locators;
import com.tyremarket.Reporting.Extent_Reporting;
import com.tyremarket.Utilities.Excel_Handling;
import com.tyremarket.Utilities.WrapperMethods;


public class SignUp_BusinessFlows {
	WebDriver driver;
	WrapperMethods method = new WrapperMethods();

	public void Enter_signUp_details(WebDriver driver, String TC_ID) throws Throwable 
	{
		 
	     
		try 
		{
			Thread.sleep(2000);
			System.out.println("Hii I am in sign up");

			Extent_Reporting.Log_with_Screenshot("URL open successfully", driver);
			method.clickLinkByLinkText(driver, SignUP_Locators.click_signUP_by_Link, "sign up link text");
			Extent_Reporting.Log_with_Screenshot("clicked on sign up", driver);
			
			//to close pupup
			
			Thread.sleep(1000);
			method.waitForElementVisible(driver, SignUP_Locators.pop_up);
			Thread.sleep(1000);
			method.clickFirst(driver, SignUP_Locators.close_pop_up, "close popup");
			System.out.println("Pop up closed");
			
			//enter mobile number
			System.out.println("Entering mobile");
			method.inputText(driver, SignUP_Locators.input_mobile, Excel_Handling.Get_Data(TC_ID, "MobileNo"), "MobileNo");
			Extent_Reporting.Log_with_Screenshot("Mobile number Entered", driver);

			
			//enter First name
			System.out.println("entering first name");
			method.inputText(driver, SignUP_Locators.input_first_name, Excel_Handling.Get_Data(TC_ID, "FirstName"), "FirstName");
			Extent_Reporting.Log_with_Screenshot("First Name Entered", driver);

			//lastname
			System.out.println("entering Last Name");
			method.inputText(driver, SignUP_Locators.input_last_name, Excel_Handling.Get_Data(TC_ID, "LastName"), "LastName");
			Extent_Reporting.Log_with_Screenshot("Last Name Entered", driver);

			
			//email
			System.out.println("entering email");
			method.inputText(driver, SignUP_Locators.input_Email, Excel_Handling.Get_Data(TC_ID, "Email_id"), "Email_id");
			Extent_Reporting.Log_with_Screenshot("Email id Entered", driver);

			
			//pin code
			System.out.println("entering pin code");
			method.inputText(driver, SignUP_Locators.input_Pin_code, Excel_Handling.Get_Data(TC_ID, "PinCode"), "PinCode");
			Extent_Reporting.Log_with_Screenshot("Pin Code Entered", driver);

			
			//city
			System.out.println("entering city");
			method.inputText(driver, SignUP_Locators.input_City, Excel_Handling.Get_Data(TC_ID, "City"), "City");
			Extent_Reporting.Log_with_Screenshot("City Entered", driver);


			//state
			String state_excel=Excel_Handling.Get_Data(TC_ID, "State");	
			
			method.selectDropBoxValue(driver, SignUP_Locators.select_State, state_excel, "state");
			
			Extent_Reporting.Log_with_Screenshot("State Entered", driver);

						
			//address
			System.out.println("entering address....");
			method.inputText(driver, SignUP_Locators.input_Address, Excel_Handling.Get_Data(TC_ID, "Address"), "Address");
			Extent_Reporting.Log_with_Screenshot("Address Entered", driver);

			//Password
			String password=Excel_Handling.Get_Data(TC_ID, "Password");
			String input_confirm_password=Excel_Handling.Get_Data(TC_ID, "Password");
			
			method.inputText(driver, SignUP_Locators.input_password,password , "Password");
			method.inputText(driver, SignUP_Locators.input_confirm_password, input_confirm_password, "confirm password");
			
			//verification for password
			if (password.equals(input_confirm_password)) 
			{
				System.out.println("both password gets matches");
			}
			
			else
			{
				System.out.println("pass word are not getting match");
			}
			
			//validation assertion 
			Assert.assertEquals(password, input_confirm_password,"Password does not match");

			System.out.println("Password matched and assertion match");

			
			//click on sign up button
			method.clickFirst(driver, SignUP_Locators.click_reg_btn, "sign up button");
			System.out.println("successfully clicked");
			
			if (method.isElementDisplay(driver, SignUP_Locators.get_text_signUpUser)) 
			{
				System.out.println("sign up successfully");
				Extent_Reporting.Log_with_Screenshot("sign up successfully", driver);
				
				
			}
			
			else {
				
				System.out.println("something went wrong");
				Extent_Reporting.Log_with_Screenshot("Required fields alert", driver);
				
				
				//to check required field
				if (method.isElementDisplay(driver, SignUP_Locators.get_text_error_all))
				{
					
					System.out.println("----please enter the required fields-----");
					
				}
				else if (method.isElementDisplay(driver, SignUP_Locators.error_mail)) 
				{
					System.out.println("----please enter another email----");
					Extent_Reporting.Log_with_Screenshot("email alert", driver);
				}		
				
			}
			
			
		}
		
		catch (Exception e)
		{
			
			System.out.println("Inside flows catch");
			Extent_Reporting.Log_Fail("sign up Error while entering details", "Failed", driver);
			System.out.println("signUp fail Failed");		
			
			
		}
		
	}
	


}