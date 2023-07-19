package paginas.checkout;

import fixtures.Dados;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    public static void checkout(WebDriver driver, Dados dados) {
        WebElement nome = driver.findElement(By.id(CheckoutElements.INPUT_NOME.getId()));
        nome.sendKeys(dados.getNome());

        WebElement sobrenome = driver.findElement(By.id(CheckoutElements.INPUT_SOBRENOME.getId()));
        sobrenome.sendKeys(dados.getSobrenome());
    }
}
