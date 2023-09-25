package gov.vas.libraries;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenExtReportForMultipleTests {
      
	
		 
	ExtentSparkReporter spark;
	 
	    ExtentReports extent;
	    //helps to generate the logs in the test report.
	    ExtentTest test;
	 
	    @BeforeTest
	    public void startReport() {
	        // initialize the HtmlReporter
	    	   spark = new ExtentSparkReporter("extentReports/reports/ExtReportSpark.html");
				
	 
	        //initialize ExtentReports and attach the HtmlReporter
	        extent = new ExtentReports();
	        extent.attachReporter(spark);
	 
	 
	        //configuration items to change the look and feel
	        //add content, manage tests etc
	      
	        spark.config().setDocumentTitle("Simple Automation Report");
	        spark.config().setReportName("Test Report");
	
	        spark.config().setTheme(Theme.STANDARD);
	        spark.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	    }
	 
	    @Test
	    public void test_1() {
	    	
	    	   String methodName = new Exception().getStackTrace()[0].getMethodName();
		        String className = new Exception().getStackTrace()[0].getClassName();
		        
	        test = extent.createTest(className, " test    "+ methodName);
	        Assert.assertTrue(true);
	        test.log(Status.PASS, "test validation passed.");
	        test.log(Status.PASS, "test validation passed.");
	        test.log(Status.PASS, "test validation passed.");
	        test.log(Status.PASS, "test validation passed.");
	        test.log(Status.PASS, "test validation passed.");
	        
	     
	        System.out.println("Class Name = "+ className + "Method Name = "+ methodName);
	    }
	 
	 
	    @Test
	    public void test_2() {
	        test = extent.createTest("Test Case 2", "The test case 2 has failed");
	        Assert.assertTrue(false);
	        test.log(Status.FAIL, "validation test failed.");
	    }
	 
	    @Test
	    public void test_3() {
	        test = extent.createTest("Test Case 3", "The test case 3 has been skipped");
	        test.log(Status.SKIP, "Test got skipped.");
	        test.log(Status.SKIP, "Test got skipped.");
	        test.log(Status.SKIP, "Test got skipped.");
	        test.log(Status.SKIP, "Test got skipped.");
	        test.log(Status.SKIP, "Test got skipped.");
	        throw new SkipException("The test has been skipped");
	    }
	 
	    @AfterMethod
	    public void getResult(ITestResult result) {
	        if(result.getStatus() == ITestResult.FAILURE) {
	            test.log(Status.FAIL,result.getThrowable());
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS) {
	            test.log(Status.PASS, result.getTestName());
	          }
	        else {
	            test.log(Status.SKIP, result.getTestName());
	        }
	    }
	 
	    @AfterTest
	    public void tearDown() {
	        //to write or update test information to reporter
	        extent.flush();
	    }
	}


