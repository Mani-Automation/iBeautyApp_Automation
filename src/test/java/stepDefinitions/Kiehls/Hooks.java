package stepDefinitions.Kiehls;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.driverfactory.DriverFactory;
import com.driverfactory.DriverFactory.Target;
import com.driverfactory.DriverManager;
import com.utilities.ConfigReader;
import com.utilities.ExtentReport;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	private DriverFactory driverFactory;
	private AppiumDriver driver;
	private ConfigReader configReader;

	Scenario scenario;

	String screenshotdir = System.getProperty("user.dir") + "/target/test-output/Screenshots/";
	ExtentReport report = new ExtentReport();

	@Before(order = 1)
	public void launchBrowser(Scenario scenario) throws IOException {

		try {
			this.scenario = scenario;
			String target = configReader.getData("target");

			if ((new File(screenshotdir)).exists())
				FileUtils.cleanDirectory(new File(screenshotdir));
			driverFactory = new DriverFactory();
			driver = driverFactory.getDriver(Target.valueOf(target.toUpperCase()));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			DriverManager.setDriver(driver);
			report.startTest(driver, scenario.getName());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@After(order = 1)
	public void attach_screenshot(Scenario scenario) throws Throwable {

		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "MyscreenShot");
		}

	}

	@After(order = 0)
	public void quitBrowser() {

		DriverManager.quit();


	}

}
