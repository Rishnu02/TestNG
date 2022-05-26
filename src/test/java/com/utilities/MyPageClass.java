package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public abstract class MyPageClass {

	
	public abstract WebElement getElement(By locator);
	public abstract String getTitle();
	public abstract void waitForElementPresent(By locator);
	public abstract void selectByValue(By locator,String value);
	public abstract void selectByIndex(By locator,int value);
	public abstract void selectByVisibleText(By locator, String value);
	public abstract void scrollDown();
	public abstract void scrollUp();
	public abstract void scrollByVisibleText(By locator);
	public abstract void switchWindow();
	public abstract void takeScreenshot();

	
	
}
