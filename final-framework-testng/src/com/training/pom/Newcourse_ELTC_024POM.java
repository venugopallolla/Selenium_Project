package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newcourse_ELTC_024POM {

private WebDriver driver; 
	
	public Newcourse_ELTC_024POM(WebDriver driver) {
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
	
	@FindBy(linkText="Courses categories")
	private WebElement coursecategoriesLink;
	
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div/a/img")
	private WebElement addcategoryIcon;
	
	@FindBy(id="course_category_code")
	private WebElement entercategoryCode; 
	
	@FindBy(id="course_category_name")
	private WebElement entercategoryName; 
	
	@FindBy(xpath="//*[@id='qf_69d684']")
	private WebElement yesradioBtn; 
	
	@FindBy(xpath="//*[@id='course_category_submit']")
	private WebElement addcategoryLink; 
	
	
	
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
	
	public void clickcoursecategoriesLink() {
		this.coursecategoriesLink.click(); 
	}
	
	public void clickAddcategoryLink() {
		this.addcategoryIcon.click(); 
	}
	
	public void sendCategoryCode(String updateCode) {
		this.entercategoryCode.sendKeys(updateCode);
	}
	
	public void sendCategoryName(String updateCode) {
		this.entercategoryName.sendKeys(updateCode);
	}
	
	
	public void clickRadioBtn() {
		this.yesradioBtn.isSelected(); 
	}
		
	public void clickCategoryLink() {
		this.addcategoryLink.click(); 
	}
		
	
}
