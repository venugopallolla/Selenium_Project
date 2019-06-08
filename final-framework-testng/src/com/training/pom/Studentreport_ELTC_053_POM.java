package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Studentreport_ELTC_053_POM {
	
private WebDriver driver; 
	
	public Studentreport_ELTC_053_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
		
		// Reporting Tab
	@FindBy(xpath="//*[@id=\"navbar\"]/ul[1]/li[4]/a")
	private WebElement reportingLink;
		public void clickReportLink() {
		this.reportingLink.click(); 
	}
		
		//Followed Students Link
	@FindBy(xpath="//*[@id=\"main_content\"]/div[3]/div/div[1]/div/div/div[1]/a")
	private WebElement followedLink;
			public void clickFollowedLink() {
			this.followedLink.click(); 
		}

		//enter student name in keyword box	
	@FindBy(id="search_user_keyword")
	private WebElement enterstudentName;
			public void sendStudentName(String updateCode) {
				this.enterstudentName.sendKeys(updateCode);
			}	
			
		//click on search button
	@FindBy(id="search_user_submit")
	private WebElement searchBtn;
			public void clickSearchBtn() {
				this.searchBtn.click(); 
			}
			
		//Details of the student
	@FindBy(id="details_parinika")
    private WebElement detailsIcon;
			public void clickDetailsIcon() {
				this.detailsIcon.click(); 
					}
						
		//Overall details of the student in a particular course	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[3]/table/tbody/tr[2]/td[7]/a/img")
	private WebElement detailscourseIcon;
			public void clickDetailscourseIcon() {
				this.detailscourseIcon.click(); 
				}	
			
		// Quiz icon of the test section
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[4]/table/tbody/tr/td[5]/a/img")
	private WebElement quizImg;
			public void clickQuizImg() {
				this.quizImg.click(); 
			}		
			
		//Send Email checkbox
	@FindBy(xpath="//label[contains(text(),' Send email')]")
	private WebElement emailCheck;
			public void clickEmailCheck() throws AWTException, InterruptedException {
				Robot robot = new Robot();
				Thread.sleep(3000);
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				Thread.sleep(1000);
				this.emailCheck.click(); 
			}		
			
		//Click on Correct Test Button
	@FindBy(id="form-email_submit")
	private WebElement correcttestBtn;
			public void clickCorrecttestBtn() {
				this.correcttestBtn.click(); 
					}		
		//Course Name link
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/ul/li[1]/a")
	private WebElement coursenameLink;
			public void clickCoursenameLink() {
				this.coursenameLink.click(); 
							}	
			
}
