package com.automation.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "registrationlogin")
	public String[][] loginTestData() throws IOException {

		FileInputStream file = new FileInputStream(
				new File(System.getProperty("user.dir") + "/src/test/resources/TestData/registerlogin.xlsx"));

		// Create Workbook instance holding reference to .xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// Get first/desired sheet from the workbook
		XSSFSheet sheet = workbook.getSheet("testdata");
		int rowCount = sheet.getLastRowNum();
		// Iterate through each rows one by one
		Row headerRow = sheet.getRow(0);
		int colCount = headerRow.getLastCellNum();
		String testData[][] = new String[rowCount][colCount];

		for (int i = 1; i < rowCount + 1; i++) {

			Row row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				Cell cell = row.getCell(j);
				testData[i-1][j] = cell.getStringCellValue();
			}
		}
		System.out.println("");

		file.close();
		return testData;
	}

}
