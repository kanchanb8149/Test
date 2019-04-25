package com.tyremarket.Utilities;

public class Constants
{
	
	
	public static final	String constantPathDir = System.getProperty("user.dir")+"/";
	
	public static final	String constantPathDirReport = System.getProperty("user.dir")+"/"+"test-output";
	
	
	public static final String driverPath = constantPathDir;
	public static final String datasheetPath = constantPathDir;
	public static final String configPath = constantPathDir;
	
	
	public static final String reportPath = System.getProperty("user.dir")+"/report/";
	
	public static final String snapshotsPath = "Snapshots/";
	
	public static final String videoFolder=System.getProperty("user.dir")+"/"+"video/";
	

	public static final String log="src/test/resources/log";
	public static String Resultfilename ="";

	//SQL DB Connection details
	public static String SQL_userName = "";
    public static String SQL_password = "";
    public static String SQL_databaseName = "";
    public static String SQL_hostName = "";
    public static String SQL_port = "";

    //DB2 connection details
    public static String DB2_userName = "";
    public static String DB2_password = "";
    public static String DB2_databaseName = "";
    public static String DB2_hostName = "";
    public static String DB2_port = "";
}
