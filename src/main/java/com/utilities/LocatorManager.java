package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LocatorManager {

	public static Properties props;

	public String getData(String data) throws IOException {
		masterData();
		return props.getProperty(data);
	}

	public static void masterData() throws IOException { // src/test/resources/locators/master.properties
		props = new Properties();
		File file;
		if (ConfigReader.getData("app").equals("Shuuemura")) {
			file = new File(System.getProperty("user.dir") + "/src/test/resources/locators/master_shuuemura.properties");

		} else {
			file = new File(System.getProperty("user.dir") + "/src/test/resources/locators/master.properties");

		}
		FileReader fileInput = new FileReader(file);
		props.load(fileInput);
	}

}
//
