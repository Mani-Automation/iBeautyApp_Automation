package com.driverfactory.manager;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.driverfactory.DriverFactory.PlatformList;
import com.driverfactory.DriverFactory.Target;
import com.driverfactory.Factory;

import exceptions.TargetNotValidException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.remote.MobileCapabilityType;

public class AndriodDriverManager extends Factory {
	
	private DesiredCapabilities getOptions() throws IOException {
		DesiredCapabilities desiredCapabilities;
		desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,true);
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:deviceName","Samsung s10 plus");
		desiredCapabilities.setCapability("appium:android Version", "12.0");
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");		
		desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/pravinkumar_v/Downloads/KidszoneBuild76.apk");

		return desiredCapabilities;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public AndroidDriver<AndroidElement> createAndroidDriver(Target target)   {
		switch (target) {
		case LOCAL:
			URL url = null;
			try {
				url = new URL("http://127.0.0.1:4723/wd/hub");
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			try {
				return new AndroidDriver<AndroidElement>(url, getOptions());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		case REMOTE:
			return (AndroidDriver<AndroidElement>) createRemoteDriver(PlatformList.ANDROID);
		default:
			throw new TargetNotValidException(target.toString());
		}
	}

}
