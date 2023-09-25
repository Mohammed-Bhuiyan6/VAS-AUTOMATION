package gov.vas_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class PatientSearchTests  extends  HomeLoginPageTest {
	
	
	                By  patient_search_module_xpath  = By.xpath("//ul[@class='site-header__nav-list']/li[2]/a") ;
	                By  patient_search_page_header_xpath = By.xpath("//div[@id='PatientSearch']/div[2]/main/div/h1") ;
	                
	                
	                
	                @Test (priority = 9)
	                 public void  _pat_search_mod_test_09() {
	                	
	                                      String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                          test = extent.createTest(method_name, "verify patient search module click.");
                                          test.log(Status.INFO, "Test Starting.") ;
                                          test.assignCategory("FUN");
                                          
                                          WebElement  patient_search_element  = driver.findElement(patient_search_module_xpath);
                                          
                                          if (patient_search_element.isDisplayed()) {
                                        	  test.log(Status.PASS, "patient search displayed.");
                                        	  test.log(Status.PASS, "status ="+patient_search_element.isDisplayed());
                                          }else {
                                        	  test.log(Status.FAIL, "patient search not present");
                                          }
                                          
                                          if (patient_search_element.isEnabled()) {
                                        	   test.log(Status.PASS, "patient search enabled.");
                                        	   test.log(Status.PASS, "status = "+ patient_search_element.isEnabled());
                                           }else {
                                        	   test.log(Status.FAIL, "patient search not enabled.");
                                           }
                                          
                                          String actual_text = patient_search_element.getText() ;
                                          String expected_text = "Patient Search" ;
                                          Assert.assertEquals(actual_text, expected_text);
                                          test.log(Status.PASS, "correct text that is  "+actual_text);
                                          
                                          patient_search_element.click();
                                          test.log(Status.PASS, "Patient Search has been clicked.");
                                          
                                          test.log(Status.PASS, " patient search test passed.");
                                          test.log(Status.INFO, "test ended.");
	                 }
	                 
	                 
	                @Test (priority = 10)
	                 public void _search_page_test_10() {
	                	                String method_name =  new Exception().getStackTrace()[0].getMethodName();
                                        test = extent.createTest(method_name, "validate patient search page.");
                                        test.log(Status.INFO, "Test Starting.") ;
                                        test.assignCategory("FUN");
                                        
                                        WebElement  search_page_element = driver.findElement(patient_search_page_header_xpath);
                                        String  actual_search_page_text = search_page_element.getText();
                                        String  expected_search_page_text = "Getting Started Patient Search" ;
                                        if (search_page_element.isDisplayed()) {
                                        	test.log(Status.INFO, "search page displayed.");
                                        	Assert.assertEquals(actual_search_page_text, expected_search_page_text);
                                        	test.log(Status.PASS, "Test passed");
                                        }else {
                                        	test.log(Status.FAIL, "Test Failed.");
                                        }
                                        test.log(Status.PASS, " patient search page tested.");
                                        test.log(Status.INFO, "test ended.");
                           }

}
