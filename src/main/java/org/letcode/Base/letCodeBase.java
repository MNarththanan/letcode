package org.letcode.Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import excelDataDriven.ReadExcel;

public class letCodeBase {
	
	String URL = "https://practicetestautomation.com/practice-test-login/";
	protected RemoteWebDriver driver = null;
	public String fileName = "";  

	@DataProvider(name = "data")
	public String[][] dataProvider() {
		String[][] exceldata =	ReadExcel.getExcelSheetData(fileName);
		return exceldata;
	}

	@BeforeMethod
	public void StartBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@AfterMethod
	public void DriverQuit(){
		driver.quit();
	}
}
