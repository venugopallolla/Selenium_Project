package com.training.regression.tests;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.RegisterDataProvider;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.MultipleUsersPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MultipleUsers_Test {
	private WebDriver driver;
	private String baseUrl;
	private MultipleUsersPOM usrsPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		usrsPOM = new MultipleUsersPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.quit();
	}
	
	// Test will fetch the excel data using the LoginDataProviders.class
	
	@Test(dataProvider = "excel-inputs", dataProviderClass = RegisterDataProvider.class)
	public void loginDBTest(String enterfirstName, String enterlastName, String entereMail, String userName, String userPassword, String confirmPassword, String phoneNo) throws InterruptedException, AWTException {
		
		// 
		usrsPOM.clickSignupLink();
		
		usrsPOM.sendFirstName(enterfirstName);
		
		usrsPOM.sendLastName(enterlastName);
		
		usrsPOM.sendEMail(entereMail);
		
		usrsPOM.sendUserName(userName);
		
		usrsPOM.sendUserPassword(userPassword);
		
		usrsPOM.sendConfirmPassword(confirmPassword);
		
		usrsPOM.sendPhoneNo(phoneNo);
		
		usrsPOM.sendselectLanguage();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		usrsPOM.clickRegistrationBtn();
		
		
		// Assertion for successful User register
		String expected1  = "Registration";
		String actual1 = usrsPOM.adduserMsg(); 
		System.out.println(usrsPOM.adduserMsg());
		Assert.assertEquals(expected1, actual1);
		
							
		//screenShot.captureScreenShot("User has been Registered");	
	
		}
}
