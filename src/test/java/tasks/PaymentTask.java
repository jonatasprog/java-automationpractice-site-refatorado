package tasks;

import org.openqa.selenium.WebDriver;

import pageobjects.PaymentPageObject;

public class PaymentTask {
	private PaymentPageObject paymentPageObjectInstance;

	public PaymentTask(WebDriver driver) {
		this.paymentPageObjectInstance = new PaymentPageObject(driver);
	}

	public void clicarLinkPaymentMethod() {
		this.paymentPageObjectInstance.paymentMethodLink().click();
	}
	
	public String capturarValorTotal() {
		String valorTotal = this.paymentPageObjectInstance.totalPricePaymentLabel().getText();
		return valorTotal;
	}

	
}
