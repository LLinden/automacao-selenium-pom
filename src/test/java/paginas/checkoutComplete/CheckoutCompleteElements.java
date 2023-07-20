package paginas.checkoutComplete;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CheckoutCompleteElements {
    TEXTO_CONCLUSAO("complete-text"),
    BOTAO_HOME("back-to-products");

    public final String id;
}
