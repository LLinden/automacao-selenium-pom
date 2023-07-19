package paginas.checkout;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CheckoutElements {
    INPUT_NOME("first-name"),
    INPUT_SOBRENOME("last-name"),
    INPUT_CEP("postal-code"),
    BOTAO_CONTINUAR("continue"),
    BOTAO_FINALIZAR("finish"),
    TEXTO_CONCLUSAO("complete-text"),
    BOTAO_HOME("back-to-products");

    public final String id;
}
