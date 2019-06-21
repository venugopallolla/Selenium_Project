package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_082_TeacherGenerateReportPOM {



private WebDriver driver; 
	
	public ELTC_082_TeacherGenerateReportPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	// Click on the course link
		@FindBy(xpath="//*[@title='Quiz']")
		private WebElement courseLink;
			public void clickCourseLink() {
				this.courseLink.click(); 
			}
		
	// Click on Click on Tests icon
		@FindBy(xpath="//*[@title='Tests']")
		private WebElement testIcon;
			public void clickTestIcon() {
				this.testIcon.click(); 
			}	
			
	// Click on Create a new test button
		@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[2]/a[1]/img")
		private WebElement newtestBtn;
			public void clickNewtestBtn() {
				this.newtestBtn.click(); 
			}
		
	// Enter valid credentials in Test name textbox
		@FindBy(id="exercise_title")
		private WebElement entertestName;
				public void sendEntertestNam(String entertestNam) {
					this.entertestName.sendKeys(entertestNam);
				}	
				
	// click on advanced setting button
		@FindBy(id="advanced_params")
		private WebElement settingsBtn;
				public void clickSettingsBtn()  {
					this.settingsBtn.click();
							}
					
	//	Give a context to the test textbox 
				
				@FindBy(xpath="//*[@title='Rich Text Editor, exerciseDescription']")
				private WebElement inserttext;
			 	public void clickText(String inserttext) {
					driver.switchTo().frame(inserttext);
					WebElement body1 = driver.switchTo().activeElement();
					//body1.click();
					body1.sendKeys(inserttext);
					driver.switchTo().defaultContent();
				}		
				
/*	
	@FindBy(xpath="//*[@title='Rich Text Editor, exerciseDescription']")
	private WebElement inputText;
		public void clickInputText( String inputText) {
		WebElement body = driver.switchTo().activeElement();
		body.click();
		body.sendKeys(inputText);
		driver.switchTo().defaultContent(); 
			} 
			*/		
					
	//click on At end of test radio button in Feedback section
	@FindBy(xpath="//div//label[contains(text(),'At end of test')]")
	private WebElement feedbackBtn; 			
			public void clickFeedbackBtn() {
				this.feedbackBtn.click(); 
		}
			
	//click on Enable start time checkbox 	
	//@FindBy(id="activate_start_date_check")
	@FindBy(xpath="//div//label[contains(text(),' Enable start time')]")
		private WebElement timeCheckbox;
			public void clickTimeCheckbox() throws AWTException, InterruptedException {
				Robot robot = new Robot();
				Thread.sleep(2000);
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				Thread.sleep(2000);
			this.timeCheckbox.click(); 
						}	
			
	// 	Select valid credentials in time sections	
	@FindBy(id="start_time_alt_text")
	private WebElement startTime;
			public void clickStartTime() throws InterruptedException {
				Thread.sleep(2000);
			this.startTime.click(); 
						}	
	// Click on Done Button
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div[3]/button[2]")
	private WebElement doneBtn; 			
			public void clickDoneBtn() throws InterruptedException {
				Thread.sleep(2000);
			this.doneBtn.click(); 		
			}
			
	// Enter valid credentials in Pass percentage textbox
	@FindBy(id="pass_percentage")
	private WebElement percentageText;
		public void sendPercentageText(String percentageText) throws InterruptedException {
			Thread.sleep(1000);
		this.percentageText.sendKeys(percentageText);
	}	
			
	//  Click on Proceed to questions button
	@FindBy(id="exercise_admin_submitExercise")
	private WebElement proceedBtn;
			public void clickproceedBtn() {
			this.proceedBtn.click(); 
							}	
	// Click on Multiple Choice icon
			@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[5]/div/ul/li[1]/div/a/img")
			private WebElement choiceImg;
				public void clickChoiceImg() {
					this.choiceImg.click(); 
				}		
	// Credentials in Questions textbox	
				@FindBy(id="question_admin_form_questionName")
				private WebElement questionText;
					public void sendQuestionText(String questionText) {
											
					this.questionText.sendKeys(questionText);
				}	
				
	// Valid credentials in first option textbox	
					
		@FindBy(xpath="//iframe[@title='Rich Text Editor, answer[1]']")
		private WebElement firstOption;
				public void sendFirstOption(String firstOption) throws AWTException, InterruptedException {
					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_PAGE_DOWN);
					Thread.sleep(2000);
					
					driver.switchTo().frame(firstOption);
					WebElement body1 = driver.switchTo().activeElement();
					body1.click();
					body1.sendKeys(firstOption);
					driver.switchTo().defaultContent(); 
							} 
					
				
	// Valid credentials in Second option textbox	
				
				@FindBy(xpath="Rich Text Editor, answer[2]")
				private WebElement secondOption;
						public void sendSecondOption(String secondOption)  {
							this.secondOption.sendKeys(secondOption);
						}

	// Valid credentials in Third option textbox	
							
		@FindBy(xpath="Rich Text Editor, answer[3]")
		private WebElement thirdOption;
						public void sendThirdOption(String thirdOption)  {
						this.thirdOption.sendKeys(thirdOption);
								}									
	// Valid credentials in Fourth option textbox	
						
		@FindBy(xpath="Rich Text Editor, answer[4]")
		private WebElement fourthOption;
						public void sendFourthOption(String fourthOption)  {
						this.fourthOption.sendKeys(fourthOption);
							}						
	// click first option radio button
		@FindBy(id="qf_676cc8")
		private WebElement radioBtn;
						public void clickRadioBtn() {
						this.radioBtn.click(); 
									}
	// click Second option radio button
		@FindBy(id="qf_e0c0cd")
		private WebElement secondradioBtn;
				public void clickSecondBtn() {
				this.secondradioBtn.click(); 
													}					
						
	// click on Add this question to the test
		@FindBy(id="submit-question")
		private WebElement submitaddTest;
						public void clickSubmitaddTest() {
						this.submitaddTest.click(); 					
						}
	// Click on Multiple Choice icon
		@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[5]/div/ul/li[1]/div/a/img")
		private WebElement multiIcon;
						public void clickMultiIcon() {
						this.multiIcon.click(); 
							}
	// 	Click on Preview Button
		@FindBy(xpath="//*[@id=\"cm-content\"]/div/div[5]/div/ul/li[1]/div/a/img")
		private WebElement previewBtn;
				public void clickPreviewBtn() {
				this.previewBtn.click(); 
								}	
				
			
				
	// click on Course catalog
		@FindBy(xpath="//*[@id=\"coursesCollapse\"]/div/ul/li[3]/a")
		private WebElement catalogLink;
			public void clickCatalogLink() {
			this.catalogLink.click(); 	
			}
			
	//Enter course name to register in search textbox
		@FindBy(xpath="//div//label[contains(text(),'Search')]")
		private WebElement searchTextbox;
		public void sendSearchTextbox(String searchTextbox) {
			this.searchTextbox.sendKeys(searchTextbox);
		}
	// click on search button
		
		@FindBy (xpath="//*[@class='btn btn-default']")
		private WebElement searchBtn; 
		public void clickSearchBtn() {
			this.searchBtn.click(); 
		}
		
	// Click on Subscribe button of the course to get registered
		@FindBy (xpath="//*[@title='Subscribe']	")
		private WebElement subscribeBtn; 
		public void clickSubscribeBtn() {
			this.subscribeBtn.click(); 
		}
	// Click on Tests icon
			
		@FindBy (xpath="//*[@id=\"cm-content\"]/div/div[1]/a")
		private WebElement testLink; 
		public void clickTestLink() {
				this.testLink.click(); 		
		}
		
	// click on Start Test button
		@FindBy(xpath="//*[@title='Tests']")
		private WebElement testsIcon;
			public void clickTestsIcon() {
				this.testsIcon.click(); 
			}
			
	// Click on Test name link
	@FindBy(xpath="//*[@id=\"exercise_list_130\"]/td[1]/a")
	private WebElement testnameLink;
				public void clickTestnameLink() {
					this.testnameLink.click(); 
				}
		
	// click on Start Test button
	@FindBy(xpath="//*[@class='btn btn-success btn-large']")
	private WebElement startBtn;
			public void clickStartBtn() {
			this.startBtn.click(); 
							}	
	// 		
			
	@FindBy(id="choice-132-1")
	private WebElement course1Btn;
			public void clickCourse1Btn()  {
			this.course1Btn.click();
			}
	//
	@FindBy(id="//*[@class='btn btn-primary question-validate-btn']")
	private WebElement nextBtn;
			public void clickNextBtn()  {
					this.nextBtn.click();		
						}	
	//
	@FindBy(id="//*[@class='btn btn-primary question-validate-btn']")
	private WebElement endTest;
			public void clickEndTest()  {
				this.endTest.click();		
								}		
			
}		
			
		

