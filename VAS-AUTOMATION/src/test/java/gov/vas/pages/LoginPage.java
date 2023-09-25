package gov.vas.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
           
	         WebDriver  driver;
	          @FindBy (how=How.XPATH, using = "//button[@id='other-sign-in-modal-iwa-logon-btn']")   private WebElement  signinWindowsAuth;
	             
	            public LoginPage(WebDriver driver) {
						   this.driver = driver;
					       PageFactory.initElements(driver, this); }
					 
	            
	             public Boolean  isSigninElementEnable() {
	            	       Boolean status = signinWindowsAuth.isEnabled();
	            	       System.out.println(status);
	            	       return status;
	             }
	             
	             public Boolean isSigninWinAuthPageDisplayed() {
	            	       Boolean  status = signinWindowsAuth.isDisplayed();
	            	       System.out.println(status);
	            	       return status;
	            	   
	             }
	             @SuppressWarnings("deprecation")
				public void  perform_click_signin_wind_auth() throws Exception {
	            	     signinWindowsAuth.click();
	            	     driver.manage().timeouts().pageLoadTimeout(50,  TimeUnit.SECONDS);
	            	     Thread.sleep(8000);
	            	     System.out.println("Link Clicked for Login.");
	            	     
	             }
	             
}
