package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class subscribe_promotion_ELTC_055_POM {
	
private WebDriver driver; 
	
	public subscribe_promotion_ELTC_055_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
		//Careers and promotions link
	@FindBy(linkText="Careers and promotions")
	private WebElement careerspromoLink;
		public void clickCareerspromoLink() {
		this.careerspromoLink.click(); 
	}

		//careers icon
	@FindBy(xpath="//*[@id=\"toolbar-career\"]/div/div/a[2]/img")
	private WebElement careerIcon;	
		public void clickCareerIcon() {
		this.careerIcon.click(); 
	}
		
		//Add icon
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[1]/a[2]/img")
	private WebElement addIcon;	
			public void clickAddIcon() {
			this.addIcon.click(); 
		}	
			
		//Enter credentials in Name	
	@FindBy(id="career_name")
	private WebElement careerName;		
		public void sendCareerName(String userName) {
		this.careerName.sendKeys(userName);
	}
			
		//Add button
	@FindBy(id="career_submit")
	private WebElement addBtn;	
				public void clickAddBtn() {
				this.addBtn.click(); 
			}	
				
		//Careers and promotions link
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/ul/li[2]/a")
	private WebElement careeerpromotionLink;	
				public void clickCareeerpromotionLink() {
				this.careeerpromotionLink.click(); 
					}		
				
		//Promotions icon
	@FindBy(xpath="//*[@id=\"toolbar-career\"]/div/div/a[3]/img")
	private WebElement promotionsIcon;	
					public void clickPromotionsIcon() {
					this.promotionsIcon.click(); 
				}		
			
		//Add Promotion Icon
	@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[1]/a[2]/img")
	private WebElement promoaddIcon;	
					public void clickPromoaddIcon() {
					this.promoaddIcon.click(); 
						}					
		//	Enter Promotions Name	
	@FindBy(id="name")
	private WebElement promoName;		
					public void sendPromoName(String userName) {
					this.promoName.sendKeys(userName);
					}	
					
		// 	Promotion submit
					
	@FindBy(id="promotion_submit")
	private WebElement promoaddBtn;	
					public void clickPromoaddBtn() {
					this.promoaddBtn.click(); 
							}	
					
		//  Subscribe sessions to promotion icon
	@FindBy(xpath="//*[@id=\"21\"]/td[4]/a[1]/img")
	private WebElement subscribeIcon;				
				    public void clickSubscribeIcon() {
					this.subscribeIcon.click(); 
				}
				    
		// select Subscribe sessions		    
	@FindBy (xpath="//*[contains(text(),'hello123')]")
	private WebElement sessionsList;				
				public void clickSessionsList() {
				this.sessionsList.click(); 
				}	
	
		// Move Subscribe sessions List
	@FindBy (xpath="//*[@class='fa fa-arrow-right']")
	private WebElement movelistBtn; 
				public void clickMovelistBtn() {
				this.movelistBtn.click(); 
				}
		// subscribe sessions in promotion
	@FindBy (xpath="//*[@class='btn btn-primary']")
	private WebElement subscribeBtn; 
				public void clickSubscribeBtn() {
				this.subscribeBtn.click(); 			
				}
	
					
}
