package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utilities.BaseClass;

public class RegisterNewUserPage extends BaseClass{

	
	private By uname = By.xpath("//input[@name='firstname']");
	private By lname = By.xpath("//input[@name='lastname']");
	private By email = By.xpath("//input[@name='email']");
	private By phone = By.xpath("//input[@name='phone']");
	private By company = By.xpath("company");
	private By jobRole = By.xpath("//select[@name='job_role']");
	private By testingPoint = By.xpath("//select[@name='biggest_software_challenge']");
	private By submit = By.xpath("//input[@class='hs-button primary large']");
		
	public WebElement getUserName() {
		return getElement(uname);
	}
	
	public WebElement getLastName() {
		return getElement(lname);
	}
	
	public WebElement getEmail() {
		return getElement(email);
	}
	
	public WebElement getPhone() {
		return getElement(phone);
	}
	
	public WebElement getompany() {
		return getElement(company);
	}
	
	public WebElement getjobRole() {
		return getElement(jobRole);
	}
	
	public WebElement gettestingPoint() {
		return getElement(testingPoint);
	}
	
	public WebElement getSubmitBtn() {
		return getElement(submit);
	}
	

	public void RegisterNewUser(String fname, String lname, String email, String phone, String company, String job, String point) {
		getUserName().sendKeys(fname);
		getLastName().sendKeys(lname);
		getEmail().sendKeys(email);
		getPhone().sendKeys(phone);
		getompany().sendKeys(company);
		getjobRole().sendKeys(job);
		gettestingPoint().sendKeys(point);
		getSubmitBtn().click();
		
	}
	
	
	public void Login(String uname, String pwd) {
		
	}
	
	
	
}
