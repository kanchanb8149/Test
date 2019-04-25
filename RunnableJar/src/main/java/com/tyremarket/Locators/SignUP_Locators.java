package com.tyremarket.Locators;

public class SignUP_Locators {
	
	public static String click_signUP_by_Link="Sign-Up";
	//mobile
	public static String input_mobile="//input[@id='txtDayPhone']";
	//first name
	public static String  input_first_name="//input[@id='txtUserFirstName']";
	//last name
	public static String  input_last_name="//input[@id='txtLastName']";
	//email
	public static String  input_Email= "//input[@name='txtEmail']";
	public static String get_text_signUpUser="(//span[@class='usernamelinmit'])[1]";
	
	public static String error_mail="//li[contains(text(),'Not a valid email address. Must follow email@host.')]";
	
	
	
	public static String  input_Pin_code="//input[@id='txtZIP']";
	public static String  input_City="//input[@id='txtCity']";
	//select state
	public static String  select_State="//select[@id='ucState_cboStates']";
	public static String select_state_options_list="//select[@id='ucState_cboStates']/option";
	//select country
	public static String select_Country="//select[@id='cboCountries']";
	public static String select_Country_options="//select[@id='cboCountries']/option";

	//address
	public static String input_Address="//input[@id='txtAddress1']";
	//password
	public static String input_password="//input[@id='txtPassword']";
	//confirm password
	public static String input_confirm_password="//input[@id='txtPasswordConfirm']";

	//register button
	public static String click_reg_btn="//input[@id='btnRegister']";
	
	//pop up
	public static String pop_up="//div[@class='leadin-preview-wrapper']";
	public static String close_pop_up="//button[@class='leadinModal-close']";
	
	
	public static String get_text_error_all="//div[@class='error']//ul";
	


}
