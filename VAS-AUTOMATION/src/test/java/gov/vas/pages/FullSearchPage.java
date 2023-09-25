package gov.vas.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FullSearchPage {

	            public   WebDriver driver;
	            public String strExpected_Page_Header = "Enter Patient Information";
	            
	            @FindBy(how = How.XPATH, using = "//div[@class='modal-content']/div/h3[1]")  private WebElement page_header;
	            @FindBy(how = How.XPATH, using = "//div[@class='modal-body']/div/button[1]")  private  WebElement  full_search_button;
	            @FindBy(how = How.XPATH ,using = "//input[@id='name']")  private  WebElement  patient_full_name;
	            @FindBy(how = How.XPATH, using = "//input[@id='dob']")  private WebElement  date_of_birth;
	            @FindBy(how = How.XPATH, using = "//input[@id='ssn']")   private  WebElement  social_security_number;
	            @FindBy(how = How.XPATH, using = "//button[@class='usa-button']") private WebElement  search_for_patient_button;
	            
	            
	          public FullSearchPage(WebDriver driver) {
	        	        this.driver = driver;
	        	        PageFactory.initElements(driver, this);
	           }
	          
	          public void  perform_click_full_search_button() {
	        	                full_search_button.click();
	          }
	           public void perform_set_patient_full_name(String strFullName) {
	        	                patient_full_name.clear();
	        	                patient_full_name.sendKeys(strFullName);
	           }
	           public void perform_set_date_of_birth(String strDOB) {
	        	                date_of_birth.clear();
	        	                date_of_birth.sendKeys(strDOB);
	           }
	           public void perform_set_social_security_number(String strSSN) {
	        	                social_security_number.clear();
	        	                social_security_number.sendKeys(strSSN);
	           }
	           public void perform_click_search_for_patient_button() {
	        	                 search_for_patient_button.click();
	           }
	           public boolean isPageDisplayed() {
	        	                boolean status =  page_header.isDisplayed();
	        	                return status;
	           }
	           public boolean verify_patient_search_page_header() {
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
