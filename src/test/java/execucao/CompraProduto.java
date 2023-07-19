package execucao;

import config.BaseAbstrataTeste;
import fixtures.Dados;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import paginas.carrinho.CarrinhoPage;
import paginas.checkout.CheckoutPage;
import paginas.login.LoginPage;
import paginas.produto.ProdutoPage;

public class CompraProduto extends BaseAbstrataTeste {

    @BeforeMethod
    void visitaPagina() {
        Dados dados = Dados.builder().build();
        LoginPage.executarLogin(getDriver(), dados);
    }

    @AfterMethod
    //void fechaNavegador() {getDriver().quit();}

    @Test
    @Description("Fluxo de compra de um produto com sucesso")
    @Step("Teste")
    void compraProduto() {
        Dados dados = Dados.builder().build();
        ProdutoPage.adicionaAoCarrinho(getDriver());
        ProdutoPage.irParaCarrinho(getDriver(), dados);
        CarrinhoPage.confirmaCarrinho(getDriver());
        CheckoutPage.checkout(getDriver(), dados);
        CheckoutPage.checkoutOverview(getDriver(), dados);
        CheckoutPage.checkoutComplete(getDriver(), dados);
    }
}


