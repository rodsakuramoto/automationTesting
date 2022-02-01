package in.automationtesting.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import in.automationtesting.core.Base;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AutomationTesting extends Base{

	private static By campoMobile = By.id("menu-icon"); 
	private static By campoPesquisa = By.id("s"); 
	private static By campoProdutoBlouse = By.xpath("//*[@title='Blouse']");
	private static By idMensagemItem = By.xpath("//*[@id=\"content\"]/h1/em");
	private static By campoShop = By.id("menu-item-40"); 
	private static By campoHTML = By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[2]/a");
	private static By campoProdutoThinkingInHTML = By.xpath("//*[@title='Thinking in HTML']");
	private static By campoMyAccount = By.id("menu-item-50"); 
	private static By campoRegisterEmail = By.id("reg_email"); 
	private static By campoRegisterPassword = By.id("reg_password"); 
	private static By campoRegister = By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]");
	private static By campoAccountDetails = By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[5]/a");
	private static By campoFirstName = By.id("account_first_name"); 
	private static By campoLastName = By.id("account_last_name"); 
	private static By campoSaveChanges = By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/form/p[4]/input[3]");
	private static By idMensagemCadastro = By.xpath("//*[text()[contains(.,'Account details changed successfully.')]]");

	@Dado("que acesso a página home do site Automation Practice")
	public void queAcessoAPáginaHomeDoSiteAutomationPractice() {
		this.acessarEndereco("http://practice.automationtesting.in/");
	}

	@Quando("digito o nome do produto {string} no campo de pesquisa")
	public void digitoONomeDoProdutoNoCampoDePesquisa(String string) throws Exception  {
		Boolean elemento= this.elementoClicavel(campoMobile);
		if(elemento==true) {
			try {
				this.clicar(campoMobile);	
				this.clicar(campoPesquisa);
				this.escrever(campoPesquisa, string);
			}catch(Exception i) {
				throw new Exception("é a versao mobile");}
		}else{
			if(elemento==false) {
				try {
					this.passarMouseEmCima(campoPesquisa);
					this.escrever(campoPesquisa, string);
				}catch(Exception i) {
					throw new Exception("não é a versao mobile");
				}
			}
		}
	}

	@Quando("teclo enter para confirmar a pesquisa")
	public void tecloEnterParaConfirmarAPesquisa() throws Exception {
		this.apertarEnter();
	}

	@Entao("confiro se o produto Blouse foi listado no site")
	public void confiroSeOProdutoBlouseFoiListadoNoSite() throws Exception {
		this.acharElemento(campoProdutoBlouse);
	}
	
	@Entao("confiro a mensagem {string}")
	public void confiroAMensagem(String string) throws Exception {
		Assert.assertEquals("ITEMNÃOEXISTENTE", this.obterTexto(idMensagemItem));	
	}

	@Quando("clico no menu shop")
	public void clicoNoMenuShop() throws Exception {
		Boolean elemento= this.elementoClicavel(campoMobile);
		if(elemento==true) {
			try {
				this.clicar(campoMobile);	
				this.clicar(campoShop);
				this.acessarEndereco("http://practice.automationtesting.in/shop/");
			}catch(Exception i) {
				throw new Exception("é a versao mobile");}
		}else{
			if(elemento==false) {
				try {
					this.clicar(campoShop);
				}catch(Exception i) {
					throw new Exception("não é a versao mobile");
				}
			}
		}
	}

	@Quando("passo o mouse por cima da categoria HTML no menu lateral esquerdo")
	public void passoOMousePorCimaDaCategoriaHTMLNoMenuLateralEsquerdo() throws Exception {
		this.passarMouseEmCima(campoHTML);
	}

	@Quando("clico na sub categoria HTML")
	public void clicoNaSubCategoriaHTML() throws Exception {
		this.clicar(campoHTML);
	}

	@Entao("confiro se o produto {string} esta presente")
	public void confiroSeOProdutoEstaPresente(String string) {
		this.acharElemento(campoProdutoThinkingInHTML);
	}

	@Quando("clico em My account")
	public void clicoEmMyAccount() throws Exception {
		Boolean elemento= this.elementoClicavel(campoMobile);
		if(elemento==true) {
			try {
				this.clicar(campoMobile);	
				this.clicar(campoMyAccount);
			}catch(Exception i) {
				throw new Exception("é a versao mobile");}
		}else{
			if(elemento==false) {
				try {
					this.clicar(campoMyAccount);
				}catch(Exception i) {
					throw new Exception("não é a versao mobile");
				}
			}
		}
	}

	@Quando("digito o Email address no box Register")
	public void digitoOEmailAddressNoBoxRegister() {
		this.escrever(campoRegisterEmail, this.geradorString()+"@gmail.com");
	}

	@Quando("digito o Password no box Register")
	public void digitoOPasswordNoBoxRegister() {
		this.escrever(campoRegisterPassword, this.geradorString());
	}

	@Quando("clico em Register")
	public void clicoEmRegister() throws Exception {
		this.clicar(campoRegister);
	}

	@Quando("clico em Account Details")
	public void clicoEmAccountDetails() throws Exception {
		this.clicar(campoAccountDetails);
	}

	@Quando("digito o primeiro nome {string}")
	public void digitoOPrimeiroNome(String string) {
		this.escrever(campoFirstName, string);
	}

	@Quando("digito o sobrenome {string}")
	public void digitoOSobrenome(String string) {
		this.escrever(campoLastName, string);
	}

	@Quando("clico em Save Changes")
	public void clicoEmSaveChanges() throws Exception {
		this.clicar(campoSaveChanges);
	}

	@Entao("verifico se o cadastro e alteração foram efetuados com sucesso")
	public void verificoSeOCadastroEAlteraçãoForamEfetuadosComSucesso() throws Exception {
		Assert.assertEquals("Account details changed successfully.", this.obterTexto(idMensagemCadastro));
	}
}