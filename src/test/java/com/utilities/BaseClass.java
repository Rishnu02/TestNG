package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BaseClass extends MyPageClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Override
	public WebElement getElement(By locator) {
		// TODO Auto-generated method stub
		WebElement element = driver.findElement(locator);
		return element;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	@Override
	public void waitForElementPresent(By locator) {
		// TODO Auto-generated method stub
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		catch(Exception e) {
		System.out.println(e.getMessage().toString());	
		}
	}

	@Override
	public void selectByValue(By locator, String value) {
		// TODO Auto-generated method stub
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	@Override
	public void selectByIndex(By locator,int value) {
		// TODO Auto-generated method stub
		Select select = new Select(getElement(locator));
		select.selectByIndex(value);
	}

	@Override
	public void selectByVisibleText(By locator, String value) {
		// TODO Auto-generated method stub
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

	@Override
	public void scrollDown() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0.250)", "");
		
	}

	@Override
	public void scrollUp() {
		// TODO Auto-generated method stub
		JavascriptExecutor js  = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
	}

	@Override
	public void switchWindow() {
		// Opens a new tab and switches to new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		// Opens a new window and switches to new window
	   driver.switchTo().newWindow(WindowType.WINDOW);
	   
	   //Storing the ID of the original window
	   String originalWindow = driver.getWindowHandle();
	   
	   
	}

	

	@Override
	public void scrollByVisibleText(By locator) {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView();", locator);
	}

	@Override
	public void takeScreenshot() {
		
		
	}
}
