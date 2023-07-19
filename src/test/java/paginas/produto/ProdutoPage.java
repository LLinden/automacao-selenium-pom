package paginas.produto;

import fixtures.Dados;
import org.openqa.selenium.*;


import static org.assertj.core.api.Assertions.assertThat;


public class ProdutoPage {

    public static void adicionaAoCarrinho(WebDriver driver) {
        WebElement adicionaCarrinho = driver.findElement(By.id(ProdutoElements.BOTAO_ADD_CART.getId()));
        adicionaCarrinho.click();
    }

    public static void irParaCarrinho(WebDriver driver, Dados dados) {
        WebElement linkCarrinho = driver.findElement(By.id(ProdutoElements.LINK_CARRINHO.getId()));
        linkCarrinho.click();

        assertThat(driver.getCurrentUrl()).isEqualTo(dados.getCarrinho());
    }
}
