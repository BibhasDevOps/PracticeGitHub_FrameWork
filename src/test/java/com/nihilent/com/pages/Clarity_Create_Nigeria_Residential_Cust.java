package com.nihilent.com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nihilent.com.factory.DataProviderFactory;
import com.nihilent.com.library.DropDown;
import com.nihilent.com.resusable.GenericFunctions;
import com.nihilent.com.screenshot.ScreenShotTest;

public class Clarity_Create_Nigeria_Residential_Cust {

	WebDriver driver;
	
	public Clarity_Create_Nigeria_Residential_Cust(WebDriver driverl) {

		this.driver = driverl;

	}
	
	
	
	@FindBy(xpath="//img[contains(@src,'Content/Images/Home/getConnected.svg')]") WebElement ClickGetConnect;
	@FindBy(xpath="//*[contains(text(),'Create Residential Customer')]") WebElement CreateResiCust;
	@FindBy(xpath="//*[contains(text(),'Accept')]") WebElement ClickAcctBtn;	
	@FindBy(css="#customerDataModel-title") WebElement TitleTextBox;
	@FindBy(css= "#customerDataModel-title") WebElement TitleTextBox_Entry;
	@FindBy(css= "#customerDataModel-firstName-1") WebElement FisrtName_Entry;
	@FindBy(css= "#customerDataModel-lastName-1") WebElement LastName_Entry;
	@FindBy(css= "#templateData-keywords-view-parentView-identification-idType") WebElement Passport_verify;
	@FindBy(css= "#templateData-keywords-view-parentView-identification-idType") WebElement Passport_Entry;
	@FindBy(css = "#templateData-keywords-view-parentView-identification-1")WebElement PassportNumber_Entry;
	@FindBy(css= "#templateData-keywords-view-parentView-identification-countryOrigin")WebElement CountryOrigin_Entry;
	@FindBy(css= "templateData-keywords-view-parentView-identification-expiryDate-1-value")WebElement Expiry_Entry;
	@FindBy(xpath="//select[starts-with(@id,'templateData-keywords-view-parentView-address-province')]")WebElement Province;
	@FindBy(xpath="//select[starts-with(@id,'templateData-keywords-view-parentView-address-city')]")WebElement City;
	@FindBy(xpath="//select[starts-with(@id,'templateData-keywords-view-parentView-address-suburb')]")WebElement suburb;
	@FindBy(xpath="//button[starts-with(@id,'addAddress-action')]")WebElement Submitt;
	@FindBy(xpath="//button[starts-with(@id,'createDStvCustomer-action')]")WebElement Save_Customer;
	@FindBy(css="#addDevicesPackages-action") WebElement AddDeviceBtn;
	@FindBy(css="#searchHardware-action") WebElement Add;
	@FindBy(css="#modal-yes-action") WebElement ConfirmDevice;
	@FindBy(css="#data-selectedPrimaryDecoder") WebElement Select_Decoder;
	@FindBy(xpath="//input[starts-with(@id,'data-primaryProductSelection-9')][@value='9']") WebElement PrincipalPkg;
	@FindBy(css="#addDeviceIntoSummaryGrid-action") WebElement Submit;
	@FindBy(xpath="//button[starts-with(@id,'associateProducts-action')][@tabindex=2]") WebElement Activiate;
	@FindBy(css="#viewAmountPayable-action") WebElement AmountToPay;
	@FindBy(css="#useCashRadioButton") WebElement PayCashBtn;
	@FindBy(css="#pay-action") WebElement PayNow;
	@FindBy(xpath="//a[contains(text(),'Make Payments')]") WebElement MakePayment1;
	@FindBy(css="#makePayment-action") WebElement MakePayment;
	@FindBy(className ="close") WebElement Print;
	@FindBy(xpath="//a[contains(text(),'Manage Viewing')]") WebElement ManageViewLink;
	@FindBy(xpath="//select[starts-with(@id,'selectedHardwareAddress')]") WebElement WhereWillYouUseThisDevice;
	
	
	
	
	
