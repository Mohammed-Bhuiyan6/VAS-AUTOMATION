package gov.vas_testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class PatientFullNameSearchTests  extends PatientSearchTests{
                        
	                      By  full_name_search_xpath  = By.xpath("//div[@id='PatientSearch']/div/nav/ul/li[2]/a") ;
	                      By  full_search_page_xpath = By.xpath("//div[@id='PatientSearch']/div[2]/main/div[2]/h1") ;
	                      By  full_name_set_xpath  = By.xpath("//input[@id='name']");
	                      By  dob_set_xpath = By.xpath("//input[@id='dob']") ;
	                      By  ssn_set_xpath = By.xpath("//input[@id='ssn']");
	                      By  search_button_xpath = By.xpath("//button[@class='usa-button']");
	                      By  search_result_xpath = By.xpath("//div[@class='form-group']/div/h2");
	                      By  search_result_full_name_xpath = By.xpath("//div[@class='form-group']/div/div[2]/div");
	                      By  search_result_ssn_xpath  = By.xpath("//div[@class='form-group']/div/div[6]/div") ;
	                      
	                      By  search_result_page   =  By.xpath("//div[@id='PatientSearch']/div[2]/main/div[2]/h1");
	                      
	                      
	                      By  username_xpath = By.xpath("//div[@class='form-group']/select");
	                      By  username_option_xpath = By.xpath ("//div[contains(@class,'form-group')]/select/option[3]");
	                      By  filter_xpath = By.xpath("//input[@class='form-control']");
	                      By  actions_col_xpath = By.xpath("//table[@class='table table-striped']/tbody/tr[1]/td[5]/button/span") ;
	                      
	                      By  new_search_xpath = By.xpath("//*[@id='PatientSearch']/div[2]/main/div[2]/div[2]/span[1]/span[1]/button");
	                      
	                      
	                      
	                  	/* Logout 
	                  	 */
	                   
	                  	  By   logout_xpath = By.xpath("//div[@id='app']/header/div[2]/div/div[2]/div/button");
	                  	  By  logoutTwo_xpath = By.xpath("//form[@runat='server']/button");
	                      
	                      
	                      @Test (priority = 11)
	                      public void _pat_full_search_test_11() {
	                    	                 String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                             test = extent.createTest(method_name, "verify patient full name search feature.");
                                             test.log(Status.INFO, "Test Starting.") ;
                                             test.assignCategory("FUN");
                              
                                             WebElement  patient_full_search = driver.findElement(full_name_search_xpath);
                                             
                                             if (patient_full_search.isDisplayed()) 
                                            	 test.log(Status.PASS, "full name search displayed.");
                                             
                                             if (patient_full_search.isEnabled())
                                            	 test.log(Status.PASS, "full name search enabled.");
                                             
                                               patient_full_search.click();
                                               test.log(Status.PASS, "full name search has been clicked.");
                                               
                                               test.log(Status.PASS, " patient full name search test passed.");
                                               test.log(Status.INFO, "test ended.");
	                    	  
	                      }
	                      
	                      
	                      @Test (priority = 12)
	                      public void _full_search_page_test_12() {
	                               	         String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                             test = extent.createTest(method_name, "validate patient full search page.");
                                             test.log(Status.INFO, "Test Starting.") ;
                                             test.assignCategory("FUN");
                                             
                                             WebElement  full_search_page = driver.findElement(full_search_page_xpath);
                                             
                                             if (full_search_page.isDisplayed())
                                            	 test.log(Status.INFO, "full search page displayed.");
                                             
                                             String  actual_page_header = full_search_page.getText().trim() ;
                                             test.log(Status.INFO, actual_page_header);
                                             
                                             String  expected_page_header = "Patient Full Search" ;
                                             Assert.assertEquals(expected_page_header, expected_page_header);
                                             test.log(Status.PASS, "full search page validated.");
                                             
                                             test.log(Status.PASS, " patient full name search page passed.");
                                             test.log(Status.INFO, "test ended.");
                                             
	                      }
	                      
	                      
	                      public void  _set_pat_full_name_test_13(String fullName) {
	                    	           
	                    	                   String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                               test = extent.createTest(method_name, "enter patient full name.");
                                              test.log(Status.INFO, "Test Starting.") ;
                                              test.assignCategory("FUN");
                                              
                                              WebElement  full_name =  driver.findElement(full_name_set_xpath);
                                              
                                              if (full_name.isDisplayed())
                                            	  test.log(Status.INFO, "patient full name field displayed.");
                                              
                                              if (full_name.isEnabled())
                                            	  test.log(Status.INFO, "patient full name field enabled.");
                                              
                                              full_name.clear();
                                              full_name.sendKeys(fullName);
                                              test.log(Status.PASS, "patient full name entered.");
                                              
                                              test.log(Status.PASS, " patient full name test passed.");
                                              test.log(Status.INFO, "test ended.");
	                      }
	                      
	                      public void  _set_patient_dob_test_14(String dob) {
               	           
       	                                     String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                             test = extent.createTest(method_name, "enter patient date of birth.");
                                             test.log(Status.INFO, "Test Starting.") ;
                                            test.assignCategory("FUN");
                             
                                            WebElement  date_of_birth =  driver.findElement(dob_set_xpath);
                             
                                           if (date_of_birth.isDisplayed())
                                    	       test.log(Status.PASS , "patient date of birth field displayed.");
                                           else 
                                        	   test.log(Status.FAIL , "patient dob not displayed.");
                             
                                          if (date_of_birth.isEnabled())
                                  	            test.log(Status.PASS , "patient date of birth field enabled.");
                                          else 
                                        	    test.log(Status.FAIL , "dob field not enable.");
                             
                                         date_of_birth.clear();
                                         date_of_birth.sendKeys(dob);
                                         test.log(Status.PASS, "patient date of birth  entered.");
                             
                                         test.log(Status.PASS, " patient dob test passed.");
                                         test.log(Status.INFO, "test ended.");
                             }
	                      
	                      public void  _set_patient_ssn_test_15(String ssn) {
	               	           
                                           String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                          test = extent.createTest(method_name, "enter patient ssn.");
                                          test.log(Status.INFO, "Test Starting.") ;
                                          test.assignCategory("FUN");
              
                                           WebElement  ssn_field =  driver.findElement(ssn_set_xpath);
                                           Boolean  display_status  =  ssn_field.isDisplayed();
                                           Boolean   enable_status  =  ssn_field.isEnabled() ;
                                           if (display_status)
                     	                    test.log(Status.PASS , "patient ssn field displayed.");
                                           else
                                        	 test.log(Status.FAIL, "ssn field not display.");
              
                                           if (enable_status)
                   	                         test.log(Status.PASS , "patient ssn field enabled.");
                                           else
                                        	 test.log(Status.FAIL, "ssn field not enable.");
              
                                             ssn_field.clear();
                                            ssn_field.sendKeys(ssn);
                                           test.log(Status.PASS, "patient ssn  entered.");
              
                                           test.log(Status.PASS, " patient ssn test passed.");
                                           test.log(Status.INFO, "test ended.");
                           }
	                      
	               @SuppressWarnings("deprecation")
				public void  _click_search_button_test_16() {
	               	           
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
	               
	               public void  _search_result_page_test_17() {
	            	   
	            	                    String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                       test = extent.createTest(method_name, "verify search result page.");
                                       test.log(Status.INFO, "Test Starting.") ;
                                       test.assignCategory("FUN");

                                       WebElement  search_result =  driver.findElement(search_result_xpath );
                                       Boolean  display_status  =  search_result.isDisplayed();
                                       String actual_text = search_result.getText();
                      
                 
                                     if (display_status) {
                                    	 highLight_element(driver, search_result);
                                         test.log(Status.INFO, "patient search result page displayed.");
                                     }else {
                                    	test.log(Status.FAIL, "search result field not display.");
                                     }
                                           
                                        Assert.assertEquals(actual_text, "Patient");
                                       test.log(Status.PASS, "Search result page validation passed.") ;
                                       test.log(Status.INFO, "test ended.");
	               }
	               
	               public void  _search_result_full_name_test_18(String fullName) {
	            	   
	                                      String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                         test = extent.createTest(method_name, "verify full name in search result page.");
                                          test.log(Status.INFO, "Test Starting.") ;
                                          test.assignCategory("FUN");

                                          WebElement  search_result_name =  driver.findElement(search_result_full_name_xpath );
                                           Boolean  display_status  =  search_result_name.isDisplayed();
                                           String actual_text = search_result_name.getText();
     
                                           if (display_status) {
                                        	   highLight_element (driver, search_result_name);
                                               test.log(Status.INFO, "patient full name displayed in search result page .");
                                             }else {
                          	                  test.log(Status.FAIL, "search result  field not display.");
                                             }
                                           Assert.assertEquals(actual_text, fullName);
                                           test.log(Status.PASS, "Search result page validation passed.") ;
                                           test.log(Status.INFO, "test ended.");
                                           
                    }
	               
	               public void  _search_result_ssn_test_19(String ssn) {
	            	   
                                         String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                         test = extent.createTest(method_name, "verify ssn in search result page.");
                                         test.log(Status.INFO, "Test Starting.") ;
                                         test.assignCategory("FUN");

                                         WebElement  search_result_ssn =  driver.findElement(search_result_ssn_xpath );
                                         Boolean  display_status  =  search_result_ssn.isDisplayed();
                                         String actual_text = search_result_ssn.getText();

                                        if (display_status) {
                                        	highLight_element (driver, search_result_ssn);
                                            test.log(Status.INFO, "patient ssn displayed in search result page .");
                                        }else {
       	                                   test.log(Status.FAIL, "search result  field not display.");
                                        }
                                        Assert.assertEquals(actual_text, ssn);
                                        test.log(Status.PASS, "Search result page validation passed.") ;
                                        test.log(Status.INFO, "test ended.");
                                        
                              }
	               
	            
	               public void  _click_logout_test_22() {
	            	                  String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                      test = extent.createTest(method_name, "verify logout button.");
                                      test.log(Status.INFO, "Test Starting.") ;
                                      test.assignCategory("FUN");

                                      WebElement  logout =  driver.findElement(logout_xpath );
                                       Boolean  display_status  =  logout.isDisplayed();
                                       Boolean   enable_status  =  logout.isEnabled() ;
                                
                                       if (display_status)
                                             test.log(Status.PASS, "logout button displayed.");
                                        else
                                       	     test.log(Status.FAIL, "logout  not display.");

                                          if (enable_status)
                                                test.log(Status.PASS, "logout field enabled.");
                                           else
              	                                 test.log(Status.FAIL, "logout field not enable.");
                                                       
                                          logout.click();
                                          test.log(Status.PASS, "Clicked logout button.") ;
                                          
                                           WebElement  logout_two =  driver.findElement(logoutTwo_xpath );
                                            if ((logout_two.isDisplayed()) && (logout_two.isEnabled())) {
                                            	  test.log(Status.PASS, "2nd logout button displayed & enabled.");
                                            	  logout_two.click();
                                            	  test.log(Status.PASS, "2nd logout button has been clicked.");
                                            }
                                            test.log(Status.PASS, "logout test passed.") ;
                                            test.log(Status.INFO, "test ended.");
                                           
	               }
	               
	               public void  _select_username_item_test_20() {
	            	                      String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                          test = extent.createTest(method_name, " select item from dropdown list.");
                                          test.log(Status.INFO, "Test Starting.") ;
                                          test.assignCategory("FUN");
                                         
                                      
                                          WebElement  username =   driver.findElement(username_xpath);
                                     
                                           Boolean  display_status  =  username.isDisplayed();
                                          Boolean   enable_status  =  username.isEnabled() ;
                                  
                                          if (display_status)
                                                  test.log(Status.PASS, "username drop down displayed.");
                                          else
                        	                     test.log(Status.FAIL, "username drop down  not display.");

                                           if (enable_status)
                                                test.log(Status.PASS, "username drop down enabled.");
                                          else
	                                            test.log(Status.FAIL, "username drop down not enable.");
                                        
                                           username.sendKeys("HARRIS,JAMES C-1034220614") ;
                                     
                                           test.log(Status.PASS, " username field clicked successfully.");
                                           driver.findElement(filter_xpath).click();
                                           test.log(Status.INFO, "filter search field present");       
                                           test.log(Status.PASS, "Item has been selected from dropdown list.") ;
                                           test.log(Status.PASS, "User name test passed.") ;
                                          test.log(Status.INFO, "test ended.");
                                         
                            
                              }
	               
	               public void  _click_actions_col_test_21() {
 	                                  String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                      test = extent.createTest(method_name, "verify meta data.");
                                      test.log(Status.INFO, "Test Starting.") ;
                                      test.assignCategory("FUN");

                                      WebElement  actions_button =  driver.findElement(actions_col_xpath );
                                      Boolean  display_status  =  actions_button.isDisplayed();
                                      Boolean   enable_status  =  actions_button.isEnabled() ;
                                   
                                     if (display_status)
                                           test.log(Status.PASS, "actions column  displayed.");
                                     else
                        	               test.log(Status.FAIL, "actions column  not display.");

                                    if (enable_status)
                                            test.log(Status.PASS, "actions column field enabled.");
                                    else
	                                        test.log(Status.FAIL, "actions column field not enable.");
                                	highLight_element (driver, actions_button);     
                                	
                                    actions_button.click();
                                          test.log(Status.PASS, "Clicked actions button.") ;
                           
                                   test.log(Status.PASS, "actions field test passed.") ;
                                   test.log(Status.INFO, "test ended.");
                    }
	               
	               public void  _search_result_page_header_test23(By strXPathLocator, String expected_text) {
	            	   
                                                String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                                test = extent.createTest(method_name, "Search Result Page.");
                                                test.log(Status.INFO, "Test Starting.") ;
                                                test.assignCategory("FUN");
   
                                               WebElement  output_page =  driver.findElement(strXPathLocator);
                                               String actual_text = output_page.getText();
                       
                                               if (output_page.isDisplayed()) {
 	                                                 test.log(Status.PASS, "search result page present.");
 	                                                 highLight_element(driver, output_page);
 	                                                 Assert.assertEquals(actual_text, expected_text); 
 	                                                 test.log(Status.PASS, "page header  :  " + actual_text + "  has been  verified.");
                                             }else {
   	                                             test.log(Status.FAIL, "search result page not present.");
                                             }
 
                                               test.log(Status.PASS, " search result page test passed.");
                                               test.log(Status.INFO, "test ended.");
                                               
                          }
	               
	               
	               public void  _click_new_search_test_24() {
                                    String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                    test = extent.createTest(method_name, "New Search feature Test.");
                                    test.log(Status.INFO, "Test Starting.") ;
                                    test.assignCategory("FUN");

                                     WebElement  newSearch_button =  driver.findElement(new_search_xpath );
                                      Boolean  display_status  =  newSearch_button.isDisplayed();
                                      Boolean   enable_status  =  newSearch_button.isEnabled() ;
                    
                                      if (display_status) {
                                    	  test.log(Status.PASS, "New Search  displayed.");
                                      }else {
                                    	  test.log(Status.FAIL, "New Search  not display.");
                                      }
         	                                

                                      if (enable_status) {
                                    	  test.log(Status.PASS, "New Search field enabled.");
                                      }else{
                                    	  test.log(Status.FAIL, "New Search not enable.");
                                      }
                                           
                                      
                 	                
                 	                        highLight_element (driver, newSearch_button);     
                 	                       newSearch_button.click();
                 	                   
                                         
                                         test.log(Status.PASS, "Clicked New Search button.") ;
                                         test.log(Status.PASS, "New Search field test passed.") ;
                                         test.log(Status.INFO, "test ended.");
                           }

    
          }
