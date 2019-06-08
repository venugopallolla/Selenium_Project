package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teacher_report_ELTC_054_POM {
	
	
private WebDriver driver; 
	
	public Teacher_report_ELTC_054_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
		
		// Reporting Tab
	@FindBy(xpath="//*[@id=\"navbar\"]/ul[1]/li[4]/a")
	private WebElement reportingLink;
		public void clickReportLink() {
		this.reportingLink.click(); 
	}
		
		//Followed Teachers Link
	@FindBy(xpath="//*[@id=\"main_content\"]/div[3]/div/div[3]/div/div/div[1]/a")
	private WebElement followedLink;
			public void clickFollowedLink() {
			this.followedLink.click(); 
		}

		//enter Teacher name in keyword box	
	@FindBy(id="search_user_keyword")
	private WebElement enterteacherName;
			public void sendTeacherName(String updateCode) {
				this.enterteacherName.sendKeys(updateCode);
			}	
			
		//click on search button
	@FindBy(id="search_user_submit")
	private WebElement searchBtn;
			public void clickSearchBtn() {
				this.searchBtn.click(); 
			}
			
		//Details of the Teacher
	@FindBy(id="details_admin")
    private WebElement detailsIcon;
			public void clickDetailsIcon() {
				this.detailsIcon.click(); 
					}
		//Overall details of a particular course	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[3]/table/tbody/tr[1]/td[7]/a/img")
	private WebElement detailscourseIcon;
					public void clickDetailscourseIcon() {
						this.detailscourseIcon.click(); 
						}
				
}