	public void Module_GetConnected_Create_Resi_Cust() throws AWTException, IOException {
		{
			ClickGetConnect.click();

			GenericFunctions.wait(1);
			CreateResiCust.click();
		
			
		}

		String mainwindow = driver.getWindowHandle();
		ScreenShotTest.printScreen();
		ClickAcctBtn.click();
		driver.switchTo().window(mainwindow);
		
		GenericFunctions.wait(5);
		for (int i = 0; i <= 2; i++) {
			try {
				TitleTextBox.click();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		Select Title = new Select(TitleTextBox_Entry);
		Title.selectByVisibleText("Mr");

		GenericFunctions.wait(1);
		FisrtName_Entry.sendKeys("BIBAUTO");
		GenericFunctions.wait(1);
		LastName_Entry.sendKeys("DEVTest");

		for (int i = 0; i <= 2; i++) {
			try {
				Select Ident = new Select(Passport_verify);
				Ident.selectByVisibleText("Passport Number");

				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}

		}

		GenericFunctions.wait(5);
		
		PassportNumber_Entry
				.sendKeys(GenericFunctions.getPassportNumber());

		for (int j = 0; j <= 2; j++) {
			try {
				Select CountryOfOrigin = new Select(CountryOrigin_Entry);
				CountryOfOrigin.selectByVisibleText("Angola");

				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}

		}
		

		driver.findElement(By.id("templateData-keywords-view-parentView-identification-expiryDate-1-value")).click();

		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/table/thead/tr/th[3]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/table/tbody/tr/td/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[1]/td[5]")).click();
		
		Select DOB_Day = new Select(driver.findElement(By.cssSelector("#customerDataModel-DOBDate")));
		DOB_Day.selectByVisibleText("04");

		Select DOB_Month = new Select(driver.findElement(By.cssSelector("#customerDataModel-DOBMonth")));
		DOB_Month.selectByVisibleText("04");

		
		Select Year = new Select(driver.findElement(By.id("customerDataModel-DOBYear")));
		Year.selectByValue("2000");

		Select Language = new Select(driver.findElement(By.cssSelector("#customerDataModel-language")));
		Language.selectByVisibleText("English");
		
		WebDriverWait wait2 = new WebDriverWait(driver, 50);
		WebElement element2 = wait2.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customerDataModel-residenceType")));

		Select Residence = new Select(driver.findElement(By.cssSelector("#customerDataModel-residenceType")));
		Residence.selectByVisibleText("House");

		driver.findElement(By.cssSelector("#templateData-keywords-phone-contactValue")).sendKeys("776488847");
		driver.findElement(By.cssSelector("#templateData-keywords-email-contactValue")).sendKeys("b@test.com");
		
		DropDown.selectFromDropDown(Province, "BENGO");
		DropDown.selectFromDropDown(City, "Dande");
		DropDown.selectFromDropDown(suburb, "Mabubas");
		GenericFunctions.wait(5);
		Submitt.click();
		GenericFunctions.wait(5);
		Save_Customer.click();
		
		//driver.findElement(By.cssSelector("#addressString-1"))
				//.sendKeys("SOUTHERN MIRAVAAL AH VANDERBIJLPARK GAUTENG SOUTH AFRICA");

		/*Select Country2 = new Select(
				driver.findElement(By.cssSelector("#templateData-keywords-view-parentView-address-country")));
		Country2.selectByVisibleText("South Africa"); 

		Select Province = new Select(
				driver.findElement(By.cssSelector("#templateData-keywords-view-parentView-address-province")));
		Province.selectByVisibleText("Gauteng");

		driver.findElement(By.cssSelector("#city-1")).sendKeys("VANDERBIJLPARK");
		driver.findElement(By.cssSelector("#suburb-1")).sendKeys("MIRAVAAL AH");

		GenericFunctions.wait(7);
		WebElement Suburb1 = driver.findElement(By.cssSelector("#suburb-1"));
		Suburb1.sendKeys(Keys.SPACE);

		GenericFunctions.wait(5);
		WebElement Suburb2 = driver.findElement(By.cssSelector("#suburb-1"));
		Suburb2.sendKeys(Keys.BACK_SPACE);
		GenericFunctions.wait(7);
		WebElement Suburb = driver.findElement(By.cssSelector("#suburb-1"));
		Suburb.sendKeys(Keys.ENTER);

		GenericFunctions.wait(2);
		driver.findElement(By.cssSelector("#addAddress-action")).click();

		GenericFunctions.wait(1);
		Select Bank = new Select(
				driver.findElement(By.cssSelector("#templateData-keywords-view-parentView-paymentDetails-bank")));
		Bank.selectByVisibleText("Absa Bank");
		GenericFunctions.wait(1);
		Select Account_Type = new Select(driver
				.findElement(By.cssSelector("#templateData-keywords-view-parentView-paymentDetails-accountType")));
		Account_Type.selectByVisibleText("Savings");

		driver.findElement(By.cssSelector("#templateData-keywords-view-parentView-paymentDetails-accountNo-1"))
				.sendKeys("234242");
		GenericFunctions.wait(1);
		Select Branch_Name = new Select(
				driver.findElement(By.cssSelector("#templateData-keywords-view-parentView-paymentDetails-branchName")));
		Branch_Name.selectByVisibleText("Absa Bank");
		GenericFunctions.wait(5);
		driver.findElement(By.cssSelector("#createDStvCustomer-action")).click();
		GenericFunctions.wait(5);
		driver.findElement(By.cssSelector("#modal-accept-action")).click();
		GenericFunctions.wait(5);
		driver.findElement(By.cssSelector("#createDStvCustomer-action")).click();
		GenericFunctions.wait(5); */
		
	//##.....Add Device & Package...## //
		GenericFunctions.wait(15);
		AddDeviceBtn.click();
		GenericFunctions.wait(4);
		driver.findElement(By.xpath("//*[@id='smartcardDecoderNo']")).click();
		GenericFunctions.wait(5);
		driver.findElement(By.xpath("//*[@id='smartcardDecoderNo']")).sendKeys(DataProviderFactory.getExcel().readDeviceName());
		GenericFunctions.wait(5);
		Add.click();
		GenericFunctions.wait(15);
		ConfirmDevice.click();
		GenericFunctions.wait(5);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		GenericFunctions.wait(5);
		
		Select ActivatePkg = new Select(driver
				.findElement(By.cssSelector("#data-selectedPrimaryDecoder")));
		ActivatePkg.selectByIndex(1);

	    GenericFunctions.wait(5);
		PrincipalPkg.click();
		GenericFunctions.wait(5);
		Submit.click();
		GenericFunctions.wait(7);
		Activiate.click();
		
		//WebDriverWait wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[contains(text(),'Make Payments')]")));
		GenericFunctions.wait(30);
		MakePayment1.click();
		//WebElement element = driver.findElement(By.cssSelector("#viewAmountPayable-action"));
		//Actions action =new Actions(driver);
		//GenericFunctions.wait(10);
		//action.moveToElement(element).click().build().perform();

		//GenericFunctions.wait(5);
		//AmountToPay.click(); 
		//GenericFunctions.wait(5);
		//PayCashBtn.click();
		//GenericFunctions.wait(5);
		//PayNow.click();
		GenericFunctions.wait(5);
		Select MethodOfPayment = new Select(driver.findElement(By.cssSelector("#data-methodOfPayment")));
		MethodOfPayment.selectByVisibleText("Cash");
		GenericFunctions.wait(15);
		MakePayment.click();
		GenericFunctions.wait(20);
		Print.click();
		GenericFunctions.wait(10);
		ManageViewLink.click(); 
		
		
	}

	  /*public void Add_Device_HolidayHome() throws Exception{
		  
		  AddDeviceBtn.click();
			GenericFunctions.wait(4);
			driver.findElement(By.xpath("//*[@id='smartcardDecoderNo']")).click();
			GenericFunctions.wait(5);
			driver.findElement(By.xpath("//*[@id='smartcardDecoderNo']")).sendKeys(DataProviderFactory.getExcel().readDeviceName());
			GenericFunctions.wait(5);
			Add.click();
			GenericFunctions.wait(5);
			ConfirmDevice.click();
			GenericFunctions.wait(5);

			Robot robot1 = new Robot();
			robot1.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot1.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
			
			GenericFunctions.wait(5);
			
			Select ActivatePkg = new Select(driver
					.findElement(By.cssSelector("#data-selectedPrimaryDecoder")));
			ActivatePkg.selectByIndex(2);

		    DropDown.selectFromDropDown(WhereWillYouUseThisDevice, "Other");
		    AddDeviceBtn.click(); 
		    
		  
	  }*/
	
	
}
