package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sessionscategorieslist_ELTC_052_POM {
	
private WebDriver driver; 
	
	public Sessionscategorieslist_ELTC_052_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
		
	
	@FindBy(linkText="Sessions categories list")
	private WebElement sessionscategoriesLink;
	public void clickSessionscategoriesLink() {
		this.sessionscategoriesLink.click(); 
	}
	
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[1]/div/div[1]/a[1]/img")
	private WebElement addcategoryIcon;
	public void clickAddcategoryLink() {
		this.addcategoryIcon.click(); 
	}
	
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div/div/form/div[1]/div[1]/input")
	private WebElement entercategoryName; 
	public void sendCategoryName(String updateCode) {
		this.entercategoryName.sendKeys(updateCode);
	}
	
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div/div/form/div[4]/div[1]/button")
	private WebElement addcategoryBtn; 
	public void clickAddcategoryBtn() {
		this.addcategoryBtn.click(); 
	}
	
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[2]/div/div[1]/a[2]/img")
	private WebElement sessionlistIcon;
	public void clickSessionlistIcon() {
		this.sessionlistIcon.click(); 
	}
	
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[1]/a[1]/img")
	private WebElement addtrainingsessionIcon;
	public void clickAddtrainingsessionIcon() {
		this.addtrainingsessionIcon.click(); 
	}
	
	@FindBy(id="add_session_name")
	private WebElement sessionName;
	public void sendSessionName(String updateCode) {
		this.sessionName.sendKeys(updateCode);
	}
	
	@FindBy(id="advanced_params")
	private WebElement advancedsettingsBtn; 
	public void clickAdvancedsettingsBtn() {
		this.advancedsettingsBtn.click(); 
	}
	
	
	@FindBy(xpath="//*[@id=\"advanced_params_options\"]/div[2]/div[1]/div/button/span[1]")
	private WebElement sessionscategoryList; 
		
	@FindBy (xpath="//*[contains(text(),'Testing Venu')]")
	private WebElement profile;
	
		public void sendsessionscategoryList()  {
		Actions action = new Actions(this.driver);
        action.moveToElement(sessionscategoryList).click().build().perform();
        action.sendKeys("Testing Venu").build().perform();
        action.moveToElement(profile).click().build().perform();
	
	}
	
	@FindBy(id="add_session_submit")
	private WebElement nextstepBtn;
		public void clickNextstepBtn() {
		this.nextstepBtn.click(); 
	}
	
	@FindBy (xpath="//*[contains(text(),'BELL (BELL) ')]")
	private WebElement courseList;
		
	@FindBy (xpath="//*[@class='fa fa-chevron-right']")
	private WebElement addCourse; 
		
	public void sendcourseList()  {
		Actions action = new Actions(this.driver);
        action.moveToElement(courseList).click().build().perform();
     }
		
	public void clickAddcourseBtn() {
			this.addCourse.click(); 
		}
	
	@FindBy (xpath="//*[@class='btn btn-success']")
	private WebElement coursenextstepBtn; 
	
	public void clickCoursenextstepBtn() {
		this.coursenextstepBtn.click(); 
	}
		
	
	@FindBy(id="user_to_add")
	private WebElement enteruserName; 
	public void sendUserName(String userName) {
		//this.enteruserName.clear();
		this.enteruserName.sendKeys(userName);
	}
	
	
	@FindBy(xpath="//*[@id=\"ajax_list_users_single\"]/a[1]")
	private WebElement portaluserList;
	public void clickPortaluserList() {
		this.portaluserList.click(); 
	}
	
	@FindBy (xpath="//*[@class='btn btn-success']")
	private WebElement finishsessionBtn; 
	
	public void clickFinishsessionBtn() {
		this.finishsessionBtn.click(); 
	}

}
