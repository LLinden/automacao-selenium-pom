package paginas.produto;

import fixtures.Dados;
import io.qameta.allure.Step;
import org.openqa.selenium.*;


import static org.assertj.core.api.Assertions.assertThat;


public class ProdutoPage {

    @Step("Adiciona produto ao carrinho")
    public static void adicionaAoCarrinho(WebDriver driver) {
        WebElement adicionaCarrinho = driver.findElement(By.id(ProdutoElements.BOTAO_ADD_CART.getId()));
        adicionaCarrinho.click();
    }

    @Step("Vai até a página do carrinho")
    public static void irParaCarrinho(WebDriver driver, Dados dados) {
        WebElement linkCarrinho = driver.findElement(By.id(ProdutoElements.LINK_CARRINHO.getId()));
        linkCarrinho.click();

        assertThat(driver.getCurrentUrl()).isEqualTo(dados.getCarrinho());
    }
}
