import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String sciezka = "plik.txt";
        int liczba = 10000;
        DataOutputStream outputStream = null;

        try {
            outputStream = new DataOutputStream(new FileOutputStream(sciezka));
            outputStream.writeInt(liczba);
        } finally {
            if (outputStream != null) {
                outputStream.close();
                System.out.println("Plik binarny zamknięty");
            }
        }
    }
}