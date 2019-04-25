package com.tyremarket.BusinessFlows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.tyremarket.Locators.Add_to_Cart_Locators;
import com.tyremarket.Reporting.Extent_Reporting;
import com.tyremarket.Utilities.Excel_Handling;
import com.tyremarket.Utilities.WrapperMethods;

public class Filter_TyreBrand_BusinessFlow {
	WebDriver driver;
	WrapperMethods method = new WrapperMethods();

	public void filter_brand(WebDriver driver, String TC_ID) throws Exception,InterruptedException
	{

		try 
		{
			System.out.println("-----filtering tyres by brand name------");
		
			String brand= Excel_Handling.Get_Data(TC_ID, "Brand");
			System.out.println("----getting brand from excel-----"+brand);	
			List<WebElement> brand_list=method.findElementsInList(driver, Add_to_Cart_Locators.filter_list, "filter brands");
			 List<WebElement>checkBox=method.findElementsInList(driver, Add_to_Cart_Locators.checkbox_brand, "check box");

			int i=0;
			for(WebElement brand_list_values : brand_list) 
			{
				  System.out.println(brand_list_values.getText());
				  if (brand_list_values.getText().contains(brand))
				  {
					  System.out.println("value : "+brand+" found");
					  
					 checkBox.get(i).click();
					  // method.clickFirst(driver, Add_to_Cart_Locators.checkbox_brand, "check box");
					  
					  System.out.println("check box selected successfully");
					  Extent_Reporting.Log_with_Screenshot("Brand selected", driver);
					  break;
					
				}
				  else 
				  {
					  i++;
					  System.out.println("Value not match , Please provide the correct brand name from excel");
					
				}
				  
			}
			
		

			//select by size
			System.out.println("----selecting size of tyres----");
			String size= Excel_Handling.Get_Data(TC_ID, "size");
			List<WebElement>sizeList=method.findElementsInList(driver, Add_to_Cart_Locators.size_list, "size list");
			List<WebElement>chkList=method.findElementsInList(driver, Add_to_Cart_Locators.chk_size, "check box");
			int j=0;
			for(WebElement sizelist_value:sizeList)
			{
				
				System.out.println(sizelist_value.getText());
				
				if(sizelist_value.getText().equals(size))
				{
					chkList.get(j).click();
					System.out.println("size selected successfully");
					
					break;
				}
				
				else {
					j++;
					System.out.println("----searching-----");
				}
				
			}
			
	//selecting tyre
			
		System.out.println("-----selecting tyre-----");
		List<WebElement>filtered_list=method.findElementsInList(driver, Add_to_Cart_Locators.tyre_list_filter, "filtered list");
		List<WebElement>select_tyre=method.findElementsInList(driver, Add_to_Cart_Locators.select_tyre, "select tyre");
		int k=0;
		for(WebElement filtered_list_val:filtered_list )
		{
			System.out.println(filtered_list_val.getText());
			
			if (filtered_list_val.getText().equals(Excel_Handling.Get_Data(TC_ID, "select_tyre")))
			{
				select_tyre.get(k).click();
				 Extent_Reporting.Log_with_Screenshot("Tyre selected", driver);
				break;
			}
			else
			{
				k++;
				System.out.println("Tyre not found");
			}
			
			
		}
			
		if (method.isElementDisplayed(driver, Add_to_Cart_Locators.search_item, "search_item")) 
		{
		/*method.inputText(driver, Add_to_Cart_Locators.enter_pin, Excel_Handling.Get_Data(TC_ID, "Pincode"), "Pincode");	
		Thread.sleep(2000);
		WebElement textbox = driver.findElement(By.xpath("//input[@id='autocompleteLocation']"));
		textbox.sendKeys(Keys.ARROW_DOWN);
		
		textbox.sendKeys(Keys.ENTER);*/
			
		method.key_down_with_inputTxt(Add_to_Cart_Locators.enter_pin, driver, "Pin code", Excel_Handling.Get_Data(TC_ID, "Pincode"));
		 Extent_Reporting.Log_with_Screenshot("Pin Entered", driver);
		System.out.println("Pin entered successfully and searching ");
		

		
		}
		else
		{
			System.out.println("something went wrong");
			throw new Exception("Element Not Present/visible");
		}
		
		
		
		}
		catch (Exception e) {
			System.out.println("---Something went wrong--");
			System.out.println(e.getMessage());
		}
}
}