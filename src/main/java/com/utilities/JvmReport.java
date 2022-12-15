package com.utilities;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_Login_Page;
import pages.Lancome.Lancome_AU.*;

public class JvmReport {

	static String platform;
	static String build;
	static String platformVersion;
	static String deviceName;
	public static final Logger logger = LoggerFactory.getLogger(JvmReport.class);
	static {
		try {
			platform = System.getProperty("platform");
			build = System.getProperty("build");
			platformVersion = System.getProperty("platformVersion");
			deviceName = System.getProperty("deviceName");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Time totalTime() {
		String start_Time = System.getProperty("start_time");
		String endtime_Time = System.getProperty("Endtime_time");
		String start_modifiedTime = start_Time.substring(start_Time.lastIndexOf(" ") + 1);
		String end_modifiedTime = endtime_Time.substring(endtime_Time.lastIndexOf(" ") + 1);
		long difference;
		Time t1 = Time.valueOf(start_modifiedTime);
		Time t2 = Time.valueOf(end_modifiedTime);
		if (t2.getTime() >= t1.getTime()) {
			difference = t2.getTime() - t1.getTime() - 19800000;
		} else {
			difference = t1.getTime() - t2.getTime() - 19800000;
		}
		java.sql.Time time = new java.sql.Time(difference);
		return time;
	}

	public static void generateReport(String JsonFile) throws IOException {
		if (platform != null && !platform.trim().isEmpty() && build != null && !build.trim().isEmpty()
				&& platformVersion != null && !platformVersion.trim().isEmpty() && deviceName != null
				&& !deviceName.trim().isEmpty()) {
			String time = totalTime().toString();
			Configuration config = new Configuration(new File(System.getProperty("user.dir") + "/target/ResultsMobile"),
					"AutomationReport");
			config.addClassifications("Platform	", platform);
			config.addClassifications("DeviceName", deviceName);
			config.addClassifications("StartTime", System.getProperty("start_time"));
			config.addClassifications("EndTime", System.getProperty("Endtime_time"));
			config.addClassifications("ExecutionTime", time);
			config.addClassifications("PlatformVersion", platformVersion);
			config.addClassifications("Build", build);
			List<String> JsonFiles = new ArrayList<String>();
			JsonFiles.add(JsonFile);
			ReportBuilder report = new ReportBuilder(JsonFiles, config);
			report.generateReports();
		} else {
			logger.info("JVM Report : ENV Variable is missing.Please verify......!");
		}
	}

}
