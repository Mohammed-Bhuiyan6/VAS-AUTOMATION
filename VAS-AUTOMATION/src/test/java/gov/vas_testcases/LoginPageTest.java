package gov.vas_testcases;

import org.testng.annotations.Test;

import gov.vas.pages.LoginPage;

public class LoginPageTest  extends HomePageTest{

	       @Test (priority = 2)      
	       public void login_page_test() throws  Exception {
	            	   
	            	             LoginPage login_page  = new LoginPage(driver);
	            	             login_page.isSigninWinAuthPageDisplayed();
	            	             login_page.isSigninElementEnable();
	            	             login_page.perform_click_signin_wind_auth();
								
	            	             
	               }
	    
}
