package paginas.produto;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static sun.jvm.hotspot.runtime.Thread.*;

public class ProdutoPage {

    public static void adicionaAoCarrinho(WebDriver driver) {
        WebElement adicionaCarrinho = driver.findElement(By.id(ProdutoElements.BOTAO_ADD_CART.getId()));
        adicionaCarrinho.click();
    }

    public static void irParaCarrinho(WebDriver driver) {
        WebElement linkCarrinho = driver.findElement(By.id(ProdutoElements.LINK_CARRINHO.getId()));
        linkCarrinho.click();
    }
}
