package framework.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Position {
	public void scrollTela(WebDriver driver) {		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("scroll(0, 400)");
	}
}