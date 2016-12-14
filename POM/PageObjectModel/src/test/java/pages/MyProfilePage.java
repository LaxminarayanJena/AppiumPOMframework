package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;

public class MyProfilePage extends Page {
	
	
	
	
	
	public void gotoFriends(String friendName){
		
		
		
	}
	
	
	public MyProfilePage uploadPhoto(){
		
		
		driver.findElement(By.xpath("//div/a/following-sibling::div/div/a[@role='button']")).click();
		driver.findElement(By.xpath("//*[starts-with(@id,'js')][@type='file']")).sendKeys("C:\\Users\\Selenium\\Desktop\\kronos.jpg");
		
		
		return this;
		
	}
	
	

}
