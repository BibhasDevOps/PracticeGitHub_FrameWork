package com.nihilent.com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class Clarity_Create_Specialist_Cust {

	WebDriver driver;
	
	public Clarity_Create_Specialist_Cust(WebDriver driverl) {

		this.driver = driverl;

	}
	
	
	
	@FindBy(xpath="//img[contains(@src,'Content/Images/Home/getConnected.svg')]") WebElement ClickGetConnect;
	@FindBy(xpath="//*[contains(text(),'Create Specialist Customer')]") WebElement CreateSpecialistCust;
		
	@FindBy(xpath= "//*[@id='customerDataModel-custType'][@tabindex=1]") WebElement Customer_Type;
	@FindBy(xpath= "//select[starts-with(@id,'customerDataModel-locationIndicator')][@tabindex='100']") WebElement Location_Indicator;
	@FindBy(xpath= "//select[starts-with(@id,'customerDataModel-title')][@tabindex='101']") WebElement Title;
	@FindBy(xpath= "//input[starts-with(@id,'customerDataModel-firstName')]") WebElement First_Name;
	@FindBy(xpath= "//input[starts-with(@id,'customerDataModel-lastName')]") WebElement Last_Name;
	@FindBy(xpath= "//select[starts-with(@id,'customerDataModel-identityDetailType')]") WebElement Identification_Type;
	@FindBy(xpath = "//input[starts-with(@id,'customerDataModel-idValue')]")WebElement Identification_Number;
	@FindBy(xpath = "//select[starts-with(@id,'customerDataModel-countryOfOrigin')]")WebElement Country_Origin;
	@FindBy(xpath = "//input[starts-with(@id,'customerDataModel-passportExpiryDate')]")WebElement Expiry_Date;
	@FindBy(xpath= "//select[starts-with(@id,'customerDataModel-DOBDate')]")WebElement DOB_DD;
	@FindBy(xpath= "//select[starts-with(@id,'customerDataModel-DOBMonth')]")WebElement DOB_MM;
	@FindBy(xpath="//select[starts-with(@id,'customerDataModel-DOBYear')]") WebElement DOB_YYYY;
	@FindBy(xpath="//input[starts-with(@id,'customerDataModel-employeeNo')]") WebElement Employee_Number;
	@FindBy(xpath="//select[starts-with(@id,'customerDataModel-businessName')]") WebElement Company_Name;
	@FindBy(xpath="//select[starts-with(@id,'customerDataModel-department')]") WebElement Department;
	@FindBy(xpath="//select[starts-with(@id,'customerDataModel-language')]") WebElement Language_Preference;
	@FindBy(xpath="//input[starts-with(@id,'templateData-keywords-phone-contactValue')]") WebElement Phone_Number;
	@FindBy(xpath="//input[starts-with(@id,'templateData-keywords-email-contactValue')]") WebElement Email_Address;
	@FindBy(xpath="//input[starts-with(@id,'addressString')]") WebElement Address;
	@FindBy(xpath="//select[starts-with(@id,'templateData-keywords-view-parentView-address-country')]") WebElement Country;
	@FindBy(xpath="//input[starts-with(@id,'streetName')]") WebElement StreetName;
	@FindBy(xpath="//select[starts-with(@id,'templateData-keywords-view-parentView-address-province')]") WebElement Province;
	@FindBy(xpath="//input[starts-with(@id,'city')]") WebElement City;
	@FindBy(xpath="//input[starts-with(@id,'suburb')]") WebElement Suburb;
	@FindBy(css="#addAddress-action") WebElement Submit;
	@FindBy(css="#templateData-keywords-view-parentView-paymentDetails-bank") WebElement Bank;
	@FindBy(css="#templateData-keywords-view-parentView-paymentDetails-accountType") WebElement Account_Type;
	@FindBy(css="#templateData-keywords-view-parentView-paymentDetails-accountNo-1") WebElement Account_Number;
	@FindBy(xpath="//select[starts-with(@id,'templateData-keywords-view-parentView-paymentDetails-branchName')]") WebElement Branch_Name;
	@FindBy(css="#pickfiles") WebElement Add_Documents;
	@FindBy(css="#templateData-keywords-row-documentType") WebElement Doc_Type;
	@FindBy(css="#templateData-keywords-row-documentType-1") WebElement Doc_Type1;
	@FindBy(css="#templateData-keywords-view-parentView-model-supervisorUsername-1") WebElement Supervisor_Username;
	@FindBy(css="#templateData-keywords-view-parentView-model-passCode-1") WebElement Supervisor_Password;
	@FindBy(css="#authenticate-action") WebElement Authenticate_button;
	@FindBy(xpath="//input[starts-with(@type,'checkbox')][@tabindex='601']") WebElement Supportive_Doc_ACct_Btn;
	@FindBy(xpath="//button[starts-with(@id,'overrideAHV-action')][@tabindex='602']") WebElement OverRideAHV;
	@FindBy(css="#householdMemberAndAuthority-firstNameHouseholdMemberAndAuthority-1") WebElement HouseHolder_FisrtName;
	@FindBy(css="#addHouseHoldInfoVisible-action") WebElement HouseHolder_Member_Add;
	@FindBy(css="#householdMemberAndAuthority-lastNameHouseholdMemberAndAuthority-1") WebElement HouseHolder_LastName;
	@FindBy(css="#householdMemberAndAuthority-relation") WebElement HouseHolder_Relation;
	@FindBy(css="#householdMemberAndAuthority-householdMemberInfo-1") WebElement HouseHolder_Member;
	@FindBy(css="#householdMemberAndAuthority-allowToTransactInfo-1") WebElement Allowed_To_Trnsac;
	@FindBy(xpath="//select[starts-with(@id,'householdMemberAndAuthority-identityDetailTypeHouseholdMemberAndAuthority')]") WebElement Identity_Type;
	@FindBy(xpath="//input[starts-with(@id,'householdMemberAndAuthority-identityDetailValueHouseholdMemberAndAuthority-1')]") WebElement Identity_Number;
	@FindBy(css="#householdMemberAndAuthority-dd") WebElement DD;
	@FindBy(css="#householdMemberAndAuthority-mm") WebElement MM;
	@FindBy(css="#householdMemberAndAuthority-yyyy") WebElement YYYY;
	@FindBy(css="#addHouseholdMemberAndAuthority-action") WebElement Submit1;
	@FindBy(css="#createSpecialistCustomer-action") WebElement Save_Customer;
	@FindBy(xpath="//button[starts-with(@id,'addDevicesPackages-action')]") WebElement Add_Device_Pkg;
	@FindBy(css="#searchHardware-action") WebElement Add;
	@FindBy(css="#modal-yes-action") WebElement ConfirmDevice;
	@FindBy(css="#data-selectedPrimaryDecoder") WebElement Select_Decoder;
	@FindBy(css="#data-primaryProductSelection-169") WebElement PrincipalPkg;
	@FindBy(css="#addDeviceIntoSummaryGrid-action") WebElement Submit2;
	
	
	
	
	@FindBy(css="#associateProducts-action-1") WebElement Activiate;
	@FindBy(css="#viewAmountPayable-action") WebElement AmountToPay;
	@FindBy(css="#useCashRadioButton") WebElement PayCashBtn;
	@FindBy(css="#pay-action") WebElement PayNow;
	@FindBy(css="#makePayment-action") WebElement MakePayment;
	@FindBy(className ="close") WebElement Print;
	@FindBy(className="komodo-quicklinks-title") WebElement ManageViewLink;
	
	
	
	
	
	public void Create_Specialist_Cust() throws AWTException, IOException {
		{
			ClickGetConnect.click();

			GenericFunctions.wait(5);
			CreateSpecialistCust.click();
		}
		GenericFunctions.wait(5);
		DropDown.selectFromDropDown(Customer_Type, "Employee-M24/Naspers");
		GenericFunctions.wait(3);
		DropDown.selectFromDropDown(Location_Indicator, "Permanent");
		GenericFunctions.wait(3);
		DropDown.selectFromDropDown(Title, "Mr");
	
		
		GenericFunctions.wait(3);
		First_Name.sendKeys("Specialist-Test");
		GenericFunctions.wait(3);
		Last_Name.sendKeys("Specialist-Test");
		
		
		for (int i = 0; i <= 2; i++) {
			try {
				Select Ident = new Select(Identification_Type);
				Ident.selectByVisibleText("Passport Number");

				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
		}
		
		GenericFunctions.wait(5);

		Identification_Number
				.sendKeys(GenericFunctions.getPassportNumber());
		
		
		for (int j = 0; j <= 2; j++) {
			try {
				Select CountryOfOrigin = new Select(Country_Origin);
				CountryOfOrigin.selectByVisibleText("Angola");

				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}

		}
		
		Expiry_Date.click();

		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/thead/tr[1]/th[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/table/thead/tr/th[3]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/table/tbody/tr/td/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[1]/td[5]")).click();
		GenericFunctions.wait(3);
		DropDown.selectFromDropDown(DOB_DD, "04");
		GenericFunctions.wait(3);
		DropDown.selectFromDropDown(DOB_MM, "04");
		GenericFunctions.wait(3);
		DropDown.selectFromDropDown(DOB_YYYY, "1997");
		GenericFunctions.wait(3);
		Employee_Number.sendKeys("12345");
		GenericFunctions.wait(3);
		DropDown.selectFromDropDown(Company_Name, "Naspers (Pty) Ltd");
		GenericFunctions.wait(3);
		DropDown.selectFromDropDown(Department, "HR");
		GenericFunctions.wait(3);
		DropDown.selectFromDropDown(Language_Preference, "English");
		GenericFunctions.wait(3);
		Phone_Number.sendKeys("24545545");
		GenericFunctions.wait(3);
		Email_Address.sendKeys("b@test.com");
		GenericFunctions.wait(3);
		Address.sendKeys("SOUTH STREET MAKHADO MAKHADO LIMPOPO SOUTH AFRICA");
		GenericFunctions.wait(3);
		DropDown.selectFromDropDown(Country, "South Africa");

		GenericFunctions.wait(3);
		DropDown.selectFromDropDown(Province, "Limpopo");
		GenericFunctions.wait(3);	
		City.sendKeys("MAKHADO");
		GenericFunctions.wait(3);
		Suburb.sendKeys("MAKHADO");
		
		GenericFunctions.wait(7);
		WebElement Suburb1 = driver.findElement(By.cssSelector("#suburb-1"));
		Suburb1.sendKeys(Keys.SPACE);
		GenericFunctions.wait(5);
		WebElement Suburb2 = driver.findElement(By.cssSelector("#suburb-1"));
		Suburb2.sendKeys(Keys.BACK_SPACE);
		GenericFunctions.wait(5);
		WebElement Suburb = driver.findElement(By.cssSelector("#suburb-1"));
		Suburb.sendKeys(Keys.ENTER);
		
		Submit.click();
		
		DropDown.selectFromDropDown(Bank, "Absa Bank");
		DropDown.selectFromDropDown(Account_Type, "Savings");
		Account_Number.sendKeys("3455322");
		DropDown.selectFromDropDown(Branch_Name, "Absa Bank");
		
		//Add_Documents
		GenericFunctions.wait(5);
		Add_Documents.click();
		GenericFunctions.wait(5);
		Runtime.getRuntime().exec("C://Users//bibhas.barman//Desktop//AutoIt//FirstFile.exe" + " " +"C:\\SupportingDoc\\ProofOfID.jpg");
		GenericFunctions.wait(5);
		DropDown.selectFromDropDown(Doc_Type, "Copy of ID");
		GenericFunctions.wait(5);
		Add_Documents.click();
		GenericFunctions.wait(5);
		Runtime.getRuntime().exec("C://Users//bibhas.barman//Desktop//AutoIt//FirstFile.exe" + " " +"C:\\SupportingDoc\\BankStatement.jpg");
		GenericFunctions.wait(5);
		DropDown.selectFromDropDown(Doc_Type1, "Bank Statement");
		GenericFunctions.wait(2);
		Supervisor_Username.sendKeys("za\\Ranjeet.sharma");
		GenericFunctions.wait(2);
		Supervisor_Password.sendKeys("Delhi@1234");
		GenericFunctions.wait(2);
		Authenticate_button.click();
		GenericFunctions.wait(2);
		Supportive_Doc_ACct_Btn.click();
		GenericFunctions.wait(2);
		OverRideAHV.click();
		
		//###.... Household Member Details....##////
		
		GenericFunctions.wait(2);
		HouseHolder_Member_Add.click();
		HouseHolder_FisrtName.sendKeys("TestOne");
		GenericFunctions.wait(2);
		HouseHolder_LastName.sendKeys("TestOne");
		DropDown.selectFromDropDown(HouseHolder_Relation, "Father");
		Allowed_To_Trnsac.click();
		GenericFunctions.wait(2);
		DropDown.selectFromDropDown(Identity_Type, "Passport Number");
		GenericFunctions.wait(3);
		Identity_Number.sendKeys("1234567");
		GenericFunctions.wait(3);
		DropDown.selectFromDropDown(DD,"04");
		GenericFunctions.wait(3);
		DropDown.selectFromDropDown(MM,"04");
		GenericFunctions.wait(3);
		DropDown.selectFromDropDown(YYYY,"1991");
		GenericFunctions.wait(2);
		Submit1.click();
		GenericFunctions.wait(2);
		Save_Customer.click();
		
		Add_Device_Pkg.click();
		GenericFunctions.wait(5);
		driver.findElement(By.xpath("//*[@id='smartcardDecoderNo']")).sendKeys(DataProviderFactory.getExcel().readDeviceName());
		GenericFunctions.wait(2);
		Add.click();
		ConfirmDevice.click();
		
		Select ActivatePkg = new Select(driver
				.findElement(By.cssSelector("#data-selectedPrimaryDecoder")));	
		ActivatePkg.selectByIndex(1);
		
		PrincipalPkg.click();
		
		Submit2.click();
		
		GenericFunctions.wait(7);
		Activiate.click();
		GenericFunctions.wait(10);
		WebElement element = driver.findElement(By.cssSelector("#viewAmountPayable-action"));
		Actions action =new Actions(driver);
		GenericFunctions.wait(10);
		action.moveToElement(element).click().build().perform();
		GenericFunctions.wait(5);
		AmountToPay.click(); 
		GenericFunctions.wait(5);
		PayCashBtn.click();
		GenericFunctions.wait(5);
		PayNow.click();
		Select MethodOfPayment = new Select(driver.findElement(By.cssSelector("#data-methodOfPayment")));
		MethodOfPayment.selectByVisibleText("Cash");
		GenericFunctions.wait(10);
		MakePayment.click();
		GenericFunctions.wait(10);
		Print.click();
		GenericFunctions.wait(10);
		ManageViewLink.click(); 
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
	

	}


