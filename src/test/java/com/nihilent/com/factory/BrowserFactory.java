package com.nihilent.com.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BrowserFactory {

	protected static WebDriver driver;

	@BeforeMethod
	@Parameters({ "Browser" })
	public static WebDriver getBrowser(@Optional("Chrome")String Browsername) {
		switch (Browsername.toUpperCase()) {
		case "CHROME":
			if (System.getProperty("os.name").toLowerCase().contains("win")) {
				System.setProperty("webdriver.chrome.driver",
						DataProviderFactory.getConfig().getPropertValue("WinChromeDriverPath"));
			} else if (System.getProperty("os.name").toLowerCase().contains("unix")
					|| System.getProperty("os.name").toLowerCase().contains("Linux")) {
				System.setProperty("webdriver.chrome.driver",
						DataProviderFactory.getConfig().getPropertValue("LinuxChromeDriverPath"));
			}
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-infobars");
			driver = new ChromeDriver(opt);
			break;

		case "FIREFOX":
			if (System.getProperty("os.name").toLowerCase().contains("win")) {
				System.setProperty("webdriver.gecko.driver",
						DataProviderFactory.getConfig().getPropertValue("WinFirefoxDriverPath"));
			} else if (System.getProperty("os.name").toLowerCase().contains("unix")
					|| System.getProperty("os.name").toLowerCase().contains("Linux")) {
				System.setProperty("webdriver.chrome.driver",
						DataProviderFactory.getConfig().getPropertValue("LinuxFirefoxDriverPath"));
			}
			driver = new FirefoxDriver();
			break;

		case "IE":
			if (System.getProperty("os.name").toLowerCase().contains("win")) {
				System.setProperty("webdriver.ie.driver",
						DataProviderFactory.getConfig().getPropertValue("WinIEDriverPath"));
			}
			driver = new InternetExplorerDriver();
			break;

		default:
			Reporter.log("Browser name provided is " + Browsername + ". And it doesn't seems to be corerct...", true);
			Reporter.log("So not proceeding further, shutting down the JVM !!!", true);
			System.exit(0);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	public static void closeBrowser() {
		driver.quit();
	}

}
