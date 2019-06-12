package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {

	private WebDriver driver;
	
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement productImage() {
		return this.driver.findElement(By.cssSelector("img[title='Faded Short Sleeve T-shirts']"));
	}
	
	public WebElement productNameLabel() {
		return this.driver.findElement(By.cssSelector("a[title='Faded Short Sleeve T-shirts']"));
	}
	
}
