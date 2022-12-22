package runnerFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.utilities.ConfigReader;
import com.utilities.ExtentReport;
import com.utilities.JvmReport;
import com.utilities.ReportWeb;
import com.utilities.ExcelData;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Features" }, glue = { "stepDefinitions" }, dryRun = false, plugin = {
		"pretty", "json:target/ResultsMobile/cucumber.json"}, monochrome = true, tags = "@demo"

)
public class RunCucumberTest {

	static ExtentReport extent_report = new ExtentReport();
	static ReportWeb report = new ReportWeb ();
	static String start_time;

	@BeforeClass
	public static void beforeClass() throws IOException {

		LocalDateTime instance = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy kk:mm:ss");
		start_time = format.format(instance);
		System.setProperty("start_time", start_time);

		ExtentReport.startReport(start_time);

	}
	@AfterClass
	public static void afterClass() throws IOException {

		LocalDateTime instance = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy kk:mm:ss");
		String Endtime_time = format.format(instance);
		System.setProperty("Endtime_time", Endtime_time);
		JvmReport.generateReport(System.getProperty("user.dir") + "/target/ResultsMobile/cucumber.json");

		extent_report.endReport();

	}
	
	@AfterClass
	public static void closeBrowser()  {
	   report.generateReport(System.getProperty("user.dir") + "/target/ResultsMobile/cucumber.json", start_time);


	}

}
        