package paginas.checkoutOverview;

import fixtures.Constantes;
import fixtures.Dados;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import paginas.checkoutComplete.CheckoutCompletePage;
import paginas.produto.ProdutoPage;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutOverviewPage {
    private final WebDriver driver;
    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
        assertThat(driver.getCurrentUrl()).isEqualTo(Constantes.CHECKOUT_OVERVIEW.getId());
    }

    @Step("Verifica dados do pedido para confirmação")
    public CheckoutCompletePage checkoutOverview(Dados dados) {
        WebElement finalizar = driver.findElement(By.id(CheckoutOverviewElements.BOTAO_FINALIZAR.getId()));
        finalizar.click();

        return new CheckoutCompletePage(driver);
    }
}
