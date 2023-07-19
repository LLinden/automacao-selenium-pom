package paginas.produto;

import org.openqa.selenium.*;

import static sun.jvm.hotspot.runtime.Thread.*;

public class ProdutoPage {

    public static void adicionaAoCarrinho(WebDriver driver) {
        WebElement adicionaCarrinho = driver.findElement(By.xpath(ProdutoElements.BOTAO_ADD_CART.getId()));
        adicionaCarrinho.click();
        driver.findElement(By.linkText("OK")).click();
    }

    public static void irParaCarrinho(WebDriver driver) {
        WebElement linkCarrinho = driver.findElement(By.id(ProdutoElements.LINK_CARRINHO.getId()));
        linkCarrinho.click();
    }
}
