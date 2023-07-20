package paginas.login;

import fixtures.Constantes;
import fixtures.Dados;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.assertj.core.api.Assertions.*;


public class LoginPage {
    @Step("Acessa página e realiza login")
    public static void executarLogin(WebDriver driver, Dados dados) {
        driver.get(Constantes.HOME.getId());

        WebElement username = driver.findElement(By.id(LoginElements.INPUT_USERNAME.getId()));
        username.sendKeys(dados.getUser());

        WebElement senha = driver.findElement(By.id(LoginElements.INPUT_SENHA.getId()));
        senha.sendKeys(dados.getPass());

        WebElement botaoLogin = driver.findElement(By.id(LoginElements.BOTAO_LOGIN.getId()));
        botaoLogin.click();
    }
}
