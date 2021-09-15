package demosauce;

import org.testng.annotations.Test;
import resources.baseclass;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.LoginPage;


public class LoginTestCase extends baseclass {
	@Test
	public void navigationfrombase(String Username,String Password) throws IOException
	{
		driver=initializedriver();
		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
		LoginPage login = new LoginPage(driver);
		login.typeUserName().sendKeys("standard_user");
		login.typePassword().sendKeys("secret_sauce");
		login.clickonLoginButton().click();
		
	}
	
}
