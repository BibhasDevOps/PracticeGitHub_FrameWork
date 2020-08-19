package com.nihilent.com.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void selectFromDropDown(WebElement dropDownElement, String visibleText){
		Select sel = new Select(dropDownElement);
		sel.selectByVisibleText(visibleText);
	}
	
	public static void selectFromDropDown(WebElement dropDownElement, int indexValue){
		Select sel = new Select(dropDownElement);
		sel.selectByIndex(indexValue);
		
		
		
	}
	
	

}
