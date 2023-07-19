package paginas.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static  String user = "standard_user";
    private static String pass = "secret_sauce";
    public static void executarLogin(WebDriver driver) {
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id(LoginElements.INPUT_USERNAME.getId()));
        username.sendKeys(user);

        WebElement senha = driver.findElement(By.id(LoginElements.INPUT_SENHA.getId()));
        senha.sendKeys(pass);

        WebElement botaoLogin = driver.findElement(By.id(LoginElements.BOTAO_LOGIN.getId()));
        botaoLogin.click();
    }
}
