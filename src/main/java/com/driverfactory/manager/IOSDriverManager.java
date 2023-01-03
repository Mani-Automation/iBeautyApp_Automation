package com.driverfactory.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.driverfactory.DriverFactory.PlatformList;
import com.driverfactory.DriverFactory.Target;
import com.driverfactory.Factory;
import com.utilities.ConfigReader;

import exceptions.TargetNotValidException;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class IOSDriverManager extends Factory {

	private DesiredCapabilities getOptions() throws IOException {

		String appPath = null;
		String bundleID = ConfigReader.getData("app") + "_BundleId";
		String env = ConfigReader.getData("appEnv").toString();

		 switch (env) {

			case "PROD":

				appPath = System.getProperty("user.dir") + "/apps/" + ConfigReader.getData("app") + " UAT.ipa";
			break;
			case "UAT":

				appPath = System.getProperty("user.dir") + "/apps/" + ConfigReader.getData("app") + " PROD.ipa";
			break;
			}

		DesiredCapabilities desiredCapabilities;
		desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", ConfigReader.getData("platformName"));
		desiredCapabilities.setCapability("platformVersion", ConfigReader.getData("platformVersion"));
		desiredCapabilities.setCapability("deviceName", ConfigReader.getData("deviceName"));
		desiredCapabilities.setCapability("udid", ConfigReader.getData("udid"));
		desiredCapabilities.setCapability("xcodeSigningId", "iPhone Developer");
		desiredCapabilities.setCapability("updatedWDABundleId", ConfigReader.getData(bundleID));
		desiredCapabilities.setCapability("realMobile", "true");
		desiredCapabilities.setCapability("autoAcceptAlerts", "true");
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		desiredCapabilities.setCapability(MobileCapabilityType.APP, appPath);
		desiredCapabilities.setCapability("noReset", true);


		return desiredCapabilities;
	}

	@SuppressWarnings("unchecked")
	@Override
	public IOSDriver<IOSElement> createIOSDriver(Target target) {
		switch (target) {
		case LOCAL:
			URL url = null;
			try {

				url = new URL("http://0.0.0.0:4723/wd/hub");
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			try {

				return new IOSDriver<IOSElement>(url, getOptions());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		case REMOTE:
			return (IOSDriver<IOSElement>) createRemoteDriver(PlatformList.IOS);
		default:
			throw new TargetNotValidException(target.toString());
		}
	}

}
