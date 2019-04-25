package com.tyremarket.Locators;

public class Search_CarTyre_Locators {

	//by vehicle
	public static String select_car_tyre_tab_bylink="Car Tyres";
	public static String select_vehicle="//span[@id='select2-chosen-1']";
	public static String get_text_all_vehivle="//ul[@id='select2-results-1']//li";
	public static String input_vehicle_value="//input[@id='s2id_autogen1_search']";
	//model
	public static String select_model="//span[@id='select2-chosen-2']";
	public static String get_text_all_model="//ul[@id='select2-results-2']//li";
	public static String input_model="//input[@id='s2id_autogen2_search']";
	//submodel
	public static String select_submodel="//span[@id='select2-chosen-3']";
	public static String get_text_all_submodel="//ul[@id='select2-results-3']//li";
	public static String input_Submodel="//input[@id='s2id_autogen3_search']";
	//eneter pin
	public static String input_pin_code="//input[@id='autocomplete_search']";
	public static String btn_search="//a[@id='tmseachbtn']";
	//visible
	public static String car_search="//div[@id='divSelectedVehicleOrSize']/h1";
	public static String get_text_error="//b[contains(text(),'Please Select a Vehicle and Model.')]";
	//size
	public static String click_search_by_Size_link="Search by size";
	
	public static String select_width="//select[@id='cboWidth']";
	public static String width_list="//select[@id='cboWidth']/option";
	
	public static String select_profile= "//select[@id='cboProfile']";
	public static String profile_List="//select[@id='cboProfile']/option";
	
	public static String select_Rim="//select[@id='cboRim']";
	public static String Rim="//select[@id='cboRim']/option";
	
	public static String select_speed_rating="//select[@id='cboSpeedRating']";
	public static String input_pin="//input[@placeholder='Area/PIN Code (optional)']";
	
}
