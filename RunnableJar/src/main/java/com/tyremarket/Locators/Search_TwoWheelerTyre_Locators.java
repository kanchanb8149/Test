package com.tyremarket.Locators;

public class Search_TwoWheelerTyre_Locators {

	
	//Two Wheeler-Tyre link
	//Links
	public static String lnkTwoWheelerTyre = "//a[@id='ucStoreHeader_repeaterTab__ctl1_Hyperlink1']";
	//Two Wheeler-Tyre link->-> Search By size link
	
	public static String lnkSearchBySize ="//a[text()='Search by size']";
	
	public static String listModel ="//ul[@id='select2-results-1']//li";
	
	//Dropdowns
	//Two Wheeler-Tyre link->Vehicle dropdown
	public static String drpVehicle = "//span[@id='select2-chosen-1']";
	//Two Wheeler-Tyre link->Vehicle Model
	public static String drpModel = "//span[@id='select2-chosen-2']";
	//Two Wheeler-Tyre link->Vehicle SubModel
	public static String drpSubModel = "//span[@id='select2-chosen-3']";
	//Two Wheeler-Tyre link->Select By Size link->Width dropdown
	public static String drpWidth = "//select[@id='cboWidth']";
	//Two Wheeler-Tyre link->Select By Size link->Profile dropdown
	public static String drpProfile = "//select[@id='cboProfile']";
	//Two Wheeler-Tyre link->Select By Size link->Rim dropdown
	public static String drpRim = "//select[@id='cboRim']";
	//Two Wheeler-Tyre link->Select By Size link->Speed Rating dropdown
	public static String drpSpeedRating = "//select[@id='cboSpeedRating']";
	
	//Inputs
	//Two Wheeler-Tyre link->Vehicle dropdown click ->vehicle search
	public static String inpVehicleSearch ="//input[@id='s2id_autogen1_search']";
	//Two Wheeler-Tyre link->Model dropdown click ->model search
	public static String inpModelSearch ="//input[@id='s2id_autogen2_search']";
	//Two Wheeler-Tyre link->subModel dropdown click ->submodel search
	public static String inpSubModelSearch ="//input[@id='s2id_autogen3_search']";
	//Two Wheeler-Tyre link->area pin
	public static String inpAreaPin ="//input[@id='autocomplete_search']";
	
	//Buttons 
	public static String btnSearch = "//a[@id='tmseachbtn']";
	
	//label
	public static String lblTwoWheelerTyresList = "//h2[text()='Economy Range Tyre(s) for Honda CB Shine Electric Start (Drum/Disc) Alloy']";
	
	
}
