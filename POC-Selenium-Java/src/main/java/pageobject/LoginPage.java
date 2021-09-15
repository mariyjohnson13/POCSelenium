package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage{
	WebDriver driver;
	
	By username = By.xpath("//input[@id='user-name']");
	By Password = By.xpath("//input[@id='password']");
	By LoginButton = By.xpath("//input[@id='login-button']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public WebElement typeUserName() { 
		return driver.findElement(username);
	}
	public WebElement typePassword() {
		return driver.findElement(Password);
		
	}
	public WebElement clickonLoginButton() {
		return driver.findElement(LoginButton);
	}


}

