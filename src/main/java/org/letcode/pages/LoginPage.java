package org.letcode.pages;

import org.letcode.Base.letCodeBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;


public class LoginPage extends letCodeBase {

	public LoginPage (RemoteWebDriver driver) {
		this.driver = driver;
	}


	//locators
	public boolean getUsernameLabel(){
		return driver.findElement(By.xpath("//label[@for='username']")).isDisplayed();
	}
	public boolean getPasswordLabel(){
		return driver.findElement(By.xpath("//label[@for='username']")).isDisplayed();
	}

	/**
	 * @description - get user name and type in text field 
	 * @param user name - pass user to be log in
	 * @return 
	 */
	//get the data from user and type on the user name field
	public LoginPage enterUserName(String username){
		driver.findElement(By.xpath("//input[@type='text']"));		
		return this;
	}

	//get the data from user and type on the password field
	public LoginPage enterUserPassword(String password){
		driver.findElement(By.xpath("//input[@type='password']"));
		return this;
	}

	//click on to login button
	public page SignIn(){
		driver.findElement(By.xpath("//button[@id='submit']"));
		return new page();
	}

	//click on to forgot password 
	public forgotPass ClickOnForgotPassword(){
		//driver1.findElement(By.xpath("//button[@id='submit']"));
		System.out.println("Forgot button clicked");
		return new forgotPass();
	}

	/**
	 * @description - Function to login into the application
	 * @param user
	 * @param Pass
	 */
	public void login(String user, String Pass) {
		enterUserName(user);
		enterUserPassword(Pass);
		SignIn();

	}

}
