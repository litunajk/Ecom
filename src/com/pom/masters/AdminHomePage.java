package com.pom.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pom.constants.OrangehrmConstants;

public class AdminHomePage extends OrangehrmConstants
{
@FindBy(id="welcome")WebElement welcome;
@FindBy(linkText="Logout")WebElement logout;
public String loginVerification()
{
	
	if (welcome.isDisplayed()) {
		return "PASS";
	} else {
return "FAIL";

	}
}
public void logout() throws InterruptedException
{
	welcome.click();
	Thread.sleep(3000);
	logout.click();
}
}
