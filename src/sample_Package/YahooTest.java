package sample_Package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooTest {
	
	
	@BeforeSuite  //once before executing all tests in all java files.
	public void InitializeSelenium(){
		System.out.println("Initializing the Selenium code");
		
		//Initializing Selenium Object
	}
	
	@AfterSuite
	
	public void shutdownSelenium(){
		System.out.println("Closing Selenium Object");
		
		//Closing the selenium Object(Destroyed WD object)
	}
	
	
   @BeforeTest    //Before Executing all the test cases and @Before Methods
  
	  public void DatabaseConnection() {
		  
		  System.out.println("Connecting to a Database");
		  
		  //Connection established a Database
	  }
  
  @AfterTest   //After Executing all the test cases and @Before Methods
  
  public void ExitDatabase(){
	  System.out.println("Close the Database Connection");
  }
	
  @BeforeMethod  //Before Executing Every @Test
	  public void OpenBrowser() {
		  
		  System.out.println("Opening a browser");
		  //Open a browser in this 
	  }
  
  @AfterMethod  //After Executing every @Test
  
  public void closeBrowser(){
	  System.out.println("Closing browser");
  }
	
	
  @Test
  public void TestRecieveMail() {
	  
	  //Selenium code
	  
	  System.out.println("Testing Receiving E-mail");
  }
  
  @Test
  public void TestSendMail() {
	  
	  //Selenium code
	  System.out.println("Testing Sending an E-mail");
  }
  
  

  
  

}
