package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcourse_ELTC_023POM {
	
private WebDriver driver; 
	
	public Addcourse_ELTC_023POM(WebDriver driver) {
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
	
	@FindBy(linkText="Add users to course")
	private WebElement addusersLink;
	
	@FindBy (xpath="//*[contains(text(),'    balagide pravin (pravin) ')]")
	private WebElement userList;
	
	@FindBy (xpath="//*[contains(text(),'(AAAA) VenuTesting')]")
	private WebElement courseList;
	
	@FindBy (xpath="//*[@class='btn btn-primary']")
	private WebElement addCourse; 
	
	
	
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
	
	public void clickAddusersLink() {
		this.addusersLink.click(); 
	}
	
	public void senduserList()  {
		Actions action = new Actions(this.driver);
        action.moveToElement(userList).click().build().perform();
     }
	
	public void sendcourseList()  {
		Actions action = new Actions(this.driver);
        action.moveToElement(courseList).click().build().perform();
     }
		
	public void clickAddcourseBtn() {
			this.addCourse.click(); 
		}
	

}
