package paginas.produto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ProdutoElements {
    BOTAO_ADD_CART("/html/body/div[5]/div/div[2]/div[2]/div/a"),
    LINK_CARRINHO("cartur");

    public final String id;
}
