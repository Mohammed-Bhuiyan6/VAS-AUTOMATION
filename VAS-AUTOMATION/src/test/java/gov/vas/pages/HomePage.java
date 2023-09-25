package gov.vas.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
             
	           WebDriver  driver;
	            public static String expected_page_header = "VA SINGLE SIGN-ON" ;
			
	        	@FindBy(how=How.XPATH,  using ="//*[@id='bs4-upper-white-text']" )   private static  WebElement   homePageHeader;
	        	@FindBy(how = How.XPATH, using = "//div[@id='bs4-piv-lower']/a")       private static   WebElement   view_other_signin_options;
	        	@FindBy(how = How.XPATH, using = "//div[@id='bs4-text-inner-div']/p[3]")  public  WebElement  vas_ui_home_title_name ;
	        	
	        	public HomePage (WebDriver driver) {
	        		      this.driver = driver;
	        		      PageFactory.initElements (driver, this);
	        	}
	        	
	      
	        	
	        	public  boolean isPage_Displayed() {
	        		     Boolean status = homePageHeader.isDisplayed();
	        		     if (status) {
	        		    	 System.out.println("home page header displayed. Status = "+status);
	        		    	 Assert.assertTrue(status);
	        		    	
	        		     }
	        		     else
	        		    	 Assert.fail("home page header is not display.");
	        		  
	        		     
	        		     return status;
	        	}
	        	public   void get_home_page_header() {
	        		       String textMsg =  homePageHeader.getText();
	        		       System.out.println(textMsg);
	        		     
	        	}
	        	public   boolean verify_homepage_header () {
	        		       boolean  verify = homePageHeader.getText().equals("VA SINGLE SIGN-ON");
	        		  
	        		       return verify;
	        	}
	        	public  void validate_vas_home_title() {
	        		              String  actual_page_title = vas_ui_home_title_name.getText();
	        		              String expected_vas_home_page = "Vista Audit Solution (VAS)" ;
	        		            	  Assert.assertEquals(actual_page_title , expected_vas_home_page);
	        	}  
	        	
	        	public  void  perform_click_view_signin_options() throws Exception {
	        		            view_other_signin_options.click();
	        		            Thread.sleep(5000);
		       	}
	        	
	        	
	        	public  void verify_home_page_title() {
	        		                String  actual_title = driver.getTitle();
	        		                System.out.println(actual_title);
	        		         
	        	}
	        
	    }

         