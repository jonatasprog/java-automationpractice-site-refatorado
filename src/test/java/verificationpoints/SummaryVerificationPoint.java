package verificationpoints;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import framework.tools.Report;
import framework.tools.ScreenShot;
import framework.utils.PositionUtils;
import tasks.HomeTask;
import tasks.SummaryTask;

public class SummaryVerificationPoint {

	private SummaryTask summaryTaskInstance;
	private HomeTask homeTaskInstance;
	private WebDriver driver;
	private PositionUtils position;

	public SummaryVerificationPoint(WebDriver driver) {
		this.summaryTaskInstance = new SummaryTask(driver);
		this.homeTaskInstance = new HomeTask(driver);
		this.driver = driver;
		this.position = new PositionUtils();
	}

	public void validarPresencaDoProdutoNoCarrinho() {
		position.scrollTela(driver);
		if (this.homeTaskInstance.capturarNomeDoProduto()
				.equalsIgnoreCase(this.summaryTaskInstance.capturarNomeDoProduto())) {
			Report.log(Status.PASS, "Produto adicionado no carrinho com sucesso", ScreenShot.capture(this.driver));
		} else {
			Report.log(Status.FAIL, "Erro na adicao do produto no carrinho", ScreenShot.capture(this.driver));
		}
	}
	
}
