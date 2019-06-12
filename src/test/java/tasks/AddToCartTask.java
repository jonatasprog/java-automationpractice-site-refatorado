package tasks;

import org.openqa.selenium.WebDriver;

import pageobjects.AddToCartPageObject;

public class AddToCartTask {
	private AddToCartPageObject addToCartPageObjectInstance;

	public AddToCartTask(WebDriver driver) {
		this.addToCartPageObjectInstance = new AddToCartPageObject(driver);
	}

	public void adicionarProdutoNoCarrinho() {
		this.addToCartPageObjectInstance.addToCartButton().click();
	}

}
