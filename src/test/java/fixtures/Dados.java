package fixtures;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Dados {
    // urls
    @Builder.Default
    private String home = "https://www.saucedemo.com/";
    @Builder.Default
    private String inventory = "https://www.saucedemo.com/inventory.html";
    @Builder.Default
    private String carrinho = "https://www.saucedemo.com/cart.html";
    @Builder.Default
    private String checkoutOverview = "https://www.saucedemo.com/checkout-step-two.html";
    @Builder.Default
    private String checkoutComplete = "https://www.saucedemo.com/checkout-complete.html";

    // login
    @Builder.Default
    private String user = "standard_user";
    @Builder.Default
    private String pass = "secret_sauce";

    // checkout
    @Builder.Default
    private String nome = "Fulano";
    @Builder.Default
    private String sobrenome = "De Tal";
    @Builder.Default
    private String cep = "95600-000";
}
