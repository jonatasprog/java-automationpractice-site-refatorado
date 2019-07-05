package verificationpoints;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import framework.tools.Report;
import framework.tools.ScreenShot;
import framework.utils.PositionUtils;
import tasks.OrderConfirmationTask;

public class OrderConfirmationVerificationPoint {

	private OrderConfirmationTask orderConfirmationTaskInstance;
	private WebDriver driver;
	private PositionUtils position;
	
	public OrderConfirmationVerificationPoint(WebDriver driver) {
		this.orderConfirmationTaskInstance = new OrderConfirmationTask(driver);
		this.driver = driver;
		this.position = new PositionUtils();
	}

	public void validarPresencaDaMensagemOrderComplete() {
		position.scrollTela(driver);
		if ("Your order on My Store is complete."
				.equalsIgnoreCase(this.orderConfirmationTaskInstance.capturarMensagem())) {
			Report.log(Status.PASS, "Compra realizada com sucesso", ScreenShot.capture(this.driver));
		} else {
			Report.log(Status.FAIL, "Compra nao realizada", ScreenShot.capture(this.driver));
		}
	}

}
