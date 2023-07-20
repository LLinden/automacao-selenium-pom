package paginas.carrinho;

import fixtures.Constantes;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import paginas.checkout.CheckoutPage;
import static org.assertj.core.api.Assertions.assertThat;

public class CarrinhoPage {
    private final WebDriver driver;
    public CarrinhoPage(WebDriver driver) {
        this.driver = driver;
        assertThat(driver.getCurrentUrl()).isEqualTo(Constantes.CARRINHO.getId());
    }
    @Step("Confirma itens do carrinho e vai para checkout")
    public CheckoutPage confirmaCarrinho() {
        WebElement checkout = driver.findElement(By.id(CarrinhoElements.BOTAO_CHECKOUT.getId()));
        checkout.click();

        return new CheckoutPage(driver);
    }
}
