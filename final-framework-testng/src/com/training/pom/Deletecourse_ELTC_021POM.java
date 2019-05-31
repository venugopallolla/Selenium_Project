package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deletecourse_ELTC_021POM {
	
private WebDriver driver; 
	
	public Deletecourse_ELTC_021POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(linkText="Administration")
	private WebElement adminstrationTab;
	
	@FindBy(linkText="Course list")
	private WebElement courselistLink;
	
	@FindBy(xpath="//*[@id=\"course-list\"]/tbody/tr[2]/td[8]/a[6]/img")
	private WebElement deleteIcon;
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	public void clickAdministrationTab() {
		this.adminstrationTab.click(); 
	}
	public void clickCourselistLink() {
		this.courselistLink.click(); 
	}

	public void clickDeleteIcon() {
		this.deleteIcon.click(); 
	}
}
