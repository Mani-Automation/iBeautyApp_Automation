package com.driverfactory;

import io.appium.java_client.AppiumDriver;

public class DriverManager {
	public static String first_test;

	@SuppressWarnings("rawtypes")
	private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

	private DriverManager() {
	}

	@SuppressWarnings("rawtypes")
	public static AppiumDriver getDriver() {

		return driver.get();

	}

	public static void setDriver(@SuppressWarnings("rawtypes") AppiumDriver driver) {
		DriverManager.driver.set(driver);
	}

	public static void quit() {

		DriverManager.driver.get().quit();

		driver.remove();
	}

}
