package gov.vas.libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import gov.vas.testData.URL;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase  extends URL {
	
	/*
	 * public static ExtentSparkReporter spark ; public static ExtentReports extent;
	 * public static ExtentTest test;
	 */
	      public   WebDriver driver  = null ;

	     
	    @SuppressWarnings("deprecation")
	   @BeforeSuite
		public  void  setup_tests() {
	    	       
			/*
			 *chrome 
			 * WebDriverManager.chromedriver().setup(); 
			 * driver = new ChromeDriver();
			 */
	    	
	    	EdgeOptions options = new EdgeOptions();
			WebDriverManager.edgedriver().setup();
			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		    driver = new EdgeDriver(options);
	    	         
	        driver.get( super.PAGE_URL);
	    	driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    	           
	    	           String  expected_url =  super.PAGE_URL;
	     	           String  actual_url = driver.getCurrentUrl();
	     	           
	     	        if( actual_url.equalsIgnoreCase(expected_url)) {
	     	     
	     	        	System.out.println("this is correct url.");
	     	        }
	     	        else
	     	        	System.out.println("this is not correct url.");
	     	        	
	     	            	  
	     	           String  actual_title = driver.getTitle();
	     	          System.out.println(actual_title);
	     	       
	    	           
	  }
	    
	 
	  @AfterSuite  
	    public void tear_down_tests() {
	    	              driver.quit();
	    	       
	    	           
	    	              
	    }

}
