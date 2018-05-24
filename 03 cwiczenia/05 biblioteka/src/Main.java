import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String csvFile = "src/biblioteka.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";

        Biblioteka biblioteka = new Biblioteka(2);

        try {

            br = new BufferedReader(new FileReader(csvFile));

            boolean pominPierwszaLinie = true;
            int index = 0;
            while ((line = br.readLine()) != null) {
                if (pominPierwszaLinie) {
                    pominPierwszaLinie = false;
                    continue;
                }

                String[] slowo = line.split(cvsSplitBy);

                Ksiazka ksiazka = new Ksiazka(
                        slowo[0].trim(),
                        slowo[1].trim(),
                        slowo[2].trim(),
                        slowo[4].trim(),
                        Integer.parseInt(slowo[3].trim()),
                        Integer.parseInt(slowo[5].trim())
                );

                biblioteka.dodajKsiazke(ksiazka, index);
                index++;

//                System.out.println(
//                        "Autor: " + slowo[0]
//                                + " Tytul: " + slowo[1]
//                                + " Wydawca: " + slowo[2]
//                                + " Rok: " + slowo[3]
//                                + " ISBN: " + slowo[4]
//                                + " Liczba Stron: " + slowo[5]
//                );

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        biblioteka.wyswietlBiblioteke();

    }

}
