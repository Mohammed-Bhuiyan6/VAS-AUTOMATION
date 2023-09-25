package gov.vas.libraries;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser {
                    
	                 public void  setup_browser() {
	                	 
	                	             DesiredCapabilities  capabilities  =  new DesiredCapabilities();
	                	             capabilities.setBrowserName("Google Chrome.");
	                	             capabilities.setCapability("browser","chrome");
	                	             capabilities.setCapability("version","109.0.5414.75");
	                	             capabilities.setCapability("platform","Win 10");
	                	             capabilities.setCapability("build","ExtentReportGeneration");
	                	             capabilities.setCapability("name","ExtentReportGenerationTest");
	                	             capabilities.setCapability("System Type", "64 bit OS");
	                	             
	                 }
}
