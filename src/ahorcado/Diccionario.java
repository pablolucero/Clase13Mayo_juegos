package ahorcado;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Diccionario {
    private String[] diccionario;
    private File diccFile;
    private static String fileName = "diccionario.txt";

    public Diccionario() {
        diccFile = new File(fileName);
    }

    public String getPalabra() {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)));
            String[] palabras = bufferedReader.readLine().split(";");

            Random random = new Random(palabras.length);
            return palabras[random.nextInt()];

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
