package gov.vas.libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownNoSelectCls {

              public static WebDriver  driver  ;
              public static  String  strURL =  "https://www.bstackdemo.com/" ;
              public static  String  browserStack_Url = "https://www.browserstack.com/" ;
    
	public static void main(String[] args) throws Exception {
	  
		                  String  arguments = "arguments[0].value='highestprice'" ;
		                  By  dropdown_xpath = By.xpath("//div[@class='sort']/select");
		                  By  developer_xpath = By.xpath("//span[@class='nav_item_name' and contains(text(), 'Developers')]");
		                  launch_browser_url(strURL) ;
		                  Thread.sleep(2000);
		                
		                  perform_dropdown_using_jse(dropdown_xpath , arguments);
		                  Thread.sleep(2000);
		                  select_item(dropdown_xpath, "lowestprice");
		                  Thread.sleep(2000);
		                  driver.quit();
		                  launch_browser_url(browserStack_Url) ;
		                  select_actions_item(developer_xpath);
	}
	
	    public static void  launch_browser_url(String URL) {
	    	
	    	            WebDriverManager.chromedriver().setup();
	                    DesiredCapabilities  dc  =  new  DesiredCapabilities () ;
	                    dc.setAcceptInsecureCerts(true);
	                    ChromeOptions options = new ChromeOptions();
		                options.merge(dc);
		                options.setExperimentalOption("excludeSwitches",  new String [] { "enable-automation" });
		                
		               driver =  new ChromeDriver(options);
		               driver.manage().window().maximize();  
		               driver.get(URL);
	    	
	    }
	    
	    public  static void  perform_dropdown_using_jse(By dropdown_xpath, String arguments) {
	    	              
	    	                WebElement dropdown = driver.findElement(dropdown_xpath);
	    	               JavascriptExecutor js = (JavascriptExecutor) driver;
                            js.executeScript( arguments , dropdown);
	    	                System.out.println("item  selected");
	    	     }	  
	    
	       public static void select_item(By dropdown_xpath, String valueLocator) {
	                      //      driver.findElement(By.xpath("//select")).sendKeys("lowestprice");
			
	    	                    driver.findElement(dropdown_xpath).sendKeys(valueLocator);
	    	                    System.out.println("item  has been selected.");
	                }
	       
	       public static void select_actions_item(By dropdown_xpath) {
	    	                   WebElement dropdown = driver.findElement(dropdown_xpath);
	    	                   Actions  actions = new Actions (driver) ;
	    	                   actions.moveToElement(dropdown).perform();
	    	                   System.out.println("developers dropdown list opened.");
	    	                   driver.findElement(By.xpath("//ul[@id='developers-menu-dropdown']/li[11]/a")).click();
	    	                   
	    	                   System.out.println("Event item has been clicked.");
	    	                   
	       }
							  
	}
