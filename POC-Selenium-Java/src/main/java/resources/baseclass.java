package resources;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializedriver() throws IOException {
		prop= new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\MY BOOK\\POC SELENIUM JAVA\\POC-Selenium-Java\\src\\main\\java\\resources\\dataproperties");
		prop.load(file);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\MY BOOK\\Downloads\\chromedriver_win32_Latestversion\\chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		else if(browserName.equals("firefox")) {
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	

}
