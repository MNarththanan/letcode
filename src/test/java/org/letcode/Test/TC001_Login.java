package org.letcode.Test;

import org.letcode.Base.letCodeBase;
import org.letcode.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_Login extends letCodeBase{
	
	@BeforeTest
	public void setData() {
		fileName = "TC001";
	}
		
	
	
	@Test(dataProvider = "data")	
	//String user name and password
	public void loginTest(String [] data) {		

		LoginPage lp = new LoginPage(driver);
		boolean usernamelabel = lp.getUsernameLabel();
		Assert.assertEquals(usernamelabel, true);
		boolean passwordlabel = lp.getPasswordLabel();
		Assert.assertTrue(passwordlabel);	
		new LoginPage(driver).enterUserName(data[0]).enterUserPassword(data[1]).SignIn();
		System.out.println("hi");
		
		
	}

}
