package execucao;

import config.BaseAbstrataTeste;
import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import paginas.home.HomePage;

public class CompraProduto extends BaseAbstrataTeste {

    @BeforeMethod
    void visitaPagina() {
        HomePage.acessarPaginaInicial(getDriver());
    }

    @AfterMethod
    //void fechaNavegador() {getDriver().quit();}

    @Test
    @Description("Fluxo de compra de um produto com sucesso")
    void compraProduto() {
        HomePage.selecionaProduto(getDriver());
    }
}


