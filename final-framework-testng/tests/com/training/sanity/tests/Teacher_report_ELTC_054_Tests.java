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
import com.training.pom.Studentreport_ELTC_053_POM;
import com.training.pom.Teacher_report_ELTC_054_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Teacher_report_ELTC_054_Tests {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Studentreport_ELTC_053_POM studentreportPOM;
	private Teacher_report_ELTC_054_POM teacherreportPOM;
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
		studentreportPOM = new Studentreport_ELTC_053_POM(driver); 
		teacherreportPOM = new Teacher_report_ELTC_054_POM(driver);
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
	public void validLoginTest() throws InterruptedException, AWTException {
		
		// admin Login
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		
		// teacher selection
		teacherreportPOM.clickReportLink();
		teacherreportPOM.clickFollowedLink();
		teacherreportPOM.sendTeacherName("Site");
		teacherreportPOM.clickSearchBtn();
		teacherreportPOM.clickDetailsIcon();
		teacherreportPOM.clickDetailscourseIcon();
		
		//report submission
		studentreportPOM.clickQuizImg();
		studentreportPOM.clickEmailCheck();
		studentreportPOM.clickCorrecttestBtn();
		studentreportPOM.clickCoursenameLink();
		
		screenShot.captureScreenShot("ELTC_054");
		
}
}
