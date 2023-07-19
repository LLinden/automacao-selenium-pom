package paginas.produto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ProdutoElements {
    BOTAO_ADD_CART("add-to-cart-sauce-labs-backpack"),
    LINK_CARRINHO("shopping_cart_container");

    public final String id;
}
