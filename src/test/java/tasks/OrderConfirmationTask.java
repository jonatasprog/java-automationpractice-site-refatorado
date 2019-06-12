package tasks;

import org.openqa.selenium.WebDriver;

import pageobjects.OrderConfirmationPageObject;

public class OrderConfirmationTask {

	private OrderConfirmationPageObject orderConfirmationPageObjectInstance;

	public OrderConfirmationTask(WebDriver driver) {
		this.orderConfirmationPageObjectInstance = new OrderConfirmationPageObject(driver);
	}

	public String capturarMensagem() {
		String mensagem = orderConfirmationPageObjectInstance.orderCompleteMessage().getText();
		return mensagem;
	}
}