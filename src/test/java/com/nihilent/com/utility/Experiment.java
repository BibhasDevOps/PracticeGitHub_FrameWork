package com.nihilent.com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Experiment {

	private static File src;
	static XSSFWorkbook wb;
	static FileInputStream fis;
	static FileOutputStream fout;
	static XSSFSheet deviceNameSheet;

	public static void main(String[] args) {
		/*
		 * double x = (int)(Math.random()*((99999999-10000000)+1))+10000000;
		 * System.out.println(new java.text.DecimalFormat("0").format(x));
		 */
		src = new File("./ApplicationTestData/AppData.xlsx");
		try {
			fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("exception is " + e.getMessage());
		}

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
	}

}
