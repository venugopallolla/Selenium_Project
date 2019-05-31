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
import com.training.pom.Removecategory_ELTC_025POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Removecategory_ELTC_025Tests {
	private WebDriver driver;
	private String baseUrl;
	private Removecategory_ELTC_025POM removecategoryPOM;
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
		removecategoryPOM = new Removecategory_ELTC_025POM(driver); 
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
	public void validLoginTest() {
		removecategoryPOM.sendUserName("admin");
		removecategoryPOM.sendPassword("admin@123");
		removecategoryPOM.clickLoginBtn(); 
		removecategoryPOM.clickAdministrationTab();
		removecategoryPOM.clickCoursecategoryLink();
		removecategoryPOM.clickDeleteIcon();
		
		
		screenShot.captureScreenShot("ELTC_025");
	}
}
