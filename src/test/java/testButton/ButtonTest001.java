package testButton;

import org.letcode.Base.letCodeBase;
import org.letcode.pages.LoginPage;
import org.testng.Assert;

public class ButtonTest001 extends letCodeBase  {

	LoginPage lp = new LoginPage(driver);
	boolean usernamelabel = lp.getUsernameLabel();
	Assert.assertEquals(usernamelabel, true);
	boolean passwordlabel = lp.getPasswordLabel();
	Assert.assertTrue(passwordlabel);	
	new LoginPage(driver).enterUserName(data[0]).enterUserPassword(data[1]).SignIn();
	System.out.println("hi");
	
}
