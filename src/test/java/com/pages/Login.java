package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.utilities.BaseClass;
import com.utilities.BrowserSelection;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{

	BrowserSelection bs = new BrowserSelection();
	WebDriver driver;
	
	@Parameters ({"browser"})
	public void LoginApp(String browser) {
		bs.browserLaunch(browser);
		
	}
	@BeforeSuite
	public void setUpProject() {
		System.out.println("setUp");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	
	@BeforeTest
	public void LuanchBrowser() {		
		System.out.println("befreTest");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	@AfterTest
	public void afterTestethod() {
		System.out.println("afterMethod");
	}
	
	@AfterSuite
	public void afterSuiteMethod() {
		driver.close();
	}

	
}
