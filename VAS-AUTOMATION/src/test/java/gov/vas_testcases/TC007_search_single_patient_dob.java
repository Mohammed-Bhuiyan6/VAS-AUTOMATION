package gov.vas_testcases;

import org.testng.annotations.Test;

import gov.vas.testData.InputData;

public class TC007_search_single_patient_dob  extends  PatientFullNameSearchTests{
	
	                            @Test  (priority = 13)
	                            public void search_single_patient_data() throws Exception {
	                        	
	                        	                    TC007_search_single_patient_dob   full_search  = new TC007_search_single_patient_dob();
	                        	                    EnterPatient_FullSearch_Info  patient_output_info  = new EnterPatient_FullSearch_Info(); 
	                        	                    InputData  input  =  new InputData();
	                        	                 
	                        	                    full_search._set_pat_full_name_test_13(input.strFullName.strip());
	                        	                    full_search._set_patient_dob_test_14(input.dob.strip());  
	                        	                    full_search._click_search_button_test_16();
	                        	                    
	                        	                    //output result validation
	                        	                 
	                        	                    patient_output_info.page_up_actions();
	                        	                    full_search._search_result_page_header_test23(search_result_page, "Patient Full Search");
	                        	                    full_search._search_result_page_test_17();
	                        	                    patient_output_info._validate_select_patient_data(patient_output_info.select_patient_name, "LANGFIELD,BRET SCOTT");
	                        	                    patient_output_info._validate_select_patient_data(patient_output_info.select_patient_dob, "11/25/1961");
	                        	                    patient_output_info._validate_select_patient_data(patient_output_info.select_patient_ssn, "508-89-9047");
	                                                 
	                                               Thread.sleep(2000);
	  	                                            full_search._click_logout_test_22();
	                                               full_search.tear_down();
	                                           
	              }

}

