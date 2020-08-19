package com.nihilent.com.factory;

import com.nihilent.com.dataProvider.ConfigDataProvider;
import com.nihilent.com.dataProvider.ExcelDataProvider;

public class DataProviderFactory {

	public static ConfigDataProvider getConfig() {
		ConfigDataProvider config = new ConfigDataProvider();
		return config;
	}

	public static ExcelDataProvider getExcel() {
		ExcelDataProvider Excel = new ExcelDataProvider();
		return Excel;
	}

}
