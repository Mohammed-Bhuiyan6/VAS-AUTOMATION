package gov.vas_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import com.aventstack.extentreports.Status;

public class EnterPatient_FullSearch_Info  extends  ExtentReportTestBase{
                  
	                         By  enter_patient_info_page_header_xpath  = By.xpath("//div[@id='va-header-logo-menu']/em");
	                         By  enter_patient_info_button_xpath  = By.xpath("//div[@class='text-center']/button");
	                         By  enter_patient_info_full_search_xpath = By.xpath("//div[@class='modal-body']/div/button[1]");
	                         By  partial_search_xpath  = By.xpath("//div[@class='modal-body']/div/button[2]");
	                         By  enter_patient_infoPage_xpath  = By.xpath("//div[@class='modal-content']/div/h3[1]");
	                         By  ini_lastname_xpath = By.xpath("//input[@id='lastInitial']");
	                         By  last4ss_xpath  =  By.xpath("//input[@id='last4']");
	                         
	                         By  select_patient_row1_xpath  = By.xpath("//form[@id='SelectPatient']/table/tbody/tr[1]/td[4]/button");
	                         By  select_patient_row2_xpath  = By.xpath("//form[@id='SelectPatient']/table/tbody/tr[2]/td[4]/button");
	                    
	                         // output:  patient data validation
	                         
	                         By  select_patient_page  =  By.xpath("//div[@class='text-center modal-header']/h3[2]");
	                         By  select_patient_name  =  By.xpath("//div[@class='container']/div[2]/div");
	                         By  select_patient_dob = By.xpath("//div[@class='container']/div[4]/div");
	                         By  select_patient_ssn = By.xpath("//div[@class='container']/div[6]/div") ;
	                         
	                         
	                         //Logout
	                         
	                         By  logout_xpath =  By.xpath("//div[@id='app']/header/h1/div[2]/button") ;

	                         By  logout0_xpath  = By.xpath("//button[@aria-label='Logout']") ;
	                         
	                         
	                      
	                         
	                         
	                         
	                         
	                         
	                ////***************************************************************************************************         
	                         
	                         
	                         public void  enter_partial_search_input(String iniLastName, String intlast4ssn) throws Exception {
	                        	             _enter_patient_info_page_header_test05();
                                             _click_enter_patient_info_test06();
                                             _set_initial_lastName_test07(iniLastName);
                                            _set_last4ss_test08(intlast4ssn);
                                            
	                                 }
	                         
	                         
	                         
	                         
	                         
