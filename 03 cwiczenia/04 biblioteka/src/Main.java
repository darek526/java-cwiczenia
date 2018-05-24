import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String csvFile = "src/biblioteka.csv";
        String line = "";
        String cvsSplitBy = ";";

        Biblioteka biblioteka = new Biblioteka(2);

        int nrLinii = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                if (nrLinii == 0) {
                    nrLinii++;
                    continue;
                }
                String[] linia = line.split(cvsSplitBy);

                Ksiazka ksiazka = new Ksiazka(linia[0].trim(), linia[1].trim(), linia[2].trim(),
                        linia[3].trim(), linia[4].trim(), Integer.parseInt(linia[5].trim()));

                biblioteka.dodajKsiazke(ksiazka, nrLinii - 1);

                nrLinii++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        biblioteka.wyswietlKsiazki();

    }
}
