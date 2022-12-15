package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static String getExcelData(String sheet_name, String column_name) throws IOException {
		String retVal = null;
		FileInputStream file_input_stream = null;
		XSSFWorkbook workbook = null;
		String file_path = System.getProperty("user.dir") + "/src/test/resources/Data/" + ConfigReader.getData("app")
				+ "TestData.xlsx";
		try {
			file_input_stream = new FileInputStream(file_path);
			workbook = new XSSFWorkbook(file_input_stream);
			XSSFSheet sheet = workbook.getSheet(sheet_name);
			int rowCount = sheet.getLastRowNum() + 1;
			int colCount = sheet.getRow(0).getLastCellNum() + 1;
			int segment_row_number = 0;
			for (int i = 0; i <= rowCount; i++) {

				if (sheet.getRow(i).getCell(0).getStringCellValue().equals(ConfigReader.getData("app_segment"))) {
					segment_row_number = i;
					break;

				}
			}
			for (int j = 0; j <= colCount; j++) {
				if (sheet.getRow(0).getCell(j).getStringCellValue().equals(column_name)) {
					try {

						retVal = sheet.getRow(segment_row_number).getCell(j).getStringCellValue().toString();

					} catch (IllegalStateException e) {
						retVal = String.valueOf(sheet.getRow(segment_row_number).getCell(j).getNumericCellValue());

					}
					break;
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		file_input_stream.close();
		workbook.close();
		return retVal;
	}

}