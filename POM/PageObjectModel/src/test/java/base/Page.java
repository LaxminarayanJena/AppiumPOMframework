package base;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Page {
	
	
	public static WebDriver driver;
	public static TopNavigation topNav;
	public static String title;
	
	
	
	/*
	 * Firefox
	 * title = getTitle
	 * driver.quit
	 * 
	 * Internet
	 * title
	 * 
	 * 
	 */
	
	public Page(){
		
		if(driver==null){
			
			ChromeOptions options = new ChromeOptions();
	        Map<String, Object> prefs = new HashMap<String, Object>();
	        prefs.put("profile.default_content_setting_values.notifications", 2);
	        options.setExperimentalOption("prefs", prefs);
	        options.addArguments("--start-maximized");
	        options.addArguments("disable-popup-blocking");	
	        options.addArguments("--disable-extensions");
			
			
		driver = new ChromeDriver(options);
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		topNav = new TopNavigation();
		
		}
		
	}

}
