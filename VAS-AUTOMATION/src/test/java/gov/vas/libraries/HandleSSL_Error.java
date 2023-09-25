package gov.vas.libraries;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSSL_Error {

	           public static String  browser = "chrome";
	        //   public static String  browser = "edge";
	           public static WebDriver  driver ;
	           public static     DesiredCapabilities  dc ;
	           
	           public static void main(String[] args) {
		         
	        	            dc  =  new  DesiredCapabilities () ;
	        	   
	        	   if (browser.equals ("chrome")) {
	        		          WebDriverManager.chromedriver().setup();
	        		          dc.setAcceptInsecureCerts(true);
	        		          dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	        		        //  dc.setCapability(CapabilityType.PROXY, true);
	        		  
	        		          ChromeOptions options = new ChromeOptions();
	        		          options.setExperimentalOption("excludeSwitches",  new String [] { "enable-automation" });
	        		          options.setExperimentalOption("excludeSwitches",  Arrays.asList ("enable-automation") );
	   		                  options.merge(dc);
	   		                  driver =  new ChromeDriver(options);
	   		                  
	        	   }else if (browser.equals("edge")) {
	        		          WebDriverManager.edgedriver().setup();
	        		          dc.setAcceptInsecureCerts(true);
	        		          dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	        		        //  dc.setCapability(CapabilityType.PROXY, true);
	        		          
	        		          EdgeOptions options = new EdgeOptions();
	        		          options.setExperimentalOption("excludeSwitches",  new String [] { "enable-automation" });
	        		          options.setExperimentalOption("excludeSwitches",  Arrays.asList ("enable-automation") );
	        		          options.merge(dc);
	        		          driver = new EdgeDriver(options);
	        	   }else {
	        		          System.out.println("Browser is not available");
	        	   }
	        	   
	        	   driver.get("https://www.facebook.com");
	        	   

	}

}
