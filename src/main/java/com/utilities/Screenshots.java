package com.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.reusableMethods.CommonActions;

public class Screenshots {
	public static WebDriver local_driver;

	public static String capture(WebDriver remote_driver) {
		local_driver = remote_driver;
		LocalDateTime instance = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy kk:mm:ss");
		String start_time = format.format(instance);
		String dest = System.getProperty("user.dir") + "/screenshots/" + start_time + ".png";

		try {

			TakesScreenshot ts = (TakesScreenshot) local_driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(dest);
			FileUtils.copyFile(source, destination);
			return dest;

		} catch (Exception e) {
			e.printStackTrace();
			return dest;

		}
	}

}
