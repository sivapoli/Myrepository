package sample_Package;

import org.testng.annotations.Test;

public class Sample_Test {
	
	@Test //AppTest is our Test case.
	
	public void AppTest(){
		
		System.out.println("Testing the Application");
		
	}
	
	@Test
	
	public void Login(){
		System.out.println("Logging with Credentials");
	}

}
