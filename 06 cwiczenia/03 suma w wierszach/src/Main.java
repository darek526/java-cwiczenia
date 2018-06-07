import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Program wczytuje plik" +
                " oraz zlicza wiersze");

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("plik.csv"));

            String linia;
            while (true) {
                linia = bufferedReader.readLine();
                if (linia == null) break;

                double suma = Arrays.stream(linia.split(","))
                        .map((s) -> s.trim())
                        .mapToDouble((s) -> Double.parseDouble(s))
                        .sum();
                System.out.println(
                        "Suma elementow w wierszu wynosi: " + suma);
            }

        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }
}
