package gov.vas_testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class PartialSearchTests  extends HomeLoginPageTest{
	
	            ////div[@id='About']/div/nav/ul[1]/li[3]/ul/li/button
	
	            By   about_patient_search_xpath  =  By.xpath("//ul[@class='usa-accordion']/li/button");
	            By   about_partial_search_xpath  =  By.xpath(" //div[@id='about-patient-search']/ul/li[2]/a");
	            By   about_partial_search_page_header_xpath = By.xpath("//div[@id='About']/div[2]/main/div[5]/h1");
	            By   about_use_partial_search_xpath = By.xpath("//div[@id='About']/div[2]/main/div[5]/h2");
	            
	            By  patient_partial_search_xpath = By.xpath("//div[@id='PatientSearch']/div/nav/ul/li[3]/a");
	            By  patient_partial_search_header_xpath  =  By.xpath("//div[@id='PatientSearch']/div[2]/main/div[2]/h1") ;
	            By  four_digits_ssn_xpath  =  By.xpath("//input[@id='last4']");
	            
	            By  search_button_xpath = By.xpath("//button[@class='usa-button']");
	            
	            By  page_header = By.xpath("//*[@id='PatientSearch']/div[2]/main/div[2]/h1");
	            
	            
	            
	            
	            
	            ////=====================================================================================================================
	            
	            
	            
	          
	            
	            @Test (priority = 9)
	            public void  _about_patient_search_test_ps9(){
	            	                    
	            	              String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                  test = extent.createTest(method_name, "validate about patient search  +.");
                                  test.log(Status.INFO, "Test Starting.") ;
                                  test.assignCategory("FUN");
                                  
                                  WebElement about_patient_search = driver.findElement(about_patient_search_xpath);
                                  Boolean display_status = about_patient_search.isDisplayed();
                                  Boolean enable_status = about_patient_search.isEnabled();
                                  
                                  String actual_text = about_patient_search.getText();
                                  String expected_text = "Patient Search";
                                  
                                  if (display_status) {
                                	  test.log(Status.PASS, "Patient Search   +  component was present.");
                                  }else {
                                	  test.log(Status.FAIL, "Patient Search   +  component was not present.");
                                  }
                                  
                                  if (enable_status) {
                                	  test.log(Status.PASS, "Patient Search   +  component was enable." );
                                  }else {
                                	  test.log(Status.FAIL, "Patient Search   +  component was not enable.");
                                  }
                                  
                                  if (display_status) {
                                	    Assert.assertEquals(actual_text, expected_text);
                                        test.log(Status.PASS, "About Patient Search validation passed.") ;
                                  }else {
                                	  test.log(Status.FAIL, "Patient Search   +  component was not present.");
                                  }
									/*
									 * if (enable_status) { about_patient_search.click(); test.log(Status.PASS,
									 * "Patient Search  + button has been clicked."); }else { test.log(Status.FAIL,
									 * "Patient Search +  button did not click."); }
									 */
                                  
                                  
                                  
                                  test.log(Status.PASS, "About Patient  Search +  test has been passed.");
                                  test.log(Status.INFO, "test ended.");
	            }
        
	            @Test (priority = 10)
	            public void  _about_partial_search_test_ps10(){
	            	
  	                         String method_name =  new Exception().getStackTrace()[0].getMethodName();
                             test = extent.createTest(method_name, "validate about partial search.");
                             test.log(Status.INFO, "Test Starting.") ;
                             test.assignCategory("FUN");
                    
                             WebElement about_partial_search = driver.findElement(about_partial_search_xpath);
                             Boolean display_status = about_partial_search.isDisplayed();
                             Boolean enable_status = about_partial_search.isEnabled();
                    
                             String actual_text = about_partial_search.getText();
                             String expected_text = "Partial Search";
                    
                            if (display_status) {
                  	            test.log(Status.PASS, "Partial Search  component was present.");
                            }else {
                  	           test.log(Status.FAIL, "Partial Search    component was not present.");
                            }
                    
                           if (enable_status) {
                  	           test.log(Status.PASS, "Partial Search  component was enable." );
                            }else {
                  	         test.log(Status.FAIL, "Partial Search   component was not enable.");
                           }
                    
                              Assert.assertEquals(actual_text, expected_text);
                             test.log(Status.PASS, "About Patient Search validation passed.") ;
                             about_partial_search.click();
                        	 test.log(Status.PASS, "Partial Search  button has been clicked.");
                        
                            test.log(Status.PASS, "About Partial  Search  test has been passed.");
                            test.log(Status.INFO, "test ended.");
                   }
	            
	           @Test (priority = 11) 
	           public void  _about_partial_search_page_validation_test_ps11() {
                               String method_name =  new Exception().getStackTrace()[0].getMethodName();
                               test = extent.createTest(method_name, "validate about partial search page.");
                               test.log(Status.INFO, "Test Starting.") ;
                               test.assignCategory("FUN");

                               WebElement  search_result =  driver.findElement(about_partial_search_page_header_xpath );
                                Boolean  display_status  =  search_result.isDisplayed();
                                String actual_text = search_result.getText();
                                test.log(Status.INFO, actual_text);
                                String expected_text = "Partial Search Component";
  

                                  if (display_status)
                                      test.log(Status.INFO, "about partial search page displayed.");
                                 else
                                	 test.log(Status.FAIL, "about partial search page not display.");
  
                                  Assert.assertEquals(actual_text, expected_text);
                                  test.log(Status.PASS, "about partial search page validation test passed.") ;
                                  test.log(Status.INFO, "test ended.");
                                  
                     }
	           
	           
               @Test (priority = 12)    
	           public void  _how_to_use_partial_search_page_test_ps12() {
                                String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                test = extent.createTest(method_name, "verify How to use partial search page.");
                                test.log(Status.INFO, "Test Starting.") ;
                                test.assignCategory("FUN");

                                WebElement  search_result =  driver.findElement(about_use_partial_search_xpath );
                                 Boolean  display_status  =  search_result.isDisplayed();
                                 String actual_text = search_result.getText();
                                 test.log(Status.INFO, actual_text);
                                 String expected_text = "How to use Partial Search";
 

                                   if (display_status)
                                         test.log(Status.INFO, "How to use Partial Search page displayed.");
                                   else
                               	         test.log(Status.FAIL, "How to use Partial Search page not display.");
 
                                    Assert.assertEquals(actual_text, expected_text);
                                    test.log(Status.PASS, "How to use Partial Search page validation test passed.") ;
                                    test.log(Status.INFO, "test ended.");
                          }
	           
	                
               public void  _patient_partial_search_test_pps13(){
	            	
                                  String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                  test = extent.createTest(method_name, "patient  partial search.");
                                  test.log(Status.INFO, "Test Starting.") ;
                                  test.assignCategory("FUN");
          
                                  WebElement patient_partial_search = driver.findElement(patient_partial_search_xpath);
                                  Boolean display_status = patient_partial_search.isDisplayed();
                                  Boolean enable_status = patient_partial_search.isEnabled();
          
                                  String actual_text = patient_partial_search.getText();
                                  String expected_text = "Partial Search";
          
                                  if (display_status) {
        	                          test.log(Status.PASS, "patient partial search displayed.");
                                 }else {
        	                          test.log(Status.FAIL, "patient Partial Search  was not present.");
                                 }  
        	                    if (enable_status) {
        	                  	       test.log(Status.PASS, "patient partial search enabled." );
        	                     }else {
        	                  	      test.log(Status.FAIL, "Partial Search  was not enable.");
        	                     }
        	                    
                                    Assert.assertEquals(actual_text, expected_text);
                                    test.log(Status.PASS, " Patient Partial Search validation test passed.") ;
                                   patient_partial_search.click();
              	                   test.log(Status.PASS, "Partial Search  button has been clicked.");
              
                                   test.log(Status.PASS, "Patient Partial  Search  test has been passed.");
                                   test.log(Status.INFO, "test ended.");
                            }
               
               
               public void  _patient_partial_search_page_test_pps14() {
                                       String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                      test = extent.createTest(method_name, "validate patient partial search page.");
                                      test.log(Status.INFO, "Test Starting.") ;
                                      test.assignCategory("FUN");

                                       WebElement  expected_element =  driver.findElement(patient_partial_search_header_xpath );
                                      Boolean  display_status  =  expected_element.isDisplayed();
                                      String actual_text = expected_element.getText();
                                      test.log(Status.INFO, actual_text);
                                      String expected_text = "Patient Partial Search";

                                     if (display_status)
                                            test.log(Status.INFO, "patient partial search page displayed.");
                                    else
                    	                    test.log(Status.FAIL, "patient partial search page not display.");

                                    Assert.assertEquals(actual_text, expected_text);
                                    test.log(Status.PASS, "patient  partial search page validation test passed.") ;
                                    test.log(Status.INFO, "test ended.");
                         }
               
               
               public void  _patient_partial_search_last4_ssn15(String  intLast4dSSN){
	            	
                                String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                test = extent.createTest(method_name, "patient  last 4 digits ssn test.");
                                test.log(Status.INFO, "Test Starting.") ;
                                test.assignCategory("FUN");

                                WebElement patient_last4_ssn = driver.findElement(four_digits_ssn_xpath);
                                Boolean display_status = patient_last4_ssn.isDisplayed();
                                Boolean enable_status = patient_last4_ssn.isEnabled();

                                if (display_status) {
                                  test.log(Status.PASS, "patient last 4 digits ssn displayed.");
                                }else {
                                 test.log(Status.FAIL, "patient last 4 digits ssn was not display.");
                                }  
               
                                if (enable_status) {
               	                  test.log(Status.PASS, "patient last 4 digits ssn enabled." );
                                }else {
               	                 test.log(Status.FAIL, "patient last 4 digits ssn was not enable.");
                                }
                                patient_last4_ssn.clear();
                                patient_last4_ssn.sendKeys(intLast4dSSN);

                                test.log(Status.PASS, "patient last 4 digits ssn  test has been passed.");
                                test.log(Status.INFO, "test ended.");
                  }
               
           	@SuppressWarnings("deprecation")
			public void  _click_search_for_patient_test_16() {
    	           
                            String method_name =  new Exception().getStackTrace()[0].getMethodName();
                           test = extent.createTest(method_name, "perform to click search for patient.");
                           test.log(Status.INFO, "Test Starting.") ;
                           test.assignCategory("FUN");

                           WebElement  search_field =  driver.findElement(search_button_xpath );
                           Boolean  display_status  =  search_field.isDisplayed();
                           Boolean   enable_status  =  search_field.isEnabled() ;
               
                           String actual_text = search_field.getText();
                           String expected_text = "Search for Patient" ;
          
                           if (display_status)
                                test.log(Status.PASS, "patient search field displayed.");
                          else
                	           test.log(Status.PASS, "search field not display.");

                          if (enable_status)
                              test.log(Status.INFO, "search field enabled.");
                         else
       	                     test.log(Status.FAIL, "search field not enable.");
         
                         Assert.assertEquals(actual_text, expected_text);
                         test.log(Status.PASS, "Search for Patient field validation passed.") ;
          
                         search_field.click();
                         
                        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
                       test.log(Status.PASS, "search button has been clicked.");

                        test.log(Status.PASS, "search for patient  test passed.");
                       test.log(Status.INFO, "test ended.");
           
             }
           	
           	              public void _select_patient_test(String rowNum,  String expected_text) throws Exception {
           	            	  
           	                                     String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                                test = extent.createTest(method_name, "verify to click patient record.");
                                                test.log(Status.INFO, "Test Starting.") ;
                                                test.assignCategory("FUN");
                                                
                                             
                                                 WebElement  exp_record = driver.findElement(By.xpath("//va-table[@table-title='Select the Patient Below']/tbody/tr["+rowNum+"]/td[1]"));
                                                 WebElement  select_patient_button = driver.findElement(By.xpath("//va-table[@table-title='Select the Patient Below']/tbody/tr["+rowNum+"]/td[4]/button"));
                                                // String expected_text = "SPERIER,DARWIN CLYDE";
                                                 Thread.sleep(3000);
                                                 String actual_text = exp_record.getText();
                                                 Thread.sleep(2000);
                                             	 test.log(Status.PASS, "Actual output # "+actual_text);
                                                 Boolean  display_status  =  exp_record.isDisplayed();
                                           
                                               
                                               
                                                 if (display_status) {
                                                	 Assert.assertEquals(actual_text, expected_text);
        								               test.log(Status.PASS,"select patient record  displayed."); 
                                                 } else 
        								              test.log(Status.FAIL, "select patient field not display.");
                                                 
                                                 highLight_element(driver, exp_record);
                                                test.log(Status.INFO, " expected column highlighted.");
                                                 Thread.sleep(3000);
                                                     
                                                		     if (select_patient_button.isDisplayed()) {
                                                		    	 
                                                		    	 test.log(Status.PASS, "select patient column displayed.");
                                                		       }else {
                                                            	 test.log(Status.FAIL, "select patient not displayed.");
                                                             }
                                                		     if (select_patient_button.isEnabled()) {
                                                		    	 test.log(Status.PASS, "select patient column enabled.");
                                                		    	 highLight_element(driver, select_patient_button);
                                                		    	    Thread.sleep(2000);
                                                		         select_patient_button.click();
                                                		         test.log(Status.PASS, "select patient button has been clicked..");
                                                		         
                                                		     }else {
                                                            	 test.log(Status.FAIL, "field was not enabled..");
                                                             }
                                                	     
                                                	 
                                          
                   
		                                      test.log(Status.PASS, "select patient test passed.") ;
                                             test.log(Status.INFO, "test ended.");
           	              }
           	              
           	              


        }

