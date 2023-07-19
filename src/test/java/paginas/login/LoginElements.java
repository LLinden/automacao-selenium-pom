package paginas.login;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum LoginElements {
    INPUT_USERNAME("user-name"),
    INPUT_SENHA("password"),
    BOTAO_LOGIN("login-button");

    public final String id;
}
