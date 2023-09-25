package gov.vas_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	              
	     public static WebDriver  driver  ;
	     
	             /*
	              *  WebDriverManager.chromedriver().setup();
                  *  WebDriverManager.firefoxdriver().setup();
                  *  WebDriverManager.edgedriver().setup(); 
	              */
	     
	     
	public static void main(String[] args) {
		
	      WebDriverManager.chromedriver().setup();
	      
	     // WebDriverManager.iedriver().setup();
	      
	   //   InternetExplorerOptions options = new InternetExplorerOptions();
	    //    driver = new InternetExplorerDriver(options);
	      
	            DesiredCapabilities  dc  =  new  DesiredCapabilities () ;
	            dc.setAcceptInsecureCerts(true);
	      
		        ChromeOptions options = new ChromeOptions();
		        options.merge(dc);
		        options.setExperimentalOption("excludeSwitches",  new String [] { "enable-automation" });
		        driver =  new ChromeDriver(options);
		     //   driver.get("https://www.amazon.com");
		       driver.get("https://www.google.com/");
		        driver.manage().window().maximize();
		        
		        WebElement   element = driver.findElement(By.xpath("//a[@aria-label='Gmail (opens a new tab)']"));
		        
		      System.out.println(  element.getTagName());
		      
		   
		    	  element.click();

		     
		    			    	  
		        
	    //	WebDriverManager.firefoxdriver().setup();
	    //	FirefoxOptions options = new FirefoxOptions();
		 //    options.addArguments("headless","disable-gpu", "--ignore-certificate-errors") ;
		//     options.setCapability (CapabilityType.BROWSER_NAME, true) ;
		 //    options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	      
	         // options.setExperimentalOption("excludeSwitches",  Arrays.asList ("enable-automation") );
		  
		
		
		   //  driver = new FirefoxDriver();
		     
		   //    driver.get("https://sqa.vsr.va.gov");
		     
		     
		     //driver.findElement(By.xpath("//div[contains(@class,'form-group')]/select")).click();
	}

}
