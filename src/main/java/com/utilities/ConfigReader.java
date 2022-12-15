package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties props;


	public static String getData(String data) throws IOException {
		loadData();
		data = props.getProperty(data);
		return data;
	}
	public static void loadData() throws IOException {
		props = new Properties();
		File file = new File(System.getProperty("user.dir") + "/configuration/Application_Config.properties");
		FileReader fileInput = new FileReader(file);
		props.load(fileInput);
	}
}
