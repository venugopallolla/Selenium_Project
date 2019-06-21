package com.training.regression.tests;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.Addcourse_ELTC_023POM;
import com.training.pom.AdminCreateUsersPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginDBTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods; 
	
	
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
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		genericMethods = new GenericMethods(driver); 
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}


	@Test(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String userName, String password, String firstName, String lastName, String eMail, String phoneNO, String userLogin, String enterPassword ) throws InterruptedException, AWTException {
		// for demonstration 
//		genericMethods.getElement("login", "id"); 
				
		loginPOM.sendUserName("admin");
		
		String USERNAME=loginPOM.getUserName(); // To fetch username values from Application
		
		
		loginPOM.sendPassword("admin@123");
		
		String PASSWORD=loginPOM.getPassword(); // To fetch password values from Application
		
		
		loginPOM.clickLoginBtn();	// This will click on Login Button
		
		screenShot.captureScreenShot("Login Success page");
				
		loginPOM.clickAdduserLink();  // This will click on "Add a user" link from the User tab
		
		
		loginPOM.sendFirstName("manzoor");
		
		String FIRSTNAME=loginPOM.getFirstName(); // To fetch the First Name from Application
		
		
		loginPOM.sendLastName("mehadi");
		
		String LASTNAME=loginPOM.getLastName(); // To fetch the Last Name from Application
		
		
		loginPOM.sendEMail("manzoor@gmail.com");
		
		String EMAIL=loginPOM.getEMail(); // To fetch the e-Mail from Application
		
		
		
		loginPOM.sendPhoneNo("9876543210"); // This method will pass the input number for the "Phone number" text box
		String PHONE=loginPOM.getPhoneNo(); // To fetch the entered Phone Number
		
		
		// This method will pass the input name for the "Login" text box
		loginPOM.sendUserLogin("manzoor"); 
		
		String LOGIN=loginPOM.getUserLogin(); // To fetch the entered Login name
		
		
		
		// This method will select the "Enter password" radio button 
		loginPOM.clickRadioBtn(); 
		
		
		// This method will pass the value for the "Password" text box
		loginPOM.sendEnterPassword("manzoor");
		
		String LOGINPASSWORD=loginPOM.getEnterPassword(); // To fetch the entered Password
		
		
		// This method will select the appropriate profile from the "Profile" list box
		loginPOM.sendProfileList();
		
		// This method will scroll down the page and click on "+Add" button
		loginPOM.clickAddBtn();
		
		
		// This method will click on "Administration" Link
		loginPOM.clickAdminstrationLink();
		
		// This method will click on "Add users to course" link from the Course tab
		loginPOM.clickAddusersLink();
		
				
		// This method will select "user" from the user list
		loginPOM.sendUserList();
		
						
		// This method will select "course" from the course list
		loginPOM.sendcourseList();
		
		// This method will click on "+Add to the course" button
		loginPOM.clickAddcourseBtn(); 
		
		
			
		Assert.assertEquals(USERNAME, userName);
		Assert.assertEquals(PASSWORD, password);
		Assert.assertEquals(FIRSTNAME, firstName);
		Assert.assertEquals(LASTNAME, lastName);
		Assert.assertEquals(EMAIL, eMail);
		Assert.assertEquals(PHONE, phoneNO);
		Assert.assertEquals(LOGIN, userLogin);
		Assert.assertEquals(LOGINPASSWORD, enterPassword);
		
		screenShot.captureScreenShot("Users are subscribed to course");

	}

}