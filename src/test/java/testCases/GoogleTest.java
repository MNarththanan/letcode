package testCases;

import org.letcode.Base.Browser;
import org.letcode.Base.Locators;
import org.letcode.Base.SeleniumBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends SeleniumBase  {
@Test
	void searchLetCode() throws InterruptedException {
		setUp(Browser.CHROME,"https://www.google.lk/");
		WebElement search = element(Locators.name,"q");
		typeAndEnter(search,"letcode with koushik ",Keys.ENTER);
		Thread.sleep(3000);
		quit();
		
	}
	
}
