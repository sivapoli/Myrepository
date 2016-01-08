package sample_Package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class YahooRegistrationTest {
	
	@Test(dataProvider="registerData")
	
	public void testRegister(String userName, String passWord, 
							 String Email, String City){
		//SElenium code
		//user name
		//password
		//email
		//city
		System.out.println(userName+"---"+passWord+"-----"+Email+"-----"+City);
		
	}
	
	@DataProvider
	
	public Object[][] registerData(){
		//rows-number of times test has to be repeated.
		
		//cols-Number of Parameters in data
		
		Object[][] data=new Object[3][4];
		
		//first row
		
		data[0][0]="user1";
		data[0][1]="Pssw1";
		data[0][2]="email1";
		data[0][3]="city1";
		
		//second row
		data[1][0]="user2";
		data[1][1]="Pssw2";
		data[1][2]="email2";
		data[1][3]="city2";
		
		//third row
		data[2][0]="user3";
		data[2][1]="Pssw3";
		data[2][2]="email3";
		data[2][3]="city3";
		
				
		return data;
		
		
	}

}
