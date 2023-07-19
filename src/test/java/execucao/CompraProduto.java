package execucao;

import config.BaseAbstrataTeste;
import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import paginas.carrinho.CarrinhoPage;
import paginas.login.LoginPage;
import paginas.produto.ProdutoPage;

public class CompraProduto extends BaseAbstrataTeste {

    @BeforeMethod
    void visitaPagina() {
        LoginPage.executarLogin(getDriver());
    }

    @AfterMethod
    //void fechaNavegador() {getDriver().quit();}

    @Test
    @Description("Fluxo de compra de um produto com sucesso")
    void compraProduto() {
        ProdutoPage.adicionaAoCarrinho(getDriver());
        ProdutoPage.irParaCarrinho(getDriver());
        CarrinhoPage.confirmaCarrinho(getDriver());
    }
}


