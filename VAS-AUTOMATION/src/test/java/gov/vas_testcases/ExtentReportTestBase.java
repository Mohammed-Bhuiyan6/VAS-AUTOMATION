package gov.vas_testcases;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import genericMethods.GenDateTime;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportTestBase {
	
	     // Declare Global variables
	                public static WebDriver  driver ;
	                public static ExtentSparkReporter spark ;
	                public static ExtentReports extent ;
	                public static ExtentTest test  ;
	    
	                public static String  browser = "chrome";
                      //   public static String  browser = "edge";
                    public static   DesiredCapabilities  dc ;
                    
                  	/* 
                  	 * Logout 
                  	 */
                  	  By  logout_xpath = By.xpath("//div[@id='app']/header/div[2]/div/div[2]/div/button");
                  	  By  logoutTwo_xpath = By.xpath("//form[@runat='server']/button");
                    
	        
	        @BeforeTest
	         public void setup_extent_report() {
	            	    
	          	         GenDateTime  dt = new GenDateTime();
	          	         
	          	       spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/test-results/VAS-tests-reports/sprints-level-reports/vsr-6433/date time -"+dt.exDateTime()+"extReportSpark.html");
	          	     
	          	       spark.config().setDocumentTitle("VAS Automated Test Reports ");
	          	       spark.config().setReportName("VAS  Automated Regression Test Reports.");
	          	       spark.config().setTheme(Theme.STANDARD);
	          	     //  spark.config().setTheme(Theme.DARK);
	          	       
	          	       extent  = new ExtentReports();
	          	       extent.attachReporter(spark);
	          	       
	          	       
	          	      extent.setSystemInfo("Tests" , "VAS-Functional");
	          	      extent.setSystemInfo("Story" , "VSR-6433;sub-6434");
	          	      extent.setSystemInfo("sprint" , "FY2023_S25");
	          	      extent.setSystemInfo("Environment", "SQA");
	          	      extent.setSystemInfo("host name","local host");
	          	      extent.setSystemInfo("OS", "Windows 10");
	          	      extent.setSystemInfo("browser",  browser);
	          	      extent.setSystemInfo("automated test engineer", "mohammed");
	          	      
	          	     
	       }
	       
	  
	      @BeforeMethod
	       public void initialize_test() {
	    	         if (browser.equals ("chrome"))
	    	               WebDriverManager.chromedriver().setup();
	    	        else if (browser.equals("edge"))
			               WebDriverManager.edgedriver().setup();
	    	        else 
	    	        	System.out.println("WebDriverManager was not configured.");
			    
			    }
	      
	      @SuppressWarnings("deprecation")
		public void launch_browser() {
	    	           String method_name =  new Exception().getStackTrace()[0].getMethodName();
                       test = extent.createTest(method_name, "browser test.");
                      test.log(Status.INFO, "Test Starting.") ;
                      test.assignCategory("BVT");
                      
                      setup_browser();
                      test.log(Status.INFO, "setup "+browser+" browser");
	    	          test.log(Status.PASS, "opened "+browser+" browser");
	    	          test.log(Status.PASS, "vas url navigated.");
	    	         driver.manage().window().maximize();
	    	         test.log(Status.INFO, "maximized "+browser+" browser");
	    	         driver.manage().deleteAllCookies();
	    	         test.log(Status.INFO, "AllCookies deleted.");
	                 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	                 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	                 test.log(Status.INFO,    browser +"  browser  test ended.");
	                 
	      }
	
	      public void  setup_browser() {
	                       dc  =  new  DesiredCapabilities () ;
	                       
	                       if (browser.equals ("chrome")) {
		        		           dc.setAcceptInsecureCerts(true);
		        		           dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		        		           
		        		           ChromeOptions options = new ChromeOptions();
		        		           options.setExperimentalOption("excludeSwitches",  new String [] { "enable-automation" });
		   		                   options.merge(dc);
		   		                  driver =  new ChromeDriver(options);
		   		                  
		        	   }else if (browser.equals("edge")) {
		        		          dc.setAcceptInsecureCerts(true);
		        		          dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		        		                 
		        		          EdgeOptions options = new EdgeOptions();
		        		          options.setExperimentalOption("excludeSwitches",  new String [] { "enable-automation" });
		        		          options.merge(dc);
		        		          driver = new EdgeDriver(options);
		        	   }else {
		        		          System.out.println("Browser is not available");
		        	   }
		        	            driver.navigate().to("https://sqa.vsr.va.gov");
		    }
	      
	
	       @AfterMethod
	       public void  get_tests_result_status(ITestResult result) throws IOException {
	    	   if (result.getStatus() == ITestResult.FAILURE) {
	    		   test.log(Status.FAIL , " TEST CASE FAILED IS  "+ result.getName());
	    		   test.log(Status.FAIL , " TEST CASE FAILED IS " + result.getThrowable());
	    		
	    		   String  screenshotpath = ExtentReportTestBase.getScreenshot(driver , result.getName());
	    		   
                  test.addScreenCaptureFromPath(screenshotpath);
	    	   }
	    	   else if (result.getStatus() == ITestResult.SUCCESS) {
	    		         test.log(Status.PASS , " Test Case PASSED is " + result.getName());
	    		       //  test.log(Status.PASS , "Test Case PASSED is "  +  result.getTestName());
	    	   }
	    	   else if (result.getStatus() == ITestResult.SKIP) {
	    		         test.log(Status.SKIP , " Test Case SKIPPED is  " + result.getName());
	    	   }
				
			
				  }
				
		public void tear_down()	{
			            String method_name =  new Exception().getStackTrace()[0].getMethodName();
                       test = extent.createTest(method_name, "close browser.");
                       test.log(Status.INFO, "Test Starting.") ;
                       test.assignCategory("BVT");
		           	   try { 
			                  Thread.sleep(2000);
				              driver.quit(); 
				           } catch (InterruptedException e) {
					          e.printStackTrace(); 
					      }
			            test.log(Status.PASS, "browser closed.");
			            test.log(Status.INFO, "test ended.");
		}
	    	 
	       
	       
	       public static String getScreenshot( WebDriver  driver, String screenshotName) throws IOException {
              
               String  dateName = new SimpleDateFormat ("yyyyMMddhhmmss").format(new Date(0));
               TakesScreenshot  ts = (TakesScreenshot) driver ;
               File source = ts.getScreenshotAs(OutputType.FILE);

               String  destination = System.getProperty("user.dir") + "/Scrieenshots/" + screenshotName + dateName + ".png" ;
               File  finalDestination = new File (destination);
               FileUtils.copyFile(source ,  finalDestination);
               return destination ;
         }

	       public void  _perform_logout_test () throws Exception {
                             String method_name =  new Exception().getStackTrace()[0].getMethodName();
                            test = extent.createTest(method_name, "verify logout button.");
                            test.log(Status.INFO, "Test Starting.") ;
                            test.assignCategory("FUN");

                            WebElement  logout =  driver.findElement(logout_xpath );
                            Boolean  display_status  =  logout.isDisplayed();
                            Boolean   enable_status  =  logout.isEnabled() ;
         
                            if (display_status)
                               test.log(Status.PASS, "logout button displayed.");
                            else
                	          test.log(Status.FAIL, "logout  not display.");

                           if (enable_status)
                               test.log(Status.PASS, "logout field enabled.");
                           else
                               test.log(Status.FAIL, "logout field not enable.");
                            highLight_element(driver,logout)   ;
                            Thread.sleep(2000);
                            logout.click();
                            test.log(Status.PASS, "Clicked logout button.") ;
                   
                             WebElement  logout_two =  driver.findElement(logoutTwo_xpath );
                              if ((logout_two.isDisplayed()) && (logout_two.isEnabled())) {
                     	           test.log(Status.PASS, "2nd logout button displayed & enabled.");
                     	          highLight_element(driver,logout_two)   ;
                     	         Thread.sleep(2000);
                     	           logout_two.click();
                     	          test.log(Status.PASS, "2nd logout button has been clicked.");
                              }
                                test.log(Status.PASS, "logout test passed.") ;
                               test.log(Status.INFO, "test ended.");
                               
                    
                        }
	       
	       public void highLight_element (WebDriver driver, WebElement element){
	   	                 	JavascriptExecutor js = (JavascriptExecutor) driver;
	   		                js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid green;');", element);
	   	}

	       
	       
	       @AfterTest
	        public void end_test_report() {
	      	         test.log(Status.INFO, "Generate Reports Ended.");
	        	     extent.flush();
	        }
	    
}
