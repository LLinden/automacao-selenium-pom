package paginas.checkout;

import fixtures.Dados;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import paginas.produto.ProdutoPage;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutPage {
    private final WebDriver driver;
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    @Step("Preenche formulário de checkout")
    public void checkout(Dados dados) {
        WebElement nome = driver.findElement(By.id(CheckoutElements.INPUT_NOME.getId()));
        nome.sendKeys(dados.getNome());

        WebElement sobrenome = driver.findElement(By.id(CheckoutElements.INPUT_SOBRENOME.getId()));
        sobrenome.sendKeys(dados.getSobrenome());

        WebElement cep = driver.findElement(By.id(CheckoutElements.INPUT_CEP.getId()));
        cep.sendKeys(dados.getCep());

        WebElement continuar = driver.findElement(By.id(CheckoutElements.BOTAO_CONTINUAR.getId()));
        continuar.click();
    }

    @Step("Verifica dados do pedido para confirmação")
    public void checkoutOverview(Dados dados) {
        //assertThat(driver.getCurrentUrl()).isEqualTo(dados.getCheckoutOverview());

        WebElement finalizar = driver.findElement(By.id(CheckoutElements.BOTAO_FINALIZAR.getId()));
        finalizar.click();
    }

    @Step("Concluí checkout")
    public ProdutoPage checkoutComplete(Dados dados) {
       // assertThat(driver.getCurrentUrl()).isEqualTo(dados.getCheckoutComplete());

        String textoConclusao = driver.findElement(By.className(CheckoutElements.TEXTO_CONCLUSAO.getId())).getText();
        //assertThat(textoConclusao).contains("Your order has been dispatched");

        WebElement botaoHome = driver.findElement(By.id(CheckoutElements.BOTAO_HOME.getId()));
        botaoHome.click();

        return new ProdutoPage(driver);

        //assertThat(driver.getCurrentUrl()).isEqualTo(dados.getInventory());
    }
}
