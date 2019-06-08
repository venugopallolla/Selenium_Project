package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Modifydetails_ELTC_051_POM {

private WebDriver driver; 
	
	public Modifydetails_ELTC_051_POM(WebDriver driver) {
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
	
	@FindBy(linkText="User list")
	private WebElement userlistLink;
	
	@FindBy(id="search_simple_keyword")
	private WebElement enteruserName;
	
	@FindBy(id="search_simple_submit")
	private WebElement searchBtn;
	
	@FindBy(xpath="//img[contains(@src,'/elearningm1.upskills.in/main/img/icons/22/edit.png')]")
	private WebElement editIcon;
	
	@FindBy(id="user_edit_email")
	private WebElement clearemailText;
	
	@FindBy(id="user_edit_email")
	private WebElement entervalidEmail;
	
	@FindBy(xpath="//div//label[contains(text(),'inactive')]")
	private WebElement inactiveBtn; 
	
	
	@FindBy(id="user_edit_submit")
	private WebElement saveBtn;
	
	
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
	
	public void clickUserlistLink() {
		this.userlistLink.click(); 
	}
	
	public void sendEnteruserName(String enteruserName) {
		this.enteruserName.sendKeys(enteruserName);
	}

	public void clickSearchBtn() {
		this.searchBtn.click(); 
		}
	
	public void clickEditIcon() {
		this.editIcon.click(); 
		}
	
	public void clearTextField() {
		this.clearemailText.clear(); 
		}
	
	public void sendEntervalidEmail(String entervalidEmail) {
		this.entervalidEmail.sendKeys(entervalidEmail);
	}
	
	public void clickInactiveBtn() throws AWTException, InterruptedException {
		Robot robot = new Robot();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		this.inactiveBtn.click();
	}
	public void clickSaveBtn() throws AWTException, InterruptedException {
		Robot robot1 = new Robot();
		Thread.sleep(3000);
		robot1.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot1.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		this.saveBtn.click(); 
	}
}

