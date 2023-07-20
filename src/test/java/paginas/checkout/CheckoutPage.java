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
    @Step("Preenche formulário de checkout")
    public CheckoutOverviewPage checkout(Dados dados) {
        WebElement nome = driver.findElement(By.id(CheckoutElements.INPUT_NOME.getId()));
        nome.sendKeys(dados.getNome());

        WebElement sobrenome = driver.findElement(By.id(CheckoutElements.INPUT_SOBRENOME.getId()));
        sobrenome.sendKeys(dados.getSobrenome());

        WebElement cep = driver.findElement(By.id(CheckoutElements.INPUT_CEP.getId()));
        cep.sendKeys(dados.getCep());

        WebElement continuar = driver.findElement(By.id(CheckoutElements.BOTAO_CONTINUAR.getId()));
        continuar.click();

        return new CheckoutOverviewPage(driver);
    }
}
