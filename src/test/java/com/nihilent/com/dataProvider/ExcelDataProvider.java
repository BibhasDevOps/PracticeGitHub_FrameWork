package com.nihilent.com.dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	private static File src;
	static XSSFWorkbook wb;
	static FileInputStream fis;
	static FileOutputStream fout;
	static XSSFSheet deviceNameSheet;

	public ExcelDataProvider() {

		src = new File("./ApplicationTestData/AppData.xlsx");
		try {
			fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("exception is " + e.getMessage());
		}
	}

	public String getData(int sheetIndex, int row, int column) {

		String Data = wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
		return Data;
	}

	public String getData(String sheetname, int row, int column) {

		String Data = wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		return Data;

	}

	public String readDeviceName() {
		String deviceName = null;
		deviceNameSheet = wb.getSheet("DeviceName");
		int rowCount = deviceNameSheet.getLastRowNum();
		System.out.println("Total no. of rows -->>" + rowCount);
		for (int i = 1; i <= rowCount; i++) {
			if (deviceNameSheet.getRow(i).getCell(1).getStringCellValue() == "") {
				deviceName = deviceNameSheet.getRow(i).getCell(0).getStringCellValue();
				System.out.println("Device name from excel -->> "+deviceName);
				deviceNameSheet.getRow(i).createCell(1, CellType.STRING).setCellValue("Used");
				break;
			}
		}
		try {
			fout = new FileOutputStream(src);
			wb.write(fout);
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deviceName;
	}

}
