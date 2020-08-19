package com.nihilent.com.resusable;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class GenericFunctions {
	static WebDriver driver;
	public static String getPassportNumber(){
		double x = (int)(Math.random()*((99999999-10000000)+1))+10000000;
	    return new java.text.DecimalFormat("0").format(x);
	}
	
	public static void wait(int tSeconds){
		try {
			Thread.sleep(tSeconds * 1000);
		} catch (InterruptedException e) {
			
		}
	}
	
	public static void FluentWait(){
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			     .withTimeout(Duration.ofSeconds(60))
			     .pollingEvery(Duration.ofSeconds(3))

			       .ignoring(NoSuchElementException.class);

			   WebElement Element = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebElement driver) {
			      return driver;//.findElement(By.cssSelector("input[id='modal-modal-data-userName"));
			     }

				@Override
				public WebElement apply(WebDriver t) {
					// TODO Auto-generated method stub
					return null;
				}
			    
			   });
		
	}
}
