package gov.vas_testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC003_patient_FS_open_record_ssn  extends PatientFullNameSearchTests{
	
	                   @SuppressWarnings("deprecation")
					   @Test  (priority = 13)
	                   public void patient_full_name_ssn_search() throws Exception {
	                	   
	                	                      TC003_patient_FS_open_record_ssn patient_full_search  =  new TC003_patient_FS_open_record_ssn();
	                	                      
	                	                      String  strFullName  = "NARIMATSU,ELENA DAWN" ;
	                	                    
	                	                      patient_full_search._set_pat_full_name_test_13(strFullName.strip()) ;
	                	                      Thread.sleep(2000);
	                	                      patient_full_search._set_patient_ssn_test_15("559368707");
	                	                      Thread.sleep(2000);
	                	                      patient_full_search._click_search_button_test_16();
	                	                      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
	                	                      Thread.sleep(3000);
	                	                   
	                	                      // oupput page validation
	                	                      
	                	                      Actions  actions  = new Actions(driver) ;
	                	                      actions.sendKeys(Keys.PAGE_UP).build().perform();
	                	                      patient_full_search._search_result_page_test_17();
	                	                      patient_full_search._search_result_full_name_test_18("NARIMATSU,ELENA DAWN");
	                	                      patient_full_search._search_result_ssn_test_19("559-36-8707");
	                	                     
	                	                      actions.sendKeys(Keys.PAGE_DOWN).build().perform();
	                	                      Thread.sleep(2000);
	                                          patient_full_search._select_username_item_test_20();
	                                          actions.sendKeys(Keys.PAGE_DOWN).build().perform();
	                                          Thread.sleep(2000);
	                                          patient_full_search._click_actions_col_test_21();
	                                          Thread.sleep(3000);
	                                          actions.sendKeys(Keys.PAGE_UP).build().perform();
	                                          actions.sendKeys(Keys.PAGE_UP).build().perform();
	                                          actions.sendKeys(Keys.PAGE_UP).build().perform();
	                                          actions.sendKeys(Keys.PAGE_UP).build().perform();
	                                          Thread.sleep(3000);
	                	                      patient_full_search._click_logout_test_22();
	                	                      patient_full_search.tear_down();
	                	                      
	                 }

}
