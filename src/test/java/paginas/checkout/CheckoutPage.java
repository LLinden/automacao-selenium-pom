package paginas.checkout;

import fixtures.Dados;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import paginas.checkoutComplete.CheckoutCompletePage;
import paginas.checkoutOverview.CheckoutOverviewPage;
import paginas.produto.ProdutoPage;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutPage {
    private final WebDriver driver;
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Preenche nome")
    public CheckoutPage preencheNome(String nome) {
        WebElement inputNome = driver.findElement(By.id(CheckoutElements.INPUT_NOME.getId()));
        inputNome.sendKeys(nome);

        return this;
    };
    @Step("Preenche sobrenome")
    public CheckoutPage preencheSobrenome(String sobrenome) {
        WebElement inputSobrenome = driver.findElement(By.id(CheckoutElements.INPUT_SOBRENOME.getId()));
        inputSobrenome.sendKeys(sobrenome);

        return this;
    };
    @Step("Preenche cep")
    public CheckoutPage preencheCep(String cep) {
        WebElement inputCep = driver.findElement(By.id(CheckoutElements.INPUT_CEP.getId()));
        inputCep.sendKeys(cep);

        return this;
    };
    @Step("Submete pedido")
    public CheckoutOverviewPage submetePedido() {
        WebElement continuar = driver.findElement(By.id(CheckoutElements.BOTAO_CONTINUAR.getId()));
        continuar.click();

        return new CheckoutOverviewPage(driver);
    };
    @Step("Preenche formulário de checkout")
    public CheckoutOverviewPage checkout(Dados dados) {
        preencheNome(dados.getNome());
        preencheSobrenome(dados.getSobrenome());
        preencheCep(dados.getCep());
        return submetePedido();
    }
}
