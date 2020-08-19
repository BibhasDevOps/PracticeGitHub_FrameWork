package com.nihilent.com.testCases;

import java.awt.AWTException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nihilent.com.factory.BrowserFactory;
import com.nihilent.com.factory.DataProviderFactory;
import com.nihilent.com.pages.Clarity_Nigeria_DT_Create_HoliDay_Home;
import com.nihilent.com.pages.Clarity_Create_Nigeria_Residential_Cust;
import com.nihilent.com.pages.Clarity_UserLogin_Page;
import com.nihilent.com.resusable.GenericFunctions;

public class Verify_Nigeria_Resi_Cust_Create_Holiday_Home_TC extends BrowserFactory
{

	@BeforeMethod
	public void setUp() throws Exception {

		driver.get(DataProviderFactory.getConfig().getPropertValue("url"));
		
		
	}
	
	
	@Test
	public void Create_Resi_Cust() throws Exception {

		GenericFunctions.wait(40);
	    Clarity_UserLogin_Page ClearTextBox = PageFactory.initElements(driver, Clarity_UserLogin_Page.class);
		GenericFunctions.wait(5);
		ClearTextBox.ClearTextBox();

		Clarity_UserLogin_Page userlogin = PageFactory.initElements(driver, Clarity_UserLogin_Page.class);

		GenericFunctions.wait(5);
		userlogin.SADT_Login(DataProviderFactory.getExcel().getData(0, 0, 0),
				DataProviderFactory.getExcel().getData(0, 0, 1));

		GenericFunctions.wait(5);
		userlogin.Select_Country();

		Clarity_Nigeria_DT_Create_HoliDay_Home Residentail_HolidayHm = (Clarity_Nigeria_DT_Create_HoliDay_Home) PageFactory.initElements(driver,
				Clarity_Nigeria_DT_Create_HoliDay_Home.class);

		GenericFunctions.wait(2);
		Residentail_HolidayHm.Module_GetConnected_Create_Resi_Cust();
		GenericFunctions.wait(3);
		Residentail_HolidayHm.Holiday_Home_Add_Pkg_Device();
		
	

	}

	
	
	
}

