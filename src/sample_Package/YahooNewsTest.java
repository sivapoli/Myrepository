package sample_Package;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooNewsTest {
	
	
	@BeforeTest
		public void InitializeTest(){
		System.out.println("Initializing Test");
		
		//throw new SkipException("Skippig this Test due to some reason");
	}
	
	
	@Test
		public void NewsTest(){
		System.out.println("Testing the News");
		
		//Having some Expected, Actual Values
		
		//Having links or text to validate and how to fail TC
		
		//Assert.assertEquals("Good", "GoodX");
		
		System.out.println("Before Assertion Error");
		
		try{
			
		
		Assert.assertTrue(6>11, "Error message");
		
		}catch(Throwable t){
			
			System.out.println("Caught the Error");
			
			//Need to write code to report the error in reports
		}
		Assert.assertFalse(1>9, "Error message");
		
		System.out.println("After Assertion Error");
		
	}

}
