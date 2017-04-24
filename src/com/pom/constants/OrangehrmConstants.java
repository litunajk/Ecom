package com.pom.constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class OrangehrmConstants {
	
	public static WebDriver driver;
public static String url="http://orangehrm.qedgetech.com";
@BeforeTest
	public static void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\My Project1\\PomProject\\src\\com\\pom\\jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
@AfterTest
	public static void closeApp()
	{
		driver.close();
	}
}
