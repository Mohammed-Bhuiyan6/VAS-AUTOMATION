package gov.vas_testcases;

import org.testng.annotations.Test;

public class TC004_PS_select_patient_record2  extends  PartialSearchTests{
	
	                  @Test (priority = 13)
	                  public void  select_patient_record_test_one() throws Exception {
	                	  
	                	                 PatientSearchTests  patient_search  =  new PatientSearchTests();
	                	                 TC004_PS_select_patient_record2    partial_search  =  new TC004_PS_select_patient_record2();
	                	                 EnterPatient_FullSearch_Info  enter_patient_info  = new EnterPatient_FullSearch_Info();
	                	                 
	                	                 patient_search._pat_search_mod_test_09();
	                	                 patient_search._search_page_test_10();
	                	                 partial_search._patient_partial_search_test_pps13();
	                	                 partial_search._patient_partial_search_page_test_pps14();
	                	                 
	                	                 enter_patient_info._set_initial_lastName_test07("S");
	                	                 partial_search._patient_partial_search_last4_ssn15("5106");
	                	                 partial_search._click_search_for_patient_test_16();
	                	                // enter_patient_info.page_up_actions();
	                	              
	                	                 //  output  :    record validation
	                	                 
	                	                 enter_patient_info._validate_select_patient_data(page_header, "Patient Partial Search");
	                	                 partial_search._select_patient_test("2", "SPERIER,DARWIN CLYDE");   
	                	                 enter_patient_info._validate_select_patient_data(enter_patient_info.select_patient_name,  "SPERIER,DARWIN CLYDE");
	                	                 enter_patient_info._validate_select_patient_data(enter_patient_info.select_patient_dob, "04/25/1964");
	                	                 enter_patient_info._validate_select_patient_data(enter_patient_info.select_patient_ssn, "503-99-5106");
                                     
	                	                 //Logout
	                	                 
	                	                 Thread.sleep(1000);
	                	                 _perform_logout_test();
	                	                 tear_down();
	                	                 
	                	           
	                  }
	                  
	                 
	                

}
