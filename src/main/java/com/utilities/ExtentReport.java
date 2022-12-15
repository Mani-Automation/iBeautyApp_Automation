package com.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {

	public static ExtentTest test;
	public static ExtentReports extent;
	public static String scenario_name;
	public static WebDriver driver;
	public static int scenario_count = 1;
	public static Screenshots screenshot = new Screenshots();

	public ExtentTest getExtentTest() {
		return test;
	}

	public static void startReport(String startTime) throws IOException {
		try {
			System.out.print("App : " + ConfigReader.getData("app") + " | " + "Env : " + ConfigReader.getData("appEnv")
					+ " | Segment : " + ExcelData.getExcelData("app_segment", "country") + " | Target : "
					+ ConfigReader.getData("target"));
			String path = System.getProperty("user.dir") + "/reports/" + startTime + "_ExtentReport.html";
			extent = new ExtentReports(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void startTest(WebDriver remote_driver, String scenario) throws IOException {
		try {
			driver = remote_driver;
			scenario_name = scenario;
			test = extent.startTest(ConfigReader.getData("app") + "_" + ConfigReader.getData("app_segment")
					+ "_Scenario_" + scenario_count + " : " + scenario);
			scenario_count++;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void endReport() {
		extent.flush();
	}
}