package paginas.home;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum HomeElements {
    LINK_PRODUTO("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a");

    public final String id;
}
