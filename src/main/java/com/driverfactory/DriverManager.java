package com.driverfactory;

import java.io.IOException;

import com.utilities.ConfigReader;

import io.appium.java_client.AppiumDriver;

public class DriverManager {
	public static boolean first_test = true;

	private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

	private DriverManager() {
	}

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



}
