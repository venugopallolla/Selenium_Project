package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleUsersPOM {
	
	
private WebDriver driver; 
	
	
	public MultipleUsersPOM(WebDriver driver) {
	// TODO Auto-generated constructor stub
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}
		
	// Click on Sign up Link
	
	@FindBy(linkText="Sign up!")
	private WebElement signupLink;
		public void clickSignupLink() {
		this.signupLink.click(); 
				}
		
	// Enter First name in text box	
		@FindBy(id="registration_firstname")
		private WebElement enterfirstName;
				public void sendFirstName(String enterfirstName) {
					this.enterfirstName.sendKeys(enterfirstName);
				}
				
	// Enter Last name in text box	
		@FindBy(id="registration_lastname")
		private WebElement enterlastName;
				public void sendLastName(String enterlastName) {
					this.enterlastName.sendKeys(enterlastName);
				}	
				
	// Enter E-mail 
		@FindBy(id="registration_email")
		private WebElement entereMail;
				public void sendEMail(String entereMail) {
					this.entereMail.sendKeys(entereMail);
				}	
				
		@FindBy(id="username")
		private WebElement userName;
				public void sendUserName(String userName) {
					this.userName.sendKeys(userName);
						}		
				
		@FindBy(id="pass1")
		private WebElement userPassword;
			public void sendUserPassword(String userPassword) {
			this.userPassword.sendKeys(userPassword);
								}	
			
		@FindBy(id="pass2")
		private WebElement confirmPassword;
				public void sendConfirmPassword(String confirmPassword) {
				this.confirmPassword.sendKeys(confirmPassword);
									}	
				
		// Enter Phone number 
		@FindBy(id="registration_phone")
		private WebElement phoneNo;
						public void sendPhoneNo(String phoneNo) {
						this.phoneNo.sendKeys(phoneNo);
						}		
		
		@FindBy(xpath="//span[contains(text(),'English')]")
						private WebElement selectLanguage; 
		public void sendselectLanguage()  {
						Actions action2 = new Actions(this.driver);
	        action2.moveToElement(selectLanguage).click().build().perform();
	       action2.sendKeys("English").build().perform();
	        action2.moveToElement(selectLanguage).click().build().perform();
		
		}	
		
		@FindBy(id="registration_submit")
		private WebElement registrationBtn;
				public void clickRegistrationBtn() {
			this.registrationBtn.click(); 
					}
//	Assertion - User has been added
				@FindBy(xpath="//*[contains(text(),'Registration')]")
				private WebElement adduserMsg;
				 		public String adduserMsg()
				{
					
					return this.adduserMsg.getText();
				}		
				

}
