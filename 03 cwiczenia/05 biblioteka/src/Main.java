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

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] slowo = line.split(cvsSplitBy);

                System.out.println(
                        "Autor: " + slowo[0]
                                + " Tytul: " + slowo[1]
                                + " Wydawca: " + slowo[2]
                                + " Rok: " + slowo[3]
                                + " ISBN: " + slowo[4]
                                + " Liczba Stron: " + slowo[5]
                );

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

    }

}
