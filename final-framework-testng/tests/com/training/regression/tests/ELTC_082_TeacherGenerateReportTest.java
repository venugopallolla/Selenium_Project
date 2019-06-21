package com.training.regression.tests;

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
import com.training.pom.ELTC_082_TeacherGenerateReportPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_082_TeacherGenerateReportTest {


	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ELTC_082_TeacherGenerateReportPOM ReportPOM;
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
		ReportPOM = new ELTC_082_TeacherGenerateReportPOM(driver);
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
		
		// These below 3 methods will retrive valid login with Teacher credentials and navigate to teacher home page
		loginPOM.sendUserName("venuteacher");
		loginPOM.sendPassword("venu");
		loginPOM.clickLoginBtn(); 
		
		//This method will display the course detail page
		ReportPOM.clickCourseLink();
		
		//This method will click on Test Icon
		ReportPOM.clickTestIcon();
		
		ReportPOM.clickNewtestBtn();
		
		ReportPOM.sendEntertestNam("online quiz14");
		
		ReportPOM.clickSettingsBtn();
		
		ReportPOM.clickFeedbackBtn();
				
		ReportPOM.clickTimeCheckbox();
		
		ReportPOM.clickStartTime();
		
		ReportPOM.clickDoneBtn();
		
		ReportPOM.sendPercentageText("50");
		
		ReportPOM.clickproceedBtn();
		
		ReportPOM.clickChoiceImg();
		
		ReportPOM.sendQuestionText("which course your learning");
		
		ReportPOM.sendFirstOption("selenium");
		
		ReportPOM.sendSecondOption("java");
		
		ReportPOM.sendThirdOption("C");
		
		ReportPOM.sendFourthOption("C+");
		
		ReportPOM.clickRadioBtn();
		
		ReportPOM.clickSubmitaddTest();
		
		ReportPOM.clickMultiIcon();
		
		ReportPOM.sendQuestionText("which language are you using in selenium");
		
		ReportPOM.sendFirstOption("python");
		
		ReportPOM.sendSecondOption("java");
		
		ReportPOM.sendThirdOption("C");
		
		ReportPOM.sendFourthOption("C#");
		
		ReportPOM.clickSecondBtn();
		
		ReportPOM.clickSubmitaddTest();
		
		ReportPOM.clickMultiIcon();
		
		ReportPOM.clickPreviewBtn();
		
		// These below 3 methods will retrive valid login with Teacher credentials and navigate to teacher home page
				loginPOM.sendUserName("venustudent");
				loginPOM.sendPassword("venu");
				loginPOM.clickLoginBtn(); 
	
				ReportPOM.clickCatalogLink();

				ReportPOM.sendSearchTextbox("selenium");

				ReportPOM.clickSearchBtn();

				ReportPOM.clickSubscribeBtn();

				ReportPOM.clickTestLink();

				ReportPOM.clickTestsIcon();

				ReportPOM.clickTestnameLink();

				ReportPOM.clickStartBtn();

				ReportPOM.clickCourse1Btn();

				ReportPOM.clickNextBtn();
				ReportPOM.clickEndTest();
				
		//screenShot.captureScreenShot("End test");
	}
}
