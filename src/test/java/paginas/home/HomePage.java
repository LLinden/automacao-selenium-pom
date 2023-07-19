package paginas.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public static void acessarPaginaInicial(WebDriver driver) {
        driver.get("https://www.demoblaze.com");
    }

    public static void selecionaProduto(WebDriver driver) {
        WebElement produto = driver.findElement(By.xpath(HomeElements.LINK_PRODUTO.getId()));
        produto.click();
    }
}
