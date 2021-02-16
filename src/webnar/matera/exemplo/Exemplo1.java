package webnar.matera.exemplo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Exemplo1 {
    // BUSCAR UMA PALAVRA EM UM ARQUIVO TEXTO (nomes.txt)

    public static void main(String[] args) throws Exception {
        metodoImperativo(); //verboso
        metodoComFor(); // precisa carregar o arquivo antes de poder executar, consome mais memoria que o necessario
        metodoFuncional(); //utlizando lambda e stream / pode ser feito de forma pararela
    }

    private static void metodoFuncional() throws IOException {
        String palavra = "SILVA";
        String arquivo = "nomes.txt";

        long contador = Files.lines(Paths.get(arquivo))
                .filter(linha -> linha.contains(palavra))
                .count();

        System.out.printf("A palavra %s ocorreu %d vezes.", palavra, contador);
    }

    private static void metodoComFor() throws Exception {
        String palavra = "SILVA";
        String arquivo = "nomes.txt";

        long contador = 0;
        List<String> linhas = Files.readAllLines(Paths.get(arquivo));
        for (String linha : linhas) {
            if (linha.contains(palavra))
                contador++;
        }
        System.out.printf("A palavra %s ocorreu %d vezes.", palavra, contador);
    }

    private static void metodoImperativo() throws Exception {
        String palavra = "SILVA";
        String arquivo = "nomes.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo))) {
            long contador = 0;
            String linha = null;

            while ((linha = bufferedReader.readLine()) != null) {
                if (linha.contains(palavra))
                    contador++;
            }

            System.out.printf("A palavra %s ocorreu %d vezes.", palavra, contador);
        }
    }
}
