package gov.vas_testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import gov.vas.testData.InputData;

public class TC010_FS_newUser_patient_search  extends  PatientFullNameSearchTests {
	
                @Test  (priority = 13)
				public void verify_newuser_patient_fs() throws Exception {
	            	           verify_patient_fs_without_newuser();
	            	           _click_new_search_test_24();
	                           verify_patient_fs_with_newuser();
	                           
	                           Thread.sleep(2000);
                               _click_logout_test_22();
                               tear_down();
                               
	               }
	               
	               
	               @SuppressWarnings("deprecation")
				public  void  verify_patient_fs_without_newuser() throws Exception {
	            	                   TC010_FS_newUser_patient_search  full_search  =  new TC010_FS_newUser_patient_search();
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
	               }
	               
	               @SuppressWarnings("deprecation")
					public  void  verify_patient_fs_with_newuser() throws Exception {
		            	                   TC010_FS_newUser_patient_search  full_search  =  new TC010_FS_newUser_patient_search();
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
		               }


}
