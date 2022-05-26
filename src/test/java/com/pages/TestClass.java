package com.pages;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	WebDriver driver;
	@Test(priority=0,enabled=true,groups= {"Smoke"})
	public void setup(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			driver.get("https://www.youtube.com/");	
		List<WebElement> li = driver.findElements(By.xpath("//yt-chip-cloud-chip-renderer[@class='style-scope ytd-feed-filter-chip-bar-renderer']"));
	for(int i=0;i<li.size();i++){
		if(li.get(i).getText().toString().equals("Music")) {
			li.get(i).click();
		}
	}
	}
	
	@Test(priority=1, enabled=true,groups= {"Smoke"},alwaysRun=true,invocationCount=2,dependsOnMethods= "setup3")
	public void setup1(){
		System.out.println("I am test2");
	}
	@Test(priority=2,enabled=true,groups= {"Regression"})
	public void setup2(){
		System.out.println("I am test3");
	}
	@Test(priority = 3, enabled=true, groups= {"Smoke"})
	public void setup3(){
		System.out.println("I am test4");
	}
}
