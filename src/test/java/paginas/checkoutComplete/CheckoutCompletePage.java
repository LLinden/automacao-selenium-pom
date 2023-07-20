package paginas.checkoutComplete;

import fixtures.Constantes;
import fixtures.Dados;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import paginas.produto.ProdutoPage;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutCompletePage {
    private final WebDriver driver;
    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
        assertThat(driver.getCurrentUrl()).isEqualTo(Constantes.CHECKOUT_COMPLETE.getId());
    }

    @Step("Concluí checkout")
    public ProdutoPage checkoutComplete(Dados dados) {
        String textoConclusao = driver.findElement(By.className(CheckoutCompleteElements.TEXTO_CONCLUSAO.getId())).getText();
        //assertThat(textoConclusao).contains("Your order has been dispatched");

        WebElement botaoHome = driver.findElement(By.id(CheckoutCompleteElements.BOTAO_HOME.getId()));
        botaoHome.click();

        return new ProdutoPage(driver);
    }
}
