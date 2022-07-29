package util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManipuladorArquivo {

    private static final String ENTRADA = "leitura.txt";
    public static final Integer QTD_CELULAS = 4;

    public static List<Integer> getListaNumeros() {
        List<Integer> numeros = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(ENTRADA))) {
            while (true) {
                try {
                    numeros.add(Integer.valueOf(bufferedReader.readLine()));
                } catch (NumberFormatException e) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return numeros;
    }
}
