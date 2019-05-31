package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Removecategory_ELTC_025POM {
	
private WebDriver driver; 
	
	public Removecategory_ELTC_025POM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/table/tbody/tr[2]/td[4]/a[3]/img")
	private WebElement categorydeleteIcon;
	
	
	
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
	
	public void clickCoursecategoryLink() {
		this.coursecategoriesLink.click(); 
	}

	public void clickDeleteIcon() {
		this.categorydeleteIcon.click(); 
	}

}
