package gov.vas.libraries;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import genericMethods.GenDateTime;
import genericMethods.GenerateRandom;

public class TestReport {
	
    public static ExtentSparkReporter spark ;
    public static ExtentReports extent;
    public static ExtentTest test;

    
    public void setup_ext_reports() {
 		 GenerateRandom  gr  = new GenerateRandom();
 	     GenDateTime  dt = new GenDateTime();
 	    String className = new Exception().getStackTrace()[0].getClassName();
 	     ExtentSparkReporter spark = new ExtentSparkReporter("extentReports/reports/"+className+"/date time -"
				  +dt.exDateTime()+"-id-"+gr.flRandom()+"ExtReportSpark.html");
 	    spark.config().setDocumentTitle("VAS Automated Test Reports .");
 	    spark.config().setReportName("VAS  Automated Regression Test Reports.");
 		spark.config().setTheme(Theme.STANDARD) ; 
 		spark.config().setTheme(Theme.DARK);
 			 
 			  extent  =  new ExtentReports();
 			  extent.attachReporter(spark);
 			  extent.setSystemInfo("Environment", "SQA");
    }
    
	 
	 public void  print_validated_test_name(String  testName) {
		   extent.createTest(testName);
		   
		   }
	 
	 public void  printTestDescription(String  testDesc) {
		 extent.createTest(testDesc);
       }
	 public ExtentTest  test (String testStep) {
		 ExtentTest  logger  = extent.createTest(testStep);
		 return logger;
	 }
     public void logStatus(Status status, String details) {
    	
    	 test.log(status, details);
	  }
     
     public void flushExtReport() {
    	 extent.flush();
     }
       
}
