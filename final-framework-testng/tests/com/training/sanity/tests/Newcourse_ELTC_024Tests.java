package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Newcourse_ELTC_024POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Newcourse_ELTC_024Tests {
	private WebDriver driver;
	private String baseUrl;
	private Newcourse_ELTC_024POM newcoursePOM;
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
		newcoursePOM = new Newcourse_ELTC_024POM (driver); 
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
		newcoursePOM.sendUserName("admin");
		newcoursePOM.sendPassword("admin@123");
		newcoursePOM.clickLoginBtn(); 
		newcoursePOM.clickAdministrationTab(); 
		newcoursePOM.clickcoursecategoriesLink();
		newcoursePOM.clickAddcategoryLink();
		newcoursePOM.sendCategoryCode("LVG");
		newcoursePOM.sendCategoryName("Venu Learning");
		//newcoursePOM.clickRadioBtn();
		newcoursePOM.clickCategoryLink();
	
		
		screenShot.captureScreenShot("ELTC_024");
	}
}
