package TestCases;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.io.IOException;
import pageobject.Loginpage;
import pageobject.AddtocartPage;
import resources.baseclass;

public class Logintestcase extends baseclass{
	@Test(dataProvider = "provideLogInData")
	public void LogintoApplication(String Username,String Password) throws IOException, Exception {
		driver = Initalizedriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		Loginpage login = new Loginpage(driver);
		login.typeUserName().sendKeys(Username);
		login.typePassword().sendKeys(Password);
		login.clickonLoginButton().click();
		login.validating();
		AddtocartPage cart=new AddtocartPage(driver);
		cart.ClickAddtoCartButton().click();
		cart.RemoveButton().isDisplayed();
		synchronized (driver) {
		driver.wait(4000);

		}
		 //driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(9000000, TimeUnit.SECONDS);
		driver.quit();


	}
	
	@DataProvider (name = "provideLogInData")
	public Object [] [] logInData ()
	{
	  Object [] [] data = new Object [2] [2];
	  
	  data [0] [0] = "standard_user";    data [0] [1] = "secret_sauce";
	  data [1] [0] = "performance_glitch_user";    data [1] [1] = "secret_sauce";  
	  
	  return data;
	}

}
