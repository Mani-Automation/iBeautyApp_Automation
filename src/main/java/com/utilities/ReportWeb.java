package com.utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.reusableMethods.CommonActions;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportWeb {

	// String seg = ConfigReader.getData("app_segment").toString();

	ConfigReader cr = new ConfigReader();

	public void generateReport(String JsonFile, String start_time) throws IOException {

		Configuration config = new Configuration(new File(System.getProperty("user.dir") + "/reports/"
				+ cr.getData("app") + "/" + cr.getData("app_segment") + " " + start_time), "iBeauty_MobileAutomation");

		List<String> JsonFiles = new ArrayList<>();
		JsonFiles.add(JsonFile);
		ReportBuilder report = new ReportBuilder(JsonFiles, config);
		report.generateReports();
	}

}
