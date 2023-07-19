package fixtures;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Dados {
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
