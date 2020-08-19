package com.nihilent.com.testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nihilent.com.factory.BrowserFactory;
import com.nihilent.com.factory.DataProviderFactory;
import com.nihilent.com.pages.Clarity_Create_Specialist_Cust;
import com.nihilent.com.pages.Clarity_UserLogin_Page;
import com.nihilent.com.resusable.GenericFunctions;

public class Verify_Create_Specialist_Cust_TC extends BrowserFactory{
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver.get(DataProviderFactory.getConfig().getPropertValue("url"));
	}

	@Test
	public void Create_Special_Cust() throws AWTException, IOException {

		GenericFunctions.wait(15);
		Clarity_UserLogin_Page ClearTextBox = PageFactory.initElements(driver, Clarity_UserLogin_Page.class);
		GenericFunctions.wait(5);
		ClearTextBox.ClearTextBox();

		Clarity_UserLogin_Page userlogin = PageFactory.initElements(driver, Clarity_UserLogin_Page.class);

		GenericFunctions.wait(5);
		userlogin.SADT_Login(DataProviderFactory.getExcel().getData(0, 0, 0),
				DataProviderFactory.getExcel().getData(0, 0, 1));

		GenericFunctions.wait(5);
		userlogin.Select_Country();

		Clarity_Create_Specialist_Cust Specialist_Cust = PageFactory.initElements(driver,Clarity_Create_Specialist_Cust.class);

		GenericFunctions.wait(2);
		Specialist_Cust.Create_Specialist_Cust();
		
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
