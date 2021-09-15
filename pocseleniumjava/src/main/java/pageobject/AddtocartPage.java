package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtocartPage {
	WebDriver driver;
	By CartButton=By.xpath("//button[normalize-space()='Add to cart']");
	By Remove=By.xpath("//button[@id='remove-sauce-labs-backpack']");
	public AddtocartPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebElement RemoveButton() {
		return driver.findElement(Remove);
		
	}
	public WebElement ClickAddtoCartButton() {
		return driver.findElement(CartButton);
	}

}