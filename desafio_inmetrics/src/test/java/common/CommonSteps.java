package common;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.WebElements;
import elements.IBy;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import static org.apache.commons.lang3.RandomStringUtils.*; 


public class CommonSteps {

	private String cpfGerado;
	private Map<String, IBy> webElements;

	public CommonSteps() {
		webElements = WebElements.GetWebElements();
	}

	public WebElement GetElement(String nomeCampo) {
		By condicao = webElements.get(nomeCampo).GetValue();
		WebElement campo = WaitElement(condicao);
		System.out.println(nomeCampo + "=" + campo.getText());

		return campo;
	}

	public WebElement WaitElement(By by) {
		WebDriverWait waiter = new WebDriverWait(Setup.getDriver(), 30);
		waiter.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		return Setup.getDriver().findElement(by);
	}

	@Dado("abrir pagina (.*)")
	public void abrirPagina(String baseUrl) {
		Setup.initDriver(baseUrl);
	}

	@Quando("preencho campo (.*) com valor (.*)")
	public void FillField(String field, String value) {
		GetElement(field).sendKeys(value);
	}
	
	@Quando("preencho campo (.*) de forma aleatoria")
	public void FillTextField(String field) {
		String aleatorio = randomAlphabetic(10);
		GetElement(field).sendKeys(aleatorio);
		System.out.println(aleatorio);
	}
	
	@Quando("preencho campo (.*) com CPF")
	public void FillTextFieldWithCPF(String field) {
		CPF cpf = new CPF();
		this.cpfGerado = cpf.geraCPFFinal();
		GetElement(field).sendKeys(cpfGerado);
		System.out.println(cpfGerado);
	}

	@Quando("preencho campo (.*) com o empregado cadastrado no cenario anterior")
	public void FillFieldWithEmployee(String field) {
		System.out.println(cpfGerado);
		GetElement(field).sendKeys(cpfGerado);
	}
	
	@Quando("clico em (.*)")
	public void Click(String target) throws InterruptedException {
		GetElement(target).click();
		Thread.sleep(1500);	
	}
	
	@Quando("espero (.*) milisegundos")
	public void wait(String time) throws InterruptedException {
		long num = Long.parseLong(time);
		Thread.sleep(num);
	}
	
	@Quando("seleciono o valor (.*) na dropdown (.*)")
	public void SelectDropDown(String value, String target){
		Select dropdown = new Select(GetElement(target));
		dropdown.selectByVisibleText(value);	
	}

	@Entao("devo encontrar o valor '(.*)' em (.*)")
	public void CheckFieldValue(String value, String field){
		field = GetElement(field).getText();
		Assert.assertTrue(field.contains(value));
	}
	
	@Quando("marco a opcao (.*)")
	public void deselect(String checkbox) {
		if(GetElement(checkbox).isSelected()) {
			GetElement(checkbox).isEnabled();
		}
		else
			GetElement(checkbox).click();
	}
	
	@Dado("limpo o campo (.*)$")
	public void ClearField(String field) {
		GetElement(field).clear();
	}
	
	@Entao("fechar pagina")
	public void fecharPagina() {
		Setup.closeDriver();
	}
}