	                    //     @Test (priority = 2)
	                         public void  _enter_patient_info_page_header_test05() {
                       	                               String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                                      test = extent.createTest(method_name, "validate enter patient info page.");
                                                      test.log(Status.INFO, "Test Starting.") ;
                                                      test.assignCategory("FUN");
                                 
                                                     WebElement  page_header = driver.findElement(enter_patient_info_page_header_xpath);
                                 
                                                     if (page_header.isDisplayed())
                                                   	 test.log(Status.INFO, "enter pat info page displayed.");
                                 
                                                    String  actual_page_header = page_header.getText().trim() ;
                                                    test.log(Status.INFO, actual_page_header);
                                 
                                                   String  expected_page_header = "VA | VistA Audit Solution" ;
                                                   Assert.assertEquals(actual_page_header, expected_page_header);
                                                    test.log(Status.PASS, "enter patient  info  page validated.");
                                 
                                                  test.log(Status.PASS, " enter patient  info page passed.");
                                                  test.log(Status.INFO, "test ended.");
                                   }
	                         
	                         
	                     //    @Test (priority = 3)
	                         public void  _click_enter_patient_info_test06() throws Exception {
                                                String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                               test = extent.createTest(method_name, "enter patient info feature test");
                                               test.log(Status.INFO, "Test Starting.") ;
                                               test.assignCategory("FUN");

                                              WebElement  enter_patient_info_button =  driver.findElement(enter_patient_info_button_xpath);
                                              Boolean  display_status  =  enter_patient_info_button.isDisplayed();
                                              Boolean   enable_status  =  enter_patient_info_button.isEnabled() ;
                              
                                             if (display_status)
                                                  test.log(Status.PASS, "enter patient info button  displayed.");
                                            else
                   	                            test.log(Status.FAIL, "enter patient info button  not display.");

                                            if (enable_status)
                                                   test.log(Status.PASS, "enter patient info button enabled.");
                                            else
                                                  test.log(Status.FAIL, "enter patient info button not enable.");
                                            
                                            String  actual_text = enter_patient_info_button.getText().trim() ;
                                            test.log(Status.INFO, actual_text);
                         
                                           String  expected_text = "Enter Patient Info" ;
                                           Assert.assertEquals(actual_text, expected_text);
                                            test.log(Status.PASS, "enter patient  info  page validated.");
                                   
                                            enter_patient_info_button.click();
                                             Thread.sleep(5000);
                                            WebElement  partialSearch =  driver.findElement(partial_search_xpath);
                                            partialSearch.click();
                                            Thread.sleep(3000);
                                            WebElement pat_info_page = driver.findElement(enter_patient_infoPage_xpath);
                                            String act_text = pat_info_page.getText();
                                            Assert.assertEquals(act_text, "Enter Patient Information");
                                            test.log(Status.PASS, "page validation test passed.");
                                            test.log(Status.PASS, "Clicked Partial search button.") ;
                                            test.log(Status.PASS, "Clicked enter patient info button.") ;
                                            test.log(Status.PASS, "enter patient info feature test passed.") ;
                                            test.log(Status.INFO, "test ended.");
                                            
                                            
											
                                           
                                     
                                           
               }
	                       //  @Test (priority = 2)
	                         public void  _set_initial_lastName_test07(String iniLastName) {
	                        	 
	                        	               String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                              test = extent.createTest(method_name, "first initial of last name.");
                                              test.log(Status.INFO, "Test Starting.") ;
                                              test.assignCategory("FUN");
                                
                                              WebElement  initial_lastname =  driver.findElement(ini_lastname_xpath);
                                              Boolean  display_status  =  initial_lastname.isDisplayed();
                                              Boolean   enable_status  =  initial_lastname.isEnabled();
                                              	
												  if (display_status) 
													  test.log(Status.PASS,"initial last name  displayed."); 
												  else 
													  test.log(Status.FAIL, "initial last name not display.");
												  
												  if (enable_status) 
												         test.log(Status.PASS, "initial last name  enabled.");
												  else 
													   test.log(Status.FAIL, "initial last name  not enable.");
												  initial_lastname.clear();
												  initial_lastname.sendKeys(iniLastName);
										         test.log(Status.PASS, "initial last name test passed.") ;
                                                 test.log(Status.INFO, "test ended.");
                            
                        }
	                         
	                         public void  _set_last4ss_test08(String intlast4ssn) {
	                        	 
              	                            String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                           test = extent.createTest(method_name, "last 4 digits of ssn.");
                                           test.log(Status.INFO, "Test Starting.") ;
                                           test.assignCategory("FUN");
                  
                                           WebElement  last4ssn =  driver.findElement(last4ss_xpath);
                                           Boolean  display_status  =  last4ssn.isDisplayed();
                                          Boolean   enable_status  =  last4ssn.isEnabled();
                                
									       if (display_status) 
										         test.log(Status.PASS,"last4ssn field  displayed."); 
									       else 
										          test.log(Status.FAIL, "last4ssn field not display.");
									  
									      if (enable_status) 
									            test.log(Status.PASS, "last4ssn field  enabled.");
									      else 
										       test.log(Status.FAIL, "last4ssn field  not enable.");
								 
									      last4ssn.clear();
									      last4ssn.sendKeys(intlast4ssn);
							             test.log(Status.PASS, "last4ssn field test passed.") ;
                                         test.log(Status.INFO, "test ended.");
              
          }
	                         
