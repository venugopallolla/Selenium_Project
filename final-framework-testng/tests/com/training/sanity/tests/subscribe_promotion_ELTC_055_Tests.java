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
import com.training.pom.LoginPOM;
import com.training.pom.subscribe_promotion_ELTC_055_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class subscribe_promotion_ELTC_055_Tests {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private subscribe_promotion_ELTC_055_POM subscribepromotionPOM;
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
		subscribepromotionPOM = new subscribe_promotion_ELTC_055_POM(driver); 
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
	
	// Admin Login
	@Test
	public void validLoginTest() throws InterruptedException, AWTException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		subscribepromotionPOM.clickCareerspromoLink();
		subscribepromotionPOM.clickCareerIcon();
		subscribepromotionPOM.clickAddIcon();
		subscribepromotionPOM.sendCareerName("QAVENU");
		subscribepromotionPOM.clickAddBtn();
		subscribepromotionPOM.clickCareeerpromotionLink();
		subscribepromotionPOM.clickPromotionsIcon();
		subscribepromotionPOM.clickPromoaddIcon();
		subscribepromotionPOM.sendPromoName("QA for Tester Venu");
		subscribepromotionPOM.clickPromoaddBtn();
		subscribepromotionPOM.clickSubscribeIcon();
		subscribepromotionPOM.clickSessionsList();
		subscribepromotionPOM.clickMovelistBtn();
		subscribepromotionPOM.clickSubscribeBtn();
		Thread.sleep(3000);
		screenShot.captureScreenShot("ELTC_055");
	}
}
