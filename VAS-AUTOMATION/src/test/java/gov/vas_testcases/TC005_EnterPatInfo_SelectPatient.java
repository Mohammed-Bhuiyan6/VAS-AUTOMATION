package gov.vas_testcases;

import org.testng.annotations.Test;

public class TC005_EnterPatInfo_SelectPatient  extends  EnterPatient_FullSearch_Info{
	                
                              @Test (priority = 1)
	                          public void verify_select_patient_2ndRecord() throws Exception {
	                        	                               
	                        	                                HomeLoginPageTest  homeLogin  = new HomeLoginPageTest();
	                        	                                PartialSearchTests  partial_search = new PartialSearchTests();
	                        	                                TC005_EnterPatInfo_SelectPatient  select_record  =  new TC005_EnterPatInfo_SelectPatient();
	                        	                                
               	                                                homeLogin._verify_title_test_01();
               	                                                homeLogin._verify_logo_test_02();
               	                                                homeLogin._homepg_title_test_03();
               	                                                homeLogin._signin_button_test_04();
               	                                                
               	                                               select_record.enter_partial_search_input("S", "5106");
               	                                               partial_search._click_search_for_patient_test_16();
               	                                               Thread.sleep(4000);
               	                                               select_record._validate_select_patient_data(select_patient_page,"Select the Patient Below");
               	                                               select_record._select_patient_record2_test9();
               	                                               
               	                                                    //  output  :    record validation
               	                                               
               	                                               select_record._validate_select_patient_data(select_patient_name,  "SPERIER,DARWIN CLYDE");
               	                                               select_record._validate_select_patient_data(select_patient_dob, "04/25/1964");
               	                                               select_record._validate_select_patient_data(select_patient_ssn, "503-99-5106");
               	                                        
               	                                               //Logout
               	                                              page_up_actions();
               	                                              _logout_test10 ();
     	                                                      tear_down();
     	                                                      
     	                                        }

							
                              @Test (priority = 2)
                              public void  verify_select_patient_1stRecord() throws Exception {
                            	  
	                                                HomeLoginPageTest  homeLogin  = new HomeLoginPageTest();
	                                                PartialSearchTests  partial_search = new PartialSearchTests();
	                                                TC005_EnterPatInfo_SelectPatient  select_record  =  new TC005_EnterPatInfo_SelectPatient();
	                                
	                                                homeLogin._verify_title_test_01();
   	                                                homeLogin._verify_logo_test_02();
   	                                                homeLogin._homepg_title_test_03();
   	                                                homeLogin._signin_button_test_04();
                                     
                                                    select_record.enter_partial_search_input("S", "5106");
                                                    partial_search._click_search_for_patient_test_16();
                                                    Thread.sleep(4000);
                                                    select_record._validate_select_patient_data(select_patient_page,"Select the Patient Below");
                                                    select_record._select_patient_record1_test9();
                                 
                                                    //  output  :    record validation
                                   
                                                    select_record._validate_select_patient_data(select_patient_name,  "SLICER,WILEY KENNETH");
                                                    select_record._validate_select_patient_data(select_patient_dob, "03/17/1944");
                                                    select_record._validate_select_patient_data(select_patient_ssn, "524-57-5106");
                               
                                                    //Logout
                                      
                                                     page_up_actions();
                                                      _logout_test10 ();
                                                     tear_down();
                            


                                                }


                        }
