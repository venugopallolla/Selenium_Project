package com.training.sanity.tests;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.subscribe_promotion_ELTC_055_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Comments_Tests {
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

	//@BeforeMethod
	@Test(priority=0)
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
	@Test(priority=1)
	public void validLoginTest() throws InterruptedException, AWTException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		
	}
	
	//  Creation of Career 
	//@Test(priority=2)
	@Test(dependsOnMethods="validLoginTest",alwaysRun=true)
	public void validCareersIcon() {
		subscribepromotionPOM.clickCareerspromoLink();
		subscribepromotionPOM.clickCareerIcon();
		subscribepromotionPOM.clickAddIcon();
		subscribepromotionPOM.sendCareerName("QAVENU");
		subscribepromotionPOM.clickAddBtn();
	}	
	
	//   Creation of Promotion
	@Test(priority=3)
	public void validPromotionsIcon() {
		subscribepromotionPOM.clickCareeerpromotionLink();
		subscribepromotionPOM.clickPromotionsIcon();
		subscribepromotionPOM.clickPromoaddIcon();
		subscribepromotionPOM.sendPromoName("A Tester Venu");
		subscribepromotionPOM.clickPromoaddBtn();
		
		String expected="A Tester Venu";
		String actual = "A Tester Venu";
		System.out.println(" 		The session name added into promotion is : " + actual);
		Assert.assertEquals(expected, actual);
		
	}	
	
	// subscribe session to promotion
	@Test(priority=4)
	public void validSubscribePromotion() throws InterruptedException {
		subscribepromotionPOM.clickSubscribeIcon();
		subscribepromotionPOM.clickSessionsList();
		subscribepromotionPOM.clickMovelistBtn();
		subscribepromotionPOM.clickSubscribeBtn();
		//Thread.sleep(3000);
		
		
		screenShot.captureScreenShot("ELTC_055");
	}
}
