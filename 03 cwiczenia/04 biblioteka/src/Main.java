import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String csvFile = "biblioteka.csv";
        String line = "";
        String cvsSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] linia = line.split(cvsSplitBy);

                System.out.println("autor: " + linia[0]
                        + "tytul: " + linia[1]
                        + "wydawca: " + linia[2]
                        + "rok: " + linia[3]
                        + "ISBN: " + linia[4]
                        + "liczba stron: " + linia[5]
                );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
