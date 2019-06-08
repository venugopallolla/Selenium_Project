package com.training.sanity.tests;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Modifydetails_ELTC_051_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Modifydetails_ELTC_051_Tests {
	private WebDriver driver;
	private String baseUrl;
	private Modifydetails_ELTC_051_POM modifydetailsPOM;
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
		modifydetailsPOM = new Modifydetails_ELTC_051_POM(driver); 
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
	public void validLoginTest() throws AWTException, InterruptedException {
		modifydetailsPOM.sendUserName("admin");
		modifydetailsPOM.sendPassword("admin@123");
		modifydetailsPOM.clickLoginBtn(); 
		modifydetailsPOM.clickAdministrationTab();
		modifydetailsPOM.clickUserlistLink();
		modifydetailsPOM.sendEnteruserName("sunil");
		modifydetailsPOM.clickSearchBtn();
		modifydetailsPOM.clickEditIcon();
		modifydetailsPOM.clearTextField();
		modifydetailsPOM.sendEntervalidEmail("venugopal@gmail.com");
		modifydetailsPOM.clickInactiveBtn();
		modifydetailsPOM.clickSaveBtn();
		
			
		screenShot.captureScreenShot("ELTC_051");
	}
}
