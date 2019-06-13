package verificationpoints;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import framework.tools.Report;
import framework.tools.ScreenShot;
import framework.utils.Position;
import tasks.OrderConfirmationTask;

public class OrderConfirmationVerificationPoint {

	private OrderConfirmationTask orderConfirmationTaskInstance;
	private WebDriver driver;
	private Position position;
	
	public OrderConfirmationVerificationPoint(WebDriver driver) {
		this.orderConfirmationTaskInstance = new OrderConfirmationTask(driver);
		this.driver = driver;
		this.position = new Position();
	}

	public void validarPresencaDaMensagemOrderComplete() {
		position.scrollTela(driver);
		if ("Your order on My Store is complete."
				.equalsIgnoreCase(this.orderConfirmationTaskInstance.capturarMensagem())) {
			Report.log(Status.PASS, "Compra realizada com sucesso", ScreenShot.capture(this.driver));
		} else {
			Report.log(Status.FAIL, "Compra não realizada", ScreenShot.capture(this.driver));
		}
	}

}
