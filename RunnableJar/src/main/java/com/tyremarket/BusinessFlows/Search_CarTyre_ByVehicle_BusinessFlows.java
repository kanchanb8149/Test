package com.tyremarket.BusinessFlows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.tyremarket.Locators.Add_to_Cart_Locators;
import com.tyremarket.Locators.Search_CarTyre_Locators;
import com.tyremarket.Reporting.Extent_Reporting;
import com.tyremarket.Utilities.Excel_Handling;
import com.tyremarket.Utilities.WrapperMethods;

public class Search_CarTyre_ByVehicle_BusinessFlows {
	WebDriver driver;
	WrapperMethods method = new WrapperMethods();

	public void search_CarTyre_by_Vehicle(WebDriver driver, String TC_ID) throws Throwable 
	{

		try 
		{
			System.out.println("-----searching car tyres by vehicle name------");
			
			System.out.println("clicking Car tyre tab");
			
			method.clickLinkByLinkText(driver, Search_CarTyre_Locators.select_car_tyre_tab_bylink, "Car tyre Tab");
			
			Extent_Reporting.Log_with_Screenshot("Click on Car Tyres Tab", driver);
			
			//vehicle 
			method.Clickbtn(driver, Search_CarTyre_Locators.select_vehicle, "select_vehicle");
			Thread.sleep(3000);

			/*List<WebElement> vehicle_list=method.findElementsInList(driver, Search_CarTyre_Locators.get_text_all_vehivle, "vehicles");
			
			for(WebElement vehicle_list_values : vehicle_list) 
			{
				  System.out.println(vehicle_list_values.getText());
			}
			*/
			
			
			System.out.println("----getting vehicle  value from excel-----");
			String vehicle= Excel_Handling.Get_Data(TC_ID, "Select_vehicle");
			System.out.println(vehicle);
			
			method.inputText_Enter(driver, Search_CarTyre_Locators.input_vehicle_value, vehicle, "vehicle");
			
			Extent_Reporting.Log_with_Screenshot("Selecting Vehicle", driver);
			Thread.sleep(3000);
			
			//model
			method.clickFirst(driver, Search_CarTyre_Locators.select_model, "Model");
			Thread.sleep(3000);
			
			List<WebElement> model_list=method.findElementsInList(driver, Search_CarTyre_Locators.get_text_all_model, "model");
			//List<WebElement> model_list=driver.findElements(By.xpath("//ul[@id='select2-results-2']//li"));
			for(WebElement model_list_val : model_list) 
			{
				  System.out.println(model_list_val.getText());
			}
		
			//entering model from excel
			System.out.println("----entering Model from excel-----");
			method.inputText_Enter(driver, Search_CarTyre_Locators.input_model, Excel_Handling.Get_Data(TC_ID, "Model"), "Model");
			Extent_Reporting.Log_with_Screenshot("Selecting Model", driver);
			Thread.sleep(3000);
			
			//submodule
			method.clickFirst(driver, Search_CarTyre_Locators.select_submodel, "SubModel");
			
			Thread.sleep(3000);
			List<WebElement> sub_model_list=method.findElementsInList(driver, Search_CarTyre_Locators.get_text_all_submodel, "model");
			for(WebElement submodel_list_val : sub_model_list) 
			{
				  System.out.println(submodel_list_val.getText());
			}
		
			//entering model
			System.out.println("::entering Sub Model from excel::"+Excel_Handling.Get_Data(TC_ID, "SubModel"));
			Thread.sleep(3000);
			method.inputText_Enter(driver, Search_CarTyre_Locators.input_Submodel, Excel_Handling.Get_Data(TC_ID, "SubModel"), "SubModel");
			Extent_Reporting.Log_with_Screenshot("Selecting SubModel", driver);

			//enter pin code
			
			method.key_down_with_inputTxt(Search_CarTyre_Locators.input_pin, driver, "Pin code", Excel_Handling.Get_Data(TC_ID, "Pincode"));
			System.out.println("Pin code enter successfully");
			Extent_Reporting.Log_with_Screenshot("pin code entered", driver);

			//method.inputText(driver, Search_CarTyre_Locators.input_pin_code, Excel_Handling.Get_Data(TC_ID, "Pincode"), "Pincode");
		
			Thread.sleep(500);
			method.clickFirst(driver, Search_CarTyre_Locators.btn_search,"search btn");
			Extent_Reporting.Log_with_Screenshot("Search Button Clicked", driver);

		
			if (method.isElementDisplayed(driver, Search_CarTyre_Locators.car_search, "Car search"))
			
			{
				System.out.println("Car tyres search successfully");
				Extent_Reporting.Log_with_Screenshot("search result", driver);
			}
			
			else {
				
				System.out.println("Something went wrong...! ");
				String error=method.getInputTextValue(driver, Search_CarTyre_Locators.get_text_error, "Error text");
				System.out.println(error);
				Extent_Reporting.Log_Fail("search car tyres failed", "Fail", driver);
			}
			
			
			
		}
		
		catch (Exception e) {
			System.out.println("Inside catch block");
			//System.out.println(e.getMessage());
			Extent_Reporting.Log_with_Screenshot("Something went wrong", driver);
			
		}
		}
}
