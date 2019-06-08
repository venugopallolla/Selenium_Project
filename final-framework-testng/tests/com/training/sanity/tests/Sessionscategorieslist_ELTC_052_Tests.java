package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.Sessionscategorieslist_ELTC_052_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Sessionscategorieslist_ELTC_052_Tests {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Sessionscategorieslist_ELTC_052_POM trainingPOM;
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
		trainingPOM = new Sessionscategorieslist_ELTC_052_POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		trainingPOM.clickSessionscategoriesLink();
		trainingPOM.clickAddcategoryLink();
		trainingPOM.sendCategoryName("Testing Venu1");
		trainingPOM.clickAddcategoryBtn();
		trainingPOM.clickSessionlistIcon();
		trainingPOM.clickAddtrainingsessionIcon();
		trainingPOM.sendSessionName("selenium training session999");
		trainingPOM.clickAdvancedsettingsBtn();
		trainingPOM.sendsessionscategoryList();
		trainingPOM.clickNextstepBtn();
		trainingPOM.sendcourseList();
		trainingPOM.clickAddcourseBtn();
		trainingPOM.clickCoursenextstepBtn();
		trainingPOM.sendUserName("sunil");
		Thread.sleep(3000);
		trainingPOM.clickPortaluserList();
		trainingPOM.clickFinishsessionBtn();
		
		screenShot.captureScreenShot("ELTC_052");
		
		
	}
}
