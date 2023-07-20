package paginas.produto;

import fixtures.Constantes;
import fixtures.Dados;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import paginas.carrinho.CarrinhoPage;

import static org.assertj.core.api.Assertions.assertThat;


public class ProdutoPage {

    private final WebDriver driver;
    public ProdutoPage(WebDriver driver) {
        this.driver = driver;
        assertThat(driver.getCurrentUrl()).isEqualTo(Constantes.INVENTORY.getId());
    }

    @Step("Adiciona produto ao carrinho")
    public void adicionaAoCarrinho() {
        WebElement adicionaCarrinho = driver.findElement(By.id(ProdutoElements.BOTAO_ADD_CART.getId()));
        adicionaCarrinho.click();
    }

    @Step("Vai até a página do carrinho")
    public CarrinhoPage irParaCarrinho(Dados dados) {
        WebElement linkCarrinho = driver.findElement(By.id(ProdutoElements.LINK_CARRINHO.getId()));
        linkCarrinho.click();

        return new CarrinhoPage(driver);
    }
}
