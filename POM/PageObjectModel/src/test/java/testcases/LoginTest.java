package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LandingPage;

public class LoginTest {
	
	
	@Test
	public void doLogin() throws InterruptedException{
		
		HomePage home = new HomePage();
		LandingPage lp = home.doLogin("seleniumcoaching@gmail.com", "seleniumappium123");
	
		//Assert validate login is successful
		
	}
	
	//dataPRovider

}