	                         public void _select_patient_record2_test9() throws Exception {
	                        	                  
	                                       String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                           test = extent.createTest(method_name, "select patient record2 test.");
                                          test.log(Status.INFO, "Test Starting.") ;
                                          test.assignCategory("FUN");
        
                                         WebElement  select_patient =  driver.findElement(select_patient_row2_xpath);
                                         Boolean  display_status  =  select_patient.isDisplayed();
                                         Boolean   enable_status  =  select_patient.isEnabled();
                     
                                         if (display_status) 
								               test.log(Status.PASS,"select patient field  displayed."); 
							            else 
								              test.log(Status.FAIL, "select patient field not display.");
							  
							           if (enable_status) 
							                 test.log(Status.PASS, "select patient field  enabled.");
							           else 
								            test.log(Status.FAIL, "select patient field  not enable.");
							           highLight_element(driver, select_patient);
							           Thread.sleep(5000);
							           select_patient.click();
							          
							           test.log(Status.PASS, "select patient has been clicked.");
							           test.log(Status.PASS, "select patient test passed.") ;
	                                   test.log(Status.INFO, "test ended.");
	                         }
	                         
	                         
	                         public void _select_patient_record1_test9() throws Exception {
           	                  
                                           String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                          test = extent.createTest(method_name, "select patient record1 test.");
                                          test.log(Status.INFO, "Test Starting.") ;
                                         test.assignCategory("FUN");

                                        WebElement  select_patient =  driver.findElement(select_patient_row1_xpath);
                                        Boolean  display_status  =  select_patient.isDisplayed();
                                        Boolean   enable_status  =  select_patient.isEnabled();
           
                                        if (display_status) 
						                         test.log(Status.PASS,"select patient field  displayed."); 
					                   else 
						                       test.log(Status.FAIL, "select patient field not display.");
					  
					                  if (enable_status) 
					                          test.log(Status.PASS, "select patient field  enabled.");
					                  else 
						                     test.log(Status.FAIL, "select patient field  not enable.");
					                        highLight_element(driver, select_patient);
					                        Thread.sleep(3000);
					                        select_patient.click();
					                        Thread.sleep(5000);
					                        
					                        
					                    test.log(Status.PASS, "select patient has been clicked.");
					                   test.log(Status.PASS, "select patient test passed.") ;
                                       test.log(Status.INFO, "test ended.");
                   }
                     
	                         
	                         public void  _logout_test10 () {
	                                            String method_name =  new Exception().getStackTrace()[0].getMethodName();
	                                           test = extent.createTest(method_name, "Logout");
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
	                   
	                                           WebElement  logout_two =  driver.findElement(logout0_xpath );
	                                           if ((logout_two.isDisplayed()) && (logout_two.isEnabled())) {
	                     	                               test.log(Status.PASS, "2nd logout button displayed & enabled.");
	                     	                               logout_two.click();
	                     	                              test.log(Status.PASS, "2nd logout button has been clicked.");
	                              }
	                                                     test.log(Status.PASS, "logout test passed.") ;
	                                                    test.log(Status.INFO, "test ended.");
	                    
	                        }
	                         
	                         
	                         public void  _validate_select_patient_data(By strXPathLocator, String expected_data) {
                  	           
          	                                        String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                                   test = extent.createTest(method_name, "select patient record..");
                                                   test.log(Status.INFO, "Test Starting.") ;
                                                   test.assignCategory("FUN");
                                
                                                    WebElement  patient_data =  driver.findElement(strXPathLocator);
                                                    String actual_data = patient_data.getText();
                                                    
                                                     if (patient_data.isDisplayed()) {
                              	                            test.log(Status.PASS, "patient data field displayed.");
                              	                            highLight_element(driver, patient_data);
                              	                            Assert.assertEquals(actual_data, expected_data); 
                              	                            test.log(Status.PASS, "patient's info :  " + actual_data + "  has been  verified.");
                                                     }else {
                                	                        test.log(Status.FAIL, "patient data fields was not display.");
                                                      }
                              
                                                     test.log(Status.PASS, " patient info test passed.");
                                                     test.log(Status.INFO, "test ended.");
                                        }
	                         
	                         
	                  public void page_up_actions() throws Exception {
	                	                 Actions actions = new  Actions(driver); 
						                 Thread.sleep(1000);
						                 actions.sendKeys(Keys.PAGE_UP).build( ).perform();
						                 actions.sendKeys(Keys.PAGE_UP).build().perform();
						                 actions.sendKeys(Keys.PAGE_UP).build().perform();
						                 actions.sendKeys(Keys.PAGE_UP).build( ).perform();
						                actions.sendKeys(Keys.PAGE_UP).build().perform();
						                actions.sendKeys(Keys.PAGE_UP).build().perform();
						                Thread.sleep(2000); 
	                          }
		       
}
