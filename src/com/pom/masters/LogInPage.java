package com.pom.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {

	@FindBy(id="txtUsername")WebElement uid;
	@FindBy(id="txtPassword")WebElement pwd;
	@FindBy(id="btnLogin")WebElement login;
	
	
	public void logIn(String usid,String pswd)
	{
		uid.sendKeys("admin");
		pwd.sendKeys("admin");
		login.click();
		
	}
	public String logoutverification()
	{
		if (login.isDisplayed()) {
			return "PASS";
		} else {
return "FAIL";
		}
	}
}
