package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pages.Login;
import com.pages.RegisterNewUserPage;

public class RegisterNewUser extends Login{

	

	@Test
	public void Register() {
		LoginApp("chrome");
		RegisterNewUserPage newUser = new RegisterNewUserPage();
		newUser.RegisterNewUser("Mona", "Shona", "abc@gmail.com", "45136987", "Apple", "Full stack developer", "xyz");
	}
	
}
