	// Adding users with valid credentials 

package com.training.pom;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AdminCreateUsersPOM {
private WebDriver driver; 
	
	
	public AdminCreateUsersPOM(WebDriver driver) {
	// TODO Auto-generated constructor stub
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}
		
	// Click on Add User Link
	
	@FindBy(linkText="Add a user")
	private WebElement adduserLink;
		public void clickAdduserLink() {
		this.adduserLink.click(); 
				}
		
	// Enter First name in text box	
		@FindBy(id="firstname")
		private WebElement enterfirstName;
				public void sendFirstName(String enterfirstName) {
					this.enterfirstName.sendKeys(enterfirstName);
				}
				
	// Enter Last name in text box	
		@FindBy(id="lastname")
		private WebElement enterlastName;
				public void sendLastName(String enterlastName) {
					this.enterlastName.sendKeys(enterlastName);
				}	
				
	// Enter E-mail 
		@FindBy(id="email")
		private WebElement entereMail;
				public void sendEMail(String entereMail) {
					this.entereMail.sendKeys(entereMail);
				}	
				
	// Enter Phone number 
		@FindBy(id="phone")
		private WebElement phoneNo;
				public void sendPhoneNo(String phoneNo) {
				this.phoneNo.sendKeys(phoneNo);
				}
	// Enter Login text box 
		@FindBy(id="username")
		private WebElement userLogin;
				public void sendUserLogin(String userLogin) {
				this.userLogin.sendKeys(userLogin);
				}
		
	// 	Select password radio button		
		//@FindBy (xpath="//div//label[contains(text(),'Enter password')]")
		@FindBy (xpath="//*[@id=\"password-group\"]/div[1]/div[2]/label")
		private WebElement passwordradioBtn; 			
				public void clickRadioBtn() throws InterruptedException {
					Thread.sleep(1000);
				this.passwordradioBtn.isSelected(); 
					}
				
	// Enter valid Password			
		@FindBy(id="password")
		private WebElement enterPassword;
				public void sendEnterPassword(String enterPassword) throws InterruptedException {
					Thread.sleep(1000);
					this.enterPassword.sendKeys(enterPassword);
						}				
	//  Select Valid credentials from profile list box
		@FindBy (xpath="//*[contains(text(),'Learner')]")
		private WebElement profileList;		
			public void sendProfileList() throws InterruptedException  {
				Thread.sleep(1000);
			Actions action = new Actions(this.driver);
	        action.moveToElement(profileList).click().build().perform();
	        
	        	     }	
	// Click on Add button
			
		@FindBy (xpath="//*[@id=\"qf_group_1-group\"]/div[1]/button[1]")
		private WebElement addBtn; 
			public void clickAddBtn() throws AWTException, InterruptedException {
				Robot robot = new Robot();
				//Thread.sleep(3000);
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				Thread.sleep(3000);
			this.addBtn.click(); 
		}
			
	// Click on Administration link
		@FindBy(xpath="//*[@id=\"cm-content\"]/div/ul/li[1]/a")
		private WebElement adminstrationLink;	
			public void clickAdminstrationLink() {
			this.adminstrationLink.click(); 
			}
	
	// Add users to subscribed to the selected course	
		
		@FindBy(xpath="//*[@id=\"cm-content\"]/div/form[2]/table/tbody/tr[2]/td[1]/select")
		private WebElement userList;
			public void sendUserList(String userList) {
			this.userList.sendKeys(userList);
					}
			/*	
		@FindBy (xpath="//*[contains(text(),'mehadi manzoor (manzoor)')]")
		private WebElement userList;
		public void sendUserList()  {
			Actions action = new Actions(this.driver);
	        action.moveToElement(userList).click().build().perform();
	     } */
		
	//course from the course list
		@FindBy (xpath="//*[contains(text(),'(BELL) BELL')]")
		private WebElement courseList;
		public void sendcourseList()  {
			Actions action = new Actions(this.driver);
	        action.moveToElement(courseList).click().build().perform();
	     }
		
	// 	Assertion - User has been added
		@FindBy(xpath="//*[contains(text(),'The user has been added: ')]")
		private WebElement adduserMsg;
		 		public String adduserMsg()
		{
			
			return this.adduserMsg.getText();
		}
		 		
				
	// Assertion for subscribed course
		
		@FindBy(xpath="//*[contains(text(),'The selected users are subscribed to the selected course')]")
		private WebElement subscribedMsg;
		 		public String userSubscribedToCourse()
		{
			
			return this.subscribedMsg.getText();
		}
	
	// 	Assertion - Invalid User details
				@FindBy(xpath="//*[contains(text(),'Required field')]")
				private WebElement errorMsg;
				 		public String ErrorMsg()
				{
					
					return this.errorMsg.getText();
				}
		
}
