package business.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.io.Serializable;

@Getter
@AllArgsConstructor
public class Posicao implements Serializable {
    private static final long serialVersionUID = 1L;

    private int posicaoInicial;
    private int posicaoFinal;
}
