package gov.vas_testcases;

public class TC011_PS_multiple_patients_newSearch  extends  PartialSearchTests{
	
	                     
	                        public void  verify_multiple_patients_newSearch() throws Exception {
	                        	               
	                        	             PatientSearchTests  patient_search  =  new PatientSearchTests();
	                        	             TC011_PS_multiple_patients_newSearch    partial_search  =  new TC011_PS_multiple_patients_newSearch();
                                             EnterPatient_FullSearch_Info  enter_patient_info  = new EnterPatient_FullSearch_Info();
              
                                           patient_search._pat_search_mod_test_09();
                                           patient_search._search_page_test_10();
                                           partial_search._patient_partial_search_test_pps13();
                                           partial_search._patient_partial_search_page_test_pps14();
                                           Thread.sleep(1000);
                                           
                                           patient_new_search_input("G", "9997");
                                           
											/*
											 * enter_patient_info._set_initial_lastName_test07("G"); Thread.sleep(2000);
											 * partial_search._patient_partial_search_last4_ssn15("9997");
											 * Thread.sleep(1000);
											 */
                                           partial_search._click_search_for_patient_test_16();
                                           Thread.sleep(1000);
                                     //  output  :    record validation
	                	                 
	                	                  enter_patient_info._validate_select_patient_data(page_header, "Patient Partial Search");
	                	                  
	                	                  patient_new_search_output("GLAD,THURMAN WEBB", "03/09/1942", "016-33-9997");
	                	                  
											/*
											 * enter_patient_info._validate_select_patient_data(enter_patient_info.
											 * select_patient_name, "GLAD,THURMAN WEBB"); Thread.sleep(1000);
											 * enter_patient_info._validate_select_patient_data(enter_patient_info.
											 * select_patient_dob, "03/09/1942"); Thread.sleep(1000);
											 * enter_patient_info._validate_select_patient_data(enter_patient_info.
											 * select_patient_ssn, "016-33-9997");
											 */
	                        	               
	                        }
	                        
	                        
	                        public void patient_new_search_input(String intLastName, String last4dSsn) throws Exception {
	                        	           TC011_PS_multiple_patients_newSearch    partial_search  =  new TC011_PS_multiple_patients_newSearch();
                                           EnterPatient_FullSearch_Info  enter_patient_info  = new EnterPatient_FullSearch_Info();
    
	                        	          enter_patient_info._set_initial_lastName_test07(intLastName);
                                          Thread.sleep(2000);
                                          partial_search._patient_partial_search_last4_ssn15(last4dSsn);
                                          Thread.sleep(1000);
	                        }
	                        
	                        public void  patient_new_search_output(String name, String dob, String ssn) throws Exception {
	                        	
	                        	            EnterPatient_FullSearch_Info  enter_patient_info  = new EnterPatient_FullSearch_Info();
	                        	            enter_patient_info._validate_select_patient_data(enter_patient_info.select_patient_name, name);
		                	                Thread.sleep(1000);
	             	                        enter_patient_info._validate_select_patient_data(enter_patient_info.select_patient_dob, dob);
	             	                        Thread.sleep(1000);
	             	                        enter_patient_info._validate_select_patient_data(enter_patient_info.select_patient_ssn, ssn);
	             	                        
	             	                          
	                        }
	                        
	                        
}
