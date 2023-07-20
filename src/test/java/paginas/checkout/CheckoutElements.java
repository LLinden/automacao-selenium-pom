package paginas.checkout;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CheckoutElements {
    INPUT_NOME("first-name"),
    INPUT_SOBRENOME("last-name"),
    INPUT_CEP("postal-code"),
    BOTAO_CONTINUAR("continue");

    public final String id;
}
