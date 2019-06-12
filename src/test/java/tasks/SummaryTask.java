package tasks;

import org.openqa.selenium.WebDriver;

import pageobjects.SummaryPageObject;

public class SummaryTask {
	private SummaryPageObject summaryPageObjectInstance;

	public SummaryTask(WebDriver driver) {
		this.summaryPageObjectInstance = new SummaryPageObject(driver);
	}

	public String capturarValorTotal() {
		String valorTotal = this.summaryPageObjectInstance.totalPriceSummaryLabel().getText();
		return valorTotal;
	}
	
	public String capturarNomeDoProduto() {
		String nomeDoProduto = this.summaryPageObjectInstance.productNameLabel().getText();
		return nomeDoProduto;
	}
	
	public void clicarBotaoProceedToCheckout() {
		this.summaryPageObjectInstance.proceedToCheckoutButton().click();
	}
	
}
