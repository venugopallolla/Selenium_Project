package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public String getUserName() {
		return this.userName.getAttribute("value");
	}
	
	public String getPassword() {
		return this.password.getAttribute("value");
	}
	
	// Click on Add User Link
	
	@FindBy(linkText="Add a user")
	private WebElement adduserLink;
	public void clickAdduserLink() {
			this.adduserLink.click(); 
					}
	
	// Enter First name in text box	
	@FindBy(id="firstname")
	private WebElement firstName;
		public void sendFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
					}
		
		public String getFirstName() {
			return this.firstName.getAttribute("value");
		}
	
	// Enter Last name in text box	
		@FindBy(id="lastname")
		private WebElement lastName;
				public void sendLastName(String lastName) {
					this.lastName.sendKeys(lastName);
				}	
		public String getLastName() {
				return this.lastName.getAttribute("value");
				}		
				
				
	// Enter E-mail 
		@FindBy(id="email")
		private WebElement eMail;
				public void sendEMail(String eMail) {
					this.eMail.sendKeys(eMail);
				}	
		public String getEMail() {
					return this.eMail.getAttribute("value");
					}	
				
				
				
	// Enter Phone number 
		@FindBy(id="phone")
		private WebElement phoneNo;
				public void sendPhoneNo(String phoneNo) {
				this.phoneNo.sendKeys(phoneNo);
				}
				
		public String getPhoneNo() {
					return this.phoneNo.getAttribute("value");
						}			
				
				
	// Enter Login text box 
		@FindBy(id="username")
		private WebElement userLogin;
				public void sendUserLogin(String userLogin) {
				this.userLogin.sendKeys(userLogin);
				}
				
		public String getUserLogin() {
				return this.userLogin.getAttribute("value");
					}		
				
		
	// 	Select password radio button		
		//@FindBy (xpath="//div//label[contains(text(),'Enter password')]")
		@FindBy (xpath="//*[@id=\"password-group\"]/div[1]/div[2]/label")
		private WebElement radioBtn; 			
				public void clickRadioBtn() throws InterruptedException {
					Thread.sleep(1000);
				this.radioBtn.isSelected(); 
					}
					
					
	// Enter valid Password			
		@FindBy(id="password")
		private WebElement enterPassword;
				public void sendEnterPassword(String enterPassword) throws InterruptedException {
					Thread.sleep(1000);
					this.enterPassword.sendKeys(enterPassword);
						}	
				
		public String getEnterPassword() {
				return this.enterPassword.getAttribute("value");
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
			
	// click on Add users to course
			
			@FindBy(linkText="Add users to course")
			private WebElement addusersLink;
			public void clickAddusersLink() {
				this.addusersLink.click(); 
			}
			
	
	// Add users to subscribed to the selected course	
							
		@FindBy (xpath="//*[contains(text(),'mehadi manzoor (manzoor)')]")
		private WebElement userList;
		public void sendUserList()  {
			Actions action = new Actions(this.driver);
	        action.moveToElement(userList).click().build().perform();
	     } 
		
	//course from the course list
		@FindBy (xpath="//*[contains(text(),'(BELL) BELL')]")
		private WebElement courseList;
		public void sendcourseList()  {
			Actions action = new Actions(this.driver);
	        action.moveToElement(courseList).click().build().perform();
	     }
		
	// 
		@FindBy (xpath="//*[@class='btn btn-primary']")
		private WebElement addCourse; 	
		public void clickAddcourseBtn() {
			this.addCourse.click(); 
		}
	
	
}
