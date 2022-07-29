package business.domain;

import lombok.AllArgsConstructor;
import java.io.Serializable;

@AllArgsConstructor
public class Resultado implements Serializable {
    private static final long serialVersionUID = 1L;

    private int posicao;
    private double menor;
}
