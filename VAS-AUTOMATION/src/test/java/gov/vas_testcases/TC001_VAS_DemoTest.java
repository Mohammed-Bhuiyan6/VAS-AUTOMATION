package gov.vas_testcases;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import gov.vas.libraries.TestReport;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TC001_VAS_DemoTest  {
   
	public static WebDriver  driver;
	
	//Home
 private static   By  homePageHeader = By.xpath("//*[@id='bs4-upper-white-text']");
	
//	@FindBy(how=How.XPATH, using ="//*[@id='bs4-upper-white-text']" )  public WebElement   pgHeader;
	
	private static  By  viewSignin  =  By.xpath("//div[@id='bs4-piv-lower']/a");
	
	//Login
	private static  By  signinWinAuth = By.xpath("//button[@id='other-sign-in-modal-iwa-logon-btn']");
	private static  By  loginPageHeader = By.xpath("//*[@id='va-header-logo-menu']/em");
	
 
	
	private static  By  patientInfo = By.xpath("//div[@class='text-center']/button");
	private static  By  partialSearch  = By.xpath("//div[@class='modal-body']/div/button[2]");
	private static  By  lastIniName = By.xpath("//input[@id='lastInitial']");
	private static  By  last4Ssn = By.xpath("//input[@id='last4']");
	private static  By  search  = By.xpath("//button[@class='usa-button']");
	
	/* Logout 
	 */
	
	private static  By  logout  =  By.xpath("//div[@id='app']/header/h1/div[2]/button");
	private static  By  logoutTwo = By.xpath("(//*[@type='button'])[position()=1]");
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, Exception {
		
		/*
		 * GenerateRandom gr = new GenerateRandom(); GenDateTime dt = new GenDateTime();
		 * ExtentReports extent = new ExtentReports(); ExtentTest extentTest =
		 * extent.createTest("VSR page validation Demo Test.");
		 * extent.createTest("TestCase ID =  TC001_VSR_DemoTest_");
		 * 
		 * ExtentSparkReporter spark = new
		 * ExtentSparkReporter("extentReports/reports/TC001_VSR_DemoTest/date time -"
		 * +dt.exDateTime()+"-id-"+gr.flRandom()+"ExtReportSpark.html");
		 * 
		 * extent.attachReporter(spark);
		 */
	 	
		
		TestReport  report = new TestReport();
		report.setup_ext_reports();
	
		
		  ExtentTest logReport = report.test("validate home page. ");
		  logReport.log(Status.PASS, "tested");
		 
	//	report.printTestCaseName("vas page validation Demo Test");
	//	report.printTestDescription("validate vas login page.");
		
		
	 	WebDriverManager.chromedriver().setup();
	//    extentTest.log(Status.INFO, "webdriver manager setup");
	 	report.logStatus(Status.INFO,"webdriver manager setup");
		
	    driver = new ChromeDriver();
	
		//extentTest.log(Status.INFO, "start automated test");
	    
	report.logStatus(Status.INFO, "Start Test.");
	    driver.get("https://sqa.vsr.va.gov");
	    
        driver.manage().window().maximize();
      //  extentTest.log(Status.INFO, "chrome browser maximized");
       
        report.logStatus(Status.INFO, "browser maximized.");
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(10,  TimeUnit.SECONDS);
	    System.out.println(driver.getTitle());
	    
	  //  extentTest.log(Status.PASS, "browse opened");
	    report.logStatus(Status.INFO, "browser opened.");
	 //   extentTest.log(Status.PASS, driver.getTitle());
	    report.logStatus(Status.PASS, driver.getTitle());
	    
	    WebElement   homePage = driver.findElement(homePageHeader);
	    
	    if (homePage.isDisplayed())
	    	//extentTest.log(Status.INFO, homePage.getText());
	    	report.logStatus(Status.PASS, homePage.getText());
	    
	    
        if (homePage.getText().equals("VA SINGLE SIGN-ON")){
  		  System.out.println("This is VAS Home Page. ");
  		 // extentTest.log(Status.PASS, "Home Page validation Test passed.");
  		  report.logStatus(Status.PASS, "Home Page validation Test passed.");
  	  }else {
  		  System.out.println("This is not VAS Home Page.");
  		  //extentTest.log(Status.FAIL, "Home Page validation Test Failed.");
  		  report.logStatus(Status.FAIL,"Home Page validation Test Failed");
  	  }
        	
	   driver.findElement(viewSignin).click();
//	   extentTest.log(Status.PASS, "Button Clicked.");
	   report.logStatus(Status.PASS, "Button Clicked.");
	   report.printTestDescription("validate vas login page.");
	   Thread.sleep(3000);
	   driver.findElement(signinWinAuth).click();
	   driver.manage().timeouts().pageLoadTimeout(40,  TimeUnit.SECONDS);
	  // extentTest.log(Status.PASS, "Element Clicked.");
	   report.logStatus(Status.PASS, "Element Clicked.");
	   
	//   driver.manage().timeouts().pageLoadTimeout(10,  TimeUnit.SECONDS);
	   
	   WebElement   element  =  driver.findElement(loginPageHeader);
		 // extentTest.log(Status.INFO, "Logo visible.");
	   report.logStatus(Status.PASS, "Logo visible.");
	   
		  String  actualPageTitle =   element.getText();
		  String  expectedPageTitle = "VA | VistA Audit Solution";
		  System.out.println("Login page Logo : "+actualPageTitle);
		   
		  if(actualPageTitle.equals(expectedPageTitle)) {
			//extentTest.log(Status.PASS, "LogoTest passed.");
			  report.logStatus(Status.PASS, "LogoTest passed.");
			  
		  }else {
			//extentTest.log(Status.FAIL, "Logo Test Failed.");
			  report.logStatus(Status.FAIL, "Logo Test Failed.");
			  
		  } 
	   
		  report.print_validated_test_name("vas page validation Demo Test");
	   
	  WebElement  loginPage =  driver.findElement(logout);
	  if (loginPage.isDisplayed())
	    //	extentTest.log(Status.INFO, loginPage.getText());
		  report.logStatus(Status.PASS, loginPage.getText());
	    
      if (loginPage.getText().equals("Logout")){
		  //extentTest.log(Status.PASS, "Login Successed.");
		  report.logStatus(Status.PASS, "Login Successed.");
		  System.out.println("Login Successed.");
	  }else {
		//extentTest.log(Status.FAIL, "Loggedin Failed.");
		  report.logStatus(Status.FAIL, "Login Failed.");
	  }
	   
	   
	  driver.findElement(patientInfo).click();
	  driver.findElement(partialSearch).click();
	  driver.findElement(lastIniName).clear();
	  Thread.sleep(1000);
	  driver.findElement(lastIniName).sendKeys("B");
	  Thread.sleep(1000);
	  driver.findElement(last4Ssn).clear();
	  Thread.sleep(1000);
	  driver.findElement(last4Ssn).sendKeys("1926");
	  Thread.sleep(2000);
	  driver.findElement(search).click();
	  Thread.sleep(3000);
		
	//to perform Scroll on application using Selenium
	
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,-01)");
	 // js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	 
	
		/*
		 * Actions a = new Actions(driver);
		 *  a.sendKeys(Keys.PAGE_UP).build().perform();
		 */
		  driver.findElement(logout).click(); 
		  Thread.sleep(3000);
		  driver.findElement(logoutTwo).click();
	//	  extentTest.log(Status.PASS, "Test Passed.");
		  report.logStatus(Status.PASS, "Test Passed.");
		  //extentTest.log(Status.INFO,"Test End.");
		  report.logStatus(Status.PASS, "Test End");
		 
			
			/*
			 * Thread.sleep(5000);
			 * 
			 * driver.close(); // driver.quit(); System.out.println("browser closed. ");
			 */
		//  extentTest.log(Status.PASS,"Browser Closed Passed.");	 
	  
		//  extent.flush();
		  report.flushExtReport();
	
	
	   }
}

