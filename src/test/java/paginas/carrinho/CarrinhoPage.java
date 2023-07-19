package paginas.carrinho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarrinhoPage {
    public static void confirmaCarrinho(WebDriver driver) {
        WebElement checkout = driver.findElement(By.id(CarrinhoElements.BOTAO_CHECKOUT.getId()));
        checkout.click();
    }
}
