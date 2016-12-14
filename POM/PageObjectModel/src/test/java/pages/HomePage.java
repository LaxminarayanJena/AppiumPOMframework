package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import base.Page;

public class HomePage extends Page{
	
	
	
	public LandingPage doLogin(String username,String password) throws InterruptedException{
		

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
	//	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	
		return new LandingPage();
	
	}
	
	
	public void createAccount(String fName, String lName){
		
		
		
	}
	
	
	public void validateLinks(){
		
		
		
	}
	

}
