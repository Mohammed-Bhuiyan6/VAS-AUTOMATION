package gov.vas_testcases;

import org.testng.annotations.Test;

import gov.vas.libraries.TestBase;
import gov.vas.pages.HomePage;

public class HomePageTest  extends  TestBase {
	
	             @Test (priority = 1)
	              public void  home_page_test()  throws Exception {
	            	  
	            	                HomePage  home  = new HomePage(driver);
	            	                home.get_home_page_header();
	            	                home.validate_vas_home_title();
	            	                home.perform_click_view_signin_options();
	              }
	  }
