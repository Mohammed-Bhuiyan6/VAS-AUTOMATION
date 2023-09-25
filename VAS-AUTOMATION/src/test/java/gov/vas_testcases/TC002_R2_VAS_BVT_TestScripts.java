package gov.vas_testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class TC002_R2_VAS_BVT_TestScripts  extends  ExtentReportTestBase {
	
	
	By  home_page_header = By.xpath("//*[@id='bs4-upper-white-text']");
	
      @Test (priority = 1)
	  public void _verify_title_test_01() {
	 	     String method_name =  new Exception().getStackTrace()[0].getMethodName();
	 	     test = extent.createTest(method_name, "vas home page title verify");
	 	 
	 	     test.log(Status.INFO, "Test Starting.") ;
	 	     launch_browser();
	 	     test.assignCategory("FUN");
	 	     String expected_title = "VA Identity and Access Management System (IAM)";
	 	     String title = driver.getTitle();
	 	     System.out.println( "vas title : " +title);
	 	     test.log(Status.INFO,  "VA Title  : " +title);
			 Assert.assertEquals(title, expected_title);
			 test.log(Status.PASS,  "title verified passed.");
		 	 tear_down();
			 test.log(Status.INFO , "test end");
				 
	    }
      
      @Test (priority = 2)
      public void _verify_logo_test_02() {
	 	     String method_name =  new Exception().getStackTrace()[0].getMethodName();
	 	     test = extent.createTest(method_name, "vas home page logo displayed.");
	 	     test.log(Status.INFO, "Test Starting.") ;
	 	    launch_browser(); 
	 	     test.assignCategory("BVT");
	 	
	 	     
	 	    Boolean status = driver.findElement(home_page_header).isDisplayed();
	 	
	 	      test.log(Status.PASS, "Logo displayed.");
	 	     test.log(Status.PASS, "logo verify passed.  Status= "+status);
	 	    String  page_header = driver.findElement(home_page_header).getText() ;
	 	    String  expected_header="VA SINGLE SIGN-ON";
	 	    test.log(Status.INFO, page_header);
	 	    Assert.assertEquals(page_header, expected_header);
	 	    test.log(Status.PASS, "Test Passed.");
	 	   tear_down();
	 	    test.log(Status.INFO, "test done");
	    }
	    
      @Test(priority =3)
      public void  _homepg_title_test_03() {
    	  
    	         String method_name =  new Exception().getStackTrace()[0].getMethodName();
 	             test = extent.createTest(method_name, "validate vas home page title. ");
 	             test.log(Status.INFO, "Test Starting.") ;
 	             launch_browser();
 	            test.assignCategory("BVT");
	            String  actual_page_title =   driver.findElement(By.xpath( "//div[@id='bs4-text-inner-div']/p[3]")).getText()  ;
	            test.log(Status.INFO, "correct page : " +actual_page_title);
                String expected_vas_home_page = "Vista Audit Solution (VAS)" ;
    	         Assert.assertEquals(actual_page_title , expected_vas_home_page);
    	        test.log(Status.PASS ,"validation passed.");
    	        tear_down();
    	        test.log(Status.INFO, "test done.");
    	        
}
      
            
      @Test (priority = 4)
      public void   _signin_button_test_04() {
	                String method_name =  new Exception().getStackTrace()[0].getMethodName();
 	                test = extent.createTest(method_name, "verify signin button click. ");
 	                test.log(Status.INFO, "Test Starting.") ;
 	                launch_browser();
 	               test.assignCategory("FUN");
	               WebElement  signin_button = driver.findElement(By.xpath("//div[@id='bs4-piv-lower']/a") );
	              if ( (signin_button.isDisplayed())  &&     (signin_button.isEnabled())) {
	                	   test.log(Status.PASS, "signin button displayed.");
	    	               test.log(Status.PASS, "signin button enabled.");
	    	               signin_button.click();
	    	               test.log(Status.PASS,"signin button clicked successed.");
	    	          }
	         }
         
         @SuppressWarnings("deprecation")
    	  @Test (priority = 5)
	      public void  _login_page_test_05() throws Exception {
        	                String method_name =  new Exception().getStackTrace()[0].getMethodName();
                            test = extent.createTest(method_name, "Login Page Test");
                            test.log(Status.INFO, "Test Starting.") ;
                            test.assignCategory("FUN");
                            WebElement  login_page = driver.findElement(By.xpath("//button[@id='other-sign-in-modal-iwa-logon-btn']"));
                            if (login_page.isDisplayed())
                            	test.log(Status.PASS, "Login page displayed.");
                            if (login_page.isEnabled())
                            	test.log(Status.PASS, "Signin button enabled.");
                            Thread.sleep(5000);
                             login_page.click();
                             test.log(Status.PASS, "button clicked.");	
                             driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
                             test.log(Status.INFO, "vas login successed.");
                             test.log(Status.INFO, "test ended.");
          }
         
         @Test (priority = 6)
         public void  _loginpg_logo_test_06() {
        	               String method_name =  new Exception().getStackTrace()[0].getMethodName();
                           test = extent.createTest(method_name, "verify login page header.");
                           test.log(Status.INFO, "Test Starting.") ;
                           test.assignCategory("FUN");
                           test.log(Status.INFO, "Login page title : "+ driver.getTitle());
                           WebElement login_header = driver.findElement(By.xpath("//div[@id='extended-logo']/em/a"));
                           if (login_header.isDisplayed())
                        	   test.log(Status.INFO, "login header displayed.");
                           String  expected_page_header = "VA.gov | VistA Audit Solution (VAS)" ;
                           String  actual_page_header =  login_header.getText();
                           System.out.println(actual_page_header);
                           Assert.assertEquals(actual_page_header, expected_page_header);
                           test.log(Status.PASS, "test passed.");
                           test.log(Status.INFO, "test ended.");
                           
                           
         }
         
         @Test (priority = 7)
         public void _verify_feature_test_07() throws Exception {
                             String method_name =  new Exception().getStackTrace()[0].getMethodName();
                            test = extent.createTest(method_name, "verify vas About Module.");
                            test.log(Status.INFO, "Test Starting.") ;
                            test.assignCategory("FUN");
                            WebElement vas_about = driver.findElement(By.xpath("//ul[@class='site-header__nav-list']/li[1]"));
                          if (vas_about.isDisplayed())
	                        test.log(Status.INFO, "About module displayed.");
                          if (vas_about.isEnabled());
                             test.log(Status.PASS, "module enabled.");
                             vas_about.click();
                             Thread.sleep(5000) ;
                             test.log(Status.PASS, "About module has been clicked.");
                             test.log(Status.PASS, "test passed.");
                             test.log(Status.INFO, "test ended.");
         }
         
         @Test (priority = 8)
         public void  _login_pg_header_test_08() {
        	 
        	                String method_name =  new Exception().getStackTrace()[0].getMethodName();
                            test = extent.createTest(method_name, "About -overview  page.");
                            test.log(Status.INFO, "Test Starting.") ;
                            test.assignCategory("FUN");
               
                           WebElement vas_page_title = driver.findElement(By.xpath("//*[@id='About']/div[2]/main/div[1]/h1"));
                           if (vas_page_title.isDisplayed())
            	          test.log(Status.INFO, "patient page displayed.");
                          String  expected_page_title = "Getting Started with VistA Audit Solution (VAS)" ;
                          String  actual_page_title =  vas_page_title.getText();
                          test.log(Status.INFO, actual_page_title);
                          System.out.println(actual_page_title );
                          Assert.assertEquals(actual_page_title, expected_page_title);
                          test.log(Status.PASS, "test passed.");
                          test.log(Status.INFO, "test ended.");
                }
       }
