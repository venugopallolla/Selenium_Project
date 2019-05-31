package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Createcourse_ELTC_022POM {

private WebDriver driver; 
	
	public Createcourse_ELTC_022POM(WebDriver driver) {
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
	
	@FindBy(linkText="Create a course")
	private WebElement createcourseLink;
	
	@FindBy(id="update_course_title")
	private WebElement updateTitle; 
	
	@FindBy(id="visual_code")
	private WebElement updateCode; 
	
	
	@FindBy(xpath="//li/input[@class='select2-search__field']")
	private WebElement selectTeachers; 
	
	@FindBy (xpath="//*[contains(text(),'manzoor mehadi (manzoor)')]")
	private WebElement profile;
	
	@FindBy(xpath="//span[contains(text(),'Automation Test ()')]")
	private WebElement selectCategory; 
	
	@FindBy(xpath="//span[contains(text(),'Projects (PROJ)')]")
	private WebElement project; 
	
	@FindBy(xpath="//span[contains(text(),'English')]")
	private WebElement selectLanguage; 
	
	@FindBy(id="update_course_submit")
	private WebElement createCourse; 
	
	
	public void clickCreatecourseBtn() {
		this.createCourse.click(); 
	}
	
	
public void sendselectLanguage()  {
		
		Actions action2 = new Actions(this.driver);
        action2.moveToElement(selectLanguage).click().build().perform();
       action2.sendKeys("English").build().perform();
        action2.moveToElement(selectLanguage).click().build().perform();
	
	}
	
	
	
	public void sendselectCategory()  {
		
		Actions action1 = new Actions(this.driver);
        action1.moveToElement(selectCategory).click().build().perform();
       action1.sendKeys("Project").build().perform();
        action1.moveToElement(project).click().build().perform();
	
	}
	
	
	public void sendselectTeachers()  {
						
		Actions action = new Actions(this.driver);
        action.moveToElement(selectTeachers).click().build().perform();
        action.sendKeys("manzoor").build().perform();
        action.moveToElement(profile).click().build().perform();
	
	}
		
	
	
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
	
	public void clickCreatecourseLink() {
		this.createcourseLink.click(); 
	}
	
	public void sendUpdatecourseTitle(String updateTitle) {
		this.updateTitle.sendKeys(updateTitle);
	}

	public void sendUpdateCode(String updateCode) {
		this.updateCode.sendKeys(updateCode);
	}
}
