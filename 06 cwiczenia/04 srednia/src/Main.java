import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Program wczytuje plik" +
                " oraz zlicza wiersze");

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("plik.csv"));

            String linia;
            List<Double> srednie = new ArrayList();

            while (true) {
                linia = bufferedReader.readLine();
                if (linia == null) break;

                Arrays.stream(linia.split(","))
                        .map((s) -> s.trim())
                        .mapToDouble((s) -> Double.parseDouble(s))
                        .average()
                        .ifPresent(x -> srednie.add(x));
            }

            srednie.stream()
                    .filter(srednia -> (srednia > 0.0))
                    .sorted()
                    .forEach(el -> System.out.println(el));

        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }
}
