/*
 @ author Venu Gopal
 
 		This test case is to verify whether the application allows Admin to create multiple user 
      	with different roles & register them to the course
 */

package com.training.regression.tests;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.Addcourse_ELTC_023POM;
import com.training.pom.AdminCreateUsersPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AdminCreateUsersTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private AdminCreateUsersPOM addusersPOM;
	private Addcourse_ELTC_023POM addcoursePOM;
	//private AdminCreateUsersPOM addusersPOM;
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
		loginPOM = new LoginPOM(driver);
		addusersPOM = new AdminCreateUsersPOM(driver);
		addcoursePOM = new Addcourse_ELTC_023POM(driver);
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
	
	@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String enterfirstName, String enterlastName, String entereMail, String phoneNo, String userLogin, String enterPassword, String userList) throws InterruptedException, AWTException {
		
		// This method will pass the admin "Username" 
		loginPOM.sendUserName("admin");
		
		// This method will pass the admin "Password"
		loginPOM.sendPassword("admin@123");
		
		// This method will click on the "Login" button 
		loginPOM.clickLoginBtn(); 
		
		// This method will click on "Add a user" link from the User tab
		addusersPOM.clickAdduserLink();
		
		// This method will pass the input value for the "First name" text box
		addusersPOM.sendFirstName(enterfirstName);
		
		// This method will pass the input value for the "Last name" text box
		addusersPOM.sendLastName(enterlastName);
		
		// This method will pass the input value for the "e-mail" text box
		addusersPOM.sendEMail(entereMail);
		
		// This method will pass the input number for the "Phone number" text box
		addusersPOM.sendPhoneNo(phoneNo);
		
		// This method will pass the input name for the "Login" text box
		addusersPOM.sendUserLogin(userLogin);
		
		// This method will select the "Enter password" radio button 
		addusersPOM.clickRadioBtn(); 
		
		// This method will pass the value for the "Password" text box
		addusersPOM.sendEnterPassword(enterPassword);
		
		// This method will select the appropriate profile from the "Profile" list box
		addusersPOM.sendProfileList();
		
		// This method will scroll down the page and click on "+Add" button
		addusersPOM.clickAddBtn();
		
		// Assertion for successfull User added
		String expected1  = "The user has been added: ";
		String actual1 = addusersPOM.adduserMsg(); 
		System.out.println(addusersPOM.adduserMsg());
		boolean aserttext = actual1.contains(expected1);
		Assert.assertTrue(aserttext);
							
		screenShot.captureScreenShot("User has been added ");	
	
		// This method will click on "Administration" Link
		addusersPOM.clickAdminstrationLink();
		
		// This method will click on "Add users to course" link from the Course tab
		addcoursePOM.clickAddusersLink();
		
		// This method will select "user" from the user list
		addusersPOM.sendUserList(userList);
		
		
		// This method will select "course" from the course list
		addusersPOM.sendcourseList();
		
		// This method will click on "+Add to the course" button
		addcoursePOM.clickAddcourseBtn(); 
		
		// Assertion for users are subscribed to the selected course
		String expected  = "The selected users are subscribed to the selected course";
		String actual = addusersPOM.userSubscribedToCourse(); 
		System.out.println(addusersPOM.userSubscribedToCourse());
		Assert.assertEquals(expected, actual);
		
		screenShot.captureScreenShot("users are subscribed to course");
		}
	}


