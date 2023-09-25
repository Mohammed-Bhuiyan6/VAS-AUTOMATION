package gov.vas.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PartialSearchPage {
                 
	                WebDriver  driver;
	                
	                public String strExpected_Page_Header = "Enter Patient Information";
		            
		            @FindBy(how = How.XPATH, using = "//div[@class='modal-content']/div/h3[1]")  private WebElement page_header;
	                
	                @FindBy (how = How.XPATH, using = "//div[@class='modal-body']/div/button[2]")  private static WebElement  partial_search ;
	                @FindBy (how = How.XPATH , using = "//input[@id='lastInitial']")  private static WebElement  patient_first_initial_of_last_name ;
	                @FindBy (how = How.XPATH , using = "//input[@id='last4']")   private static WebElement  patient_last_4_digits_of_ssn ;
	                @FindBy(how = How.XPATH, using = "//button[@class='usa-button']") private WebElement  search_for_patient_button ;
	                
	                public  PartialSearchPage( WebDriver  driver) {
	                	       this.driver = driver;
	                	       PageFactory.initElements(driver, this);
	               }
	                
	                public void perform_click_partial_search() {
	                	            partial_search.click();
	                }
	                public void perform_set_patient_first_initial_of_last_name(String strFirstIniOfLastName) {
	                	              patient_first_initial_of_last_name.clear();
	                	              patient_first_initial_of_last_name.sendKeys(strFirstIniOfLastName);
	                }
	                public  void  perform_set_patient_last_4_digits_of_ssn(String  iLast4DigitsOfSSN) {
	                	             patient_last_4_digits_of_ssn.clear();
	                	             patient_last_4_digits_of_ssn.sendKeys(iLast4DigitsOfSSN);
	                }
	               public void  perform_click_search_for_patient_button() {
	            	                 search_for_patient_button.click();
	               }
	               public boolean isPageDisplayed() {
   	                              boolean status =  page_header.isDisplayed();
   	                              return status;
                  }
	               public boolean verify_patient_partial_search_page_header() {
	        	             String actualPageHeader = page_header.getText();
	        	             return actualPageHeader.equals(strExpected_Page_Header);
	                }
	               public boolean isButtonVisible() {
	        	              boolean status = search_for_patient_button.isDisplayed();
	        	              return status;
	               }
	              public boolean isButtonEnableForClick() {
	        	              boolean  status = search_for_patient_button.isEnabled();
	        	              return status;
	              }
	               
 }
