package tasks;

import org.openqa.selenium.WebDriver;

import pageobjects.HomePageObject;

public class HomeTask {
	private HomePageObject homePageObjectInstance;

	public HomeTask(WebDriver driver) {
		this.homePageObjectInstance = new HomePageObject(driver);
	}

	public void selecionarProduto() {
		this.homePageObjectInstance.productImage().click();
	}
	
	public String capturarNomeDoProduto() {
		String nomeDoProduto = this.homePageObjectInstance.productNameLabel().getText();
		return nomeDoProduto;
	}
	
}
