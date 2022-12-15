package com.driverfactory;

import java.io.FileReader;
import java.util.Properties;

import io.appium.java_client.AppiumDriver;


public class DriverManager {
	
	private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
	
	private DriverManager() {}
	
	public static AppiumDriver getDriver() {	
		
		return driver.get();
		
	}
	
	public static void setDriver(AppiumDriver driver) {
		DriverManager.driver.set(driver);
	}
	
    public static void quit() {
        
    	DriverManager.driver.get().quit();
    	
        driver.remove();
    }
    
//  public static Properties propertyreader() throws Exception {
//	String filePath = System.getProperty("user.dir");
//	FileReader a = new FileReader (filePath+"/src/test/resources/Data/testData.properties");
//	conf = new Properties();
//	conf.load(a);
//	return conf;
//}
    


}
