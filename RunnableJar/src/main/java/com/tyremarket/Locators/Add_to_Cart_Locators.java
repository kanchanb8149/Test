package com.tyremarket.Locators;

public class Add_to_Cart_Locators {

	public static String selectvehicle="";
	//Available Tyre Sizes for car tyres
	
	public static String btn_tyre_size="//a[@class='btn btn-xs btn-default']";
	//filter brand
	public static String filter_list="//div[@id='div1']//tr//td";
	public static String checkbox_brand="//div[@id='div1']//tr//td//input[@type='checkbox']";
	
	//tyre size list
	public static String size_list="//div[@id='div2']//tr//td";
	public static String chk_size="//div[@id='div2']//tr//td/input[@type='checkbox']";
	
	//list of tyre to add into cart
	public static String tyre_list_filter="//a[@class='tmpronameone']";
	
	
	public static String select_tyre="//input[@value='ADD TO CART']";
	public static String enter_pin="//input[@placeholder='Enter Area or PIN code']";
	public static String search_item="//span[@id='ucSearchedFor_lblSearchCriterion']";
}
