package com.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportWeb {

		 
			public void generateReport(String JsonFile, String start_time)  {
				
				Configuration config = new Configuration(new File (System.getProperty("user.dir")+"/reports/"+ start_time), "iBeauty_MobileAutomation");
				

				List <String> JsonFiles = new ArrayList<>();
				JsonFiles.add(JsonFile);
				ReportBuilder report = new ReportBuilder(JsonFiles, config);
				report.generateReports();
			}
			

}

