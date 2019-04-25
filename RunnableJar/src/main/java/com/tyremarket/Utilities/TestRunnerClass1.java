package com.tyremarket.Utilities;

import org.testng.TestNG;

import com.tyremarket.Utilities.Create_TestNGXML;


public class TestRunnerClass1 {
	static TestNG testNG;
	
public static void main(String[] args) {
	
	testNG=new TestNG();
	//add test class to run
	testNG.setTestClasses(new Class[] {Create_TestNGXML.class});
	testNG.run();
}
}
