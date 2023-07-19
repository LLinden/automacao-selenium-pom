package paginas.login;

import fixtures.Dados;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public static void executarLogin(WebDriver driver, Dados dados) {
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id(LoginElements.INPUT_USERNAME.getId()));
        username.sendKeys(dados.getUser());

        WebElement senha = driver.findElement(By.id(LoginElements.INPUT_SENHA.getId()));
        senha.sendKeys(dados.getPass());

        WebElement botaoLogin = driver.findElement(By.id(LoginElements.BOTAO_LOGIN.getId()));
        botaoLogin.click();
    }
}
