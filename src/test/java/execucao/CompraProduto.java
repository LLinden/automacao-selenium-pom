package execucao;

import config.BaseAbstrataTeste;
import fixtures.Dados;
import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import paginas.carrinho.CarrinhoPage;
import paginas.checkout.CheckoutPage;
import paginas.checkoutComplete.CheckoutCompletePage;
import paginas.checkoutOverview.CheckoutOverviewPage;
import paginas.login.LoginPage;
import paginas.produto.ProdutoPage;
import static org.assertj.core.api.Assertions.assertThat;

public class CompraProduto extends BaseAbstrataTeste {
    Dados dados = Dados.builder().build();
    @BeforeMethod
    void visitaPagina() {
        LoginPage.executarLogin(getDriver(), dados);
    }

    @AfterMethod
    void fechaNavegador() {getDriver().quit();}

    @Test
    @Description("Fluxo de compra de um produto com sucesso")
    void compraProduto() {
        ProdutoPage produtoPage = new ProdutoPage(getDriver());
        produtoPage.adicionaAoCarrinho();
        CarrinhoPage carrinhoPage = produtoPage.irParaCarrinho(dados);
        CheckoutPage checkoutPage = carrinhoPage.confirmaCarrinho();
        CheckoutOverviewPage checkoutOverviewPage = checkoutPage.checkout(dados);
        CheckoutCompletePage checkoutCompletePage = checkoutOverviewPage.checkoutOverview(dados);
        String textoConclusaoVenda = checkoutCompletePage.getTextoConclusao();
        assertThat(textoConclusaoVenda).contains("Your order has been dispatched");
        checkoutCompletePage.checkoutComplete();
    }
}


