package gov.vas_testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import gov.vas.testData.InputData;

public class TC008_FS_single_patient_ssn  extends PatientFullNameSearchTests {
                    
	                @SuppressWarnings("deprecation")
	                @Test  (priority = 13)
					public void verify_single_patient_search_fs() throws Exception {
	                	                   
	                	                TC008_FS_single_patient_ssn  full_search  =  new TC008_FS_single_patient_ssn();
	                	                EnterPatient_FullSearch_Info  patient_output_info  = new EnterPatient_FullSearch_Info();
	                	                InputData  input  =  new InputData();
	                	               
	                	                 full_search._search_result_page_header_test23(search_result_page, "Patient Full Search");
	                	                 full_search._set_pat_full_name_test_13(input.fsName.strip()) ;
 	                                    Thread.sleep(2000);
 	                                     full_search._set_patient_ssn_test_15(input.fsSSN.strip());
 	                                     Thread.sleep(2000);
 	                                     full_search._click_search_button_test_16();
 	                                    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
 	                                     Thread.sleep(3000);
 	                                      
 	                                  //output result validation
                  	                 
               	                          patient_output_info.page_up_actions();
               	                          full_search._search_result_page_header_test23(search_result_page, "Patient Full Search");
               	                          full_search._search_result_page_test_17();
               	                          patient_output_info._validate_select_patient_data(patient_output_info.select_patient_name, "REAMES,TRISHA MARIE");
               	                          patient_output_info._validate_select_patient_data(patient_output_info.select_patient_dob, "01/29/1980");
               	                          patient_output_info._validate_select_patient_data(patient_output_info.select_patient_ssn, "367-07-1055");
               	                    
                                         Thread.sleep(2000);
                                          full_search._click_logout_test_22();
                                          full_search.tear_down();
 	                                   
	                   }
}
