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
import com.training.pom.Createcourse_ELTC_022POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Createcourse_ELTC_022Tests {
  
private WebDriver driver;
private String baseUrl;
private Createcourse_ELTC_022POM createcoursePOM;
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
	createcoursePOM = new Createcourse_ELTC_022POM(driver); 
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
	createcoursePOM.sendUserName("admin");
	createcoursePOM.sendPassword("admin@123");
	createcoursePOM.clickLoginBtn(); 
	createcoursePOM.clickAdministrationTab();
	createcoursePOM.clickCreatecourseLink();
	createcoursePOM.sendUpdatecourseTitle("VenuTesting");
	createcoursePOM.sendUpdateCode("AAAA");
	createcoursePOM.sendselectTeachers();
	createcoursePOM.sendselectCategory();
	createcoursePOM.sendselectLanguage();
	createcoursePOM.clickCreatecourseBtn(); 
	
	
	screenShot.captureScreenShot("ELTC_022");
}
}