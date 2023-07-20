package fixtures;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Constantes {
    // urls
    HOME("https://www.saucedemo.com/"),
    INVENTORY("https://www.saucedemo.com/inventory.html"),
    CARRINHO("https://www.saucedemo.com/cart.html"),
    CHECKOUT_OVERVIEW("https://www.saucedemo.com/checkout-step-two.html"),
    CHECKOUT_COMPLETE("https://www.saucedemo.com/checkout-complete.html");

    private final String id;
}
