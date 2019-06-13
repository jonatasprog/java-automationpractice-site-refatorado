package testcases;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mongodb.client.model.geojson.Position;

import framework.datapools.CsvDatapool;
import framework.dataprovider.EmailDataProvider;
import framework.tools.Report;
import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.AddToCartTask;
import tasks.AddressTask;
import tasks.ConfirmOrderTask;
import tasks.HomeTask;
import tasks.InformationsTask;
import tasks.PaymentTask;
import tasks.ProceedToCheckoutTask;
import tasks.ShippingTask;
import tasks.SignInTask;
import tasks.SummaryTask;
import verificationpoints.AddressVerificationPoint;
import verificationpoints.OrderConfirmationVerificationPoint;
import verificationpoints.PaymentVerificationPoint;
import verificationpoints.SummaryVerificationPoint;

public class ComprarProdutoComSucessoTestCase {

	private String FILE_PATH_CONTATOS = System.getProperty("user.dir") + File.separator + "datapools" + File.separator
			+ "contatos.csv";
	public CsvDatapool datapoolContatos;
	private EmailDataProvider emailDataProviderInstance;

	private WebDriver driver;
	private HomeTask homeTaskInstance;
	private AddToCartTask addToCartTaskInstance;
	private ProceedToCheckoutTask proceedToCheckoutTaskInstance;
	private SummaryVerificationPoint summaryVerificationPointInstance;
	private SummaryTask summaryTaskInstance;
	private SignInTask signInTaskInstance;
	private InformationsTask informationsTaskInstance;
	private AddressTask addressTaskInstance;
	private AddressVerificationPoint addressVerificationPointInstance;
	private ShippingTask shippingTaskInstance;
	private PaymentVerificationPoint paymentVerificationPointInstance;
	private PaymentTask paymentTaskInstance;
	private ConfirmOrderTask confirmOrderTaskInstance;
	private OrderConfirmationVerificationPoint orderConfirmationVerificationPointInstance;

	@Before
	public void setUp() {
		Report.create("Desafio de Automacao", "Comprar Produto com Sucesso");

		WebDriverManager.firefoxdriver().setup();
		this.driver = new FirefoxDriver();
		this.driver.get("http://automationpractice.com/index.php");
		this.driver.manage().window().maximize();

		this.datapoolContatos = new CsvDatapool(FILE_PATH_CONTATOS);
		this.emailDataProviderInstance = new EmailDataProvider();

		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		this.homeTaskInstance = new HomeTask(driver);
		this.addToCartTaskInstance = new AddToCartTask(driver);
		this.proceedToCheckoutTaskInstance = new ProceedToCheckoutTask(driver);
		this.summaryVerificationPointInstance = new SummaryVerificationPoint(driver);
		this.summaryTaskInstance = new SummaryTask(driver);
		this.signInTaskInstance = new SignInTask(driver);
		this.informationsTaskInstance = new InformationsTask(driver);
		this.addressTaskInstance = new AddressTask(driver);
		this.addressVerificationPointInstance = new AddressVerificationPoint(driver);
		this.shippingTaskInstance = new ShippingTask(driver);
		this.paymentVerificationPointInstance = new PaymentVerificationPoint(driver);
		this.paymentTaskInstance = new PaymentTask(driver);
		this.confirmOrderTaskInstance = new ConfirmOrderTask(driver);
		this.orderConfirmationVerificationPointInstance = new OrderConfirmationVerificationPoint(driver);
		
	}

	@Test
	public void testComprarProdutoComSucesso() {

		Report.startTest("Comprar Produto com Sucesso");

		this.datapoolContatos.reset();

		while (this.datapoolContatos.hasNext()) {
			this.homeTaskInstance.selecionarProduto();
			this.addToCartTaskInstance.adicionarProdutoNoCarrinho();
			this.proceedToCheckoutTaskInstance.clicarBotaoProceedToCheckout();	
			this.summaryVerificationPointInstance.validarPresencaDoProdutoNoCarrinho();
			this.summaryTaskInstance.clicarBotaoProceedToCheckout();
			this.signInTaskInstance.criarConta(this.emailDataProviderInstance.gerarEmail());
			this.informationsTaskInstance.preencherFormularioERegistrar(
					this.datapoolContatos.getValue("firstName"),
					this.datapoolContatos.getValue("lastName"), this.datapoolContatos.getValue("password"),
					this.datapoolContatos.getValue("address"), this.datapoolContatos.getValue("city"),
					this.datapoolContatos.getValue("state"), this.datapoolContatos.getValue("zipCode"),
					this.datapoolContatos.getValue("country"), this.datapoolContatos.getValue("mobile"),
					this.datapoolContatos.getValue("alias"));
			this.addressVerificationPointInstance.validarEndereco();
			this.addressTaskInstance.clicarBotaoProceedToCheckout();
			this.shippingTaskInstance.aceitarTermsOfService();
			this.paymentVerificationPointInstance.validarValorTotalDaCompra();
			this.paymentTaskInstance.clicarLinkPaymentMethod();
			this.confirmOrderTaskInstance.clicarBotaoConfirmOrder();
			this.orderConfirmationVerificationPointInstance.validarPresencaDaMensagemOrderComplete();
			this.datapoolContatos.next();
		}
	}

	@After
	public void tearDown() {
		if (this.driver != null) {
			this.driver.quit();
		}

		Report.close();
	}
}
