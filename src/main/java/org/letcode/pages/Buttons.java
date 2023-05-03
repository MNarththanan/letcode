package org.letcode.pages;

import org.letcode.Base.letCodeBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;


public class Buttons extends letCodeBase {

	public Buttons (RemoteWebDriver driver) {
		this.driver = driver;
	}


	WebElement button1 = driver.findElement(By.xpath("//button[@id='home']"));							
	WebElement button2 = driver.findElement(By.xpath("//button[@class='button is-link is-outlined']")); 
	WebElement button3 = driver.findElement(By.xpath("//button[@id='isDisabled']"));							
	WebElement button4 = driver.findElement(By.xpath("//button[@id='property']"));								
	WebElement button5 = driver.findElement(By.xpath("//button[@title='Disabled button' and @id='isDisabled' and @class='button is-info']"));		
	WebElement button6 = driver.findElement(By.xpath("//button[@id='isDisabled']/div/h2"));		

	//locators
	public boolean getUsernameLabel(){
		return driver.findElement(By.xpath("//label[@for='username']")).isDisplayed();
	}
	public boolean getPasswordLabel(){
		return driver.findElement(By.xpath("//label[@for='username']")).isDisplayed();
	}
	
	//get the data from user and type on the password field
	public Buttons enterUserName(String password){
		driver.findElement(By.xpath("//input[@type='password']"));
		return this;
	}


	//get the data from user and type on the password field
	public Buttons enterUserPassword(String password){
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
