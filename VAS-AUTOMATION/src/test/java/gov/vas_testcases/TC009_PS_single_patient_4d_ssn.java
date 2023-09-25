package gov.vas_testcases;

import org.testng.annotations.Test;

public class TC009_PS_single_patient_4d_ssn  extends  PartialSearchTests{
	        
                         @Test (priority = 13)
	                     public void  verify_single_patient_search_ps() throws Exception {
	                    	                 
	                    	                        PatientSearchTests  patient_search  =  new PatientSearchTests();
	                    	                        TC009_PS_single_patient_4d_ssn    partial_search  =  new TC009_PS_single_patient_4d_ssn();
          	                                        EnterPatient_FullSearch_Info  enter_patient_info  = new EnterPatient_FullSearch_Info();
          	                 
          	                                         patient_search._pat_search_mod_test_09();
          	                                         patient_search._search_page_test_10();
          	                                         partial_search._patient_partial_search_test_pps13();
          	                                         partial_search._patient_partial_search_page_test_pps14();
          	                                         Thread.sleep(1000);
          	                                         enter_patient_info._set_initial_lastName_test07("Z");
          	                                         Thread.sleep(2000);
          	                                         partial_search._patient_partial_search_last4_ssn15("4374");
          	                                         Thread.sleep(1000);
          	                                         partial_search._click_search_for_patient_test_16();
          	                                         Thread.sleep(1000);
          	                                        //  output  :    record validation
          		                	                 
          		                	                 enter_patient_info._validate_select_patient_data(page_header, "Patient Partial Search");
          		                	                 enter_patient_info._validate_select_patient_data(enter_patient_info.select_patient_name, "ZEINER,MICHEL RILEY");
          		                	                 Thread.sleep(1000);
          	                	                     enter_patient_info._validate_select_patient_data(enter_patient_info.select_patient_dob, "02/20/1968");
          	                	                     Thread.sleep(1000);
          	                	                     enter_patient_info._validate_select_patient_data(enter_patient_info.select_patient_ssn, "520-93-4374");
                                               
          	                	                 //Logout
          	                	                 
          	                	                   Thread.sleep(1000);
          	                	                   _perform_logout_test();
          	                	                   tear_down();
	                     }

}
