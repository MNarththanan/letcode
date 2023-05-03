package org.letcode.Test;

import org.letcode.Base.letCodeBase;
import org.letcode.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_Login extends letCodeBase{
	@Test(dataProvider = "data")
	public void loginTest(String [] data) {
		
		LoginPage lp = new LoginPage(driver);
		boolean usernamelabel = lp.getUsernameLabel();
		Assert.assertEquals(usernamelabel, true);
		boolean passwordlabel = lp.getPasswordLabel();
		Assert.assertTrue(passwordlabel);
		
		new LoginPage(driver).enterUserName(data[0]).enterUserPassword(data[1]).SignIn();
		
		
	}

}
