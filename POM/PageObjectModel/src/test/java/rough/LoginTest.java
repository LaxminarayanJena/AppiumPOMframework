package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.Page;
import pages.HomePage;
import pages.LandingPage;
import pages.MyProfilePage;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {

		
		HomePage home = new HomePage();
		LandingPage lp = home.doLogin("seleniumcoaching@gmail.com", "seleniumappium123");
		MyProfilePage mp = lp.gotoProfile();
		//mp.uploadPhoto();
		Page.topNav.logOut();
		
		
	//	new HomePage().doLogin("seleniumcoaching@gmail.com", "seleniumappium123").gotoProfile().uploadPhoto();
		//driver.manage.window.maximize();
		

	}

}
