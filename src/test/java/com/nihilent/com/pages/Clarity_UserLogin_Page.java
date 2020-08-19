package com.nihilent.com.pages;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import java.time.Duration;

import com.nihilent.com.library.DropDown;
import com.nihilent.com.screenshot.ScreenShotTest;

public class Clarity_UserLogin_Page {

	WebDriver driver;

	public Clarity_UserLogin_Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "input[id='modal-modal-data-userName")
	WebElement Username;

	@FindBy(how = How.CSS, using = "input[id='modal-modal-data-password']")
	WebElement Password;

	@FindBy(how = How.CSS, using = "#modal-data-loginCountry")
	WebElement Loginbtn;

	@FindBy(how = How.CSS, using = "input[id='modal-modal-data-userName']")
	WebElement Cleartxt;
	
	@FindBy(css = "#modal-data-loginCountry") WebElement CountryName;

	
	
	
	
	
	@Test
	public void SADT_Login(String usrname, String Pass) {
		
	

		Username.clear();
		Username.sendKeys(usrname);
		Password.clear();
		Password.sendKeys(Pass);
		Loginbtn.click();
		
		}
	
	public void ClearTextBox() {
		Cleartxt.clear();
	}

	public void Select_Country() {
		DropDown.selectFromDropDown(CountryName, "Nigeria");
		driver.findElement(By.cssSelector("#modal-login-action")).click();
	}

}
