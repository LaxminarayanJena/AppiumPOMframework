package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;

public class LandingPage extends Page {
	

	
	public void updateStatus(){
		
		
		
	}
	
	
	public MyProfilePage gotoProfile(){
		
		
		driver.findElement(By.xpath("//*[@id='pagelet_welcome_box']/ul[1]/li[1]/div/a")).click();
	
		return new MyProfilePage();
	}
	
	
	public void validatePages(){
		
		
		
	}

}
