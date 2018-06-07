import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program podaje markę dla danego modelu.");
        System.out.println("Podaj dane pojazdów: ");
        Scanner scanner = new Scanner(System.in);

        Map mapa = new HashMap();

        while (true) {
            System.out.print("Podaj markę:  ");
            String marka = scanner.next();
            if (marka.equals("koniec")) break;
            System.out.print("Podaj model:  ");
            String model = scanner.next();
            if (model.equals("koniec")) break;

            mapa.put(model, marka);
        }

        System.out.println(mapa);
        System.out.println("Sprawdźmy jak działa.");

        while (true) {
            System.out.println("Podaj model: ");
            String klucz = scanner.next();
            if (klucz.equals("koniec")) break;

            System.out.println(mapa.get(klucz) + " " + klucz);
        }
    }
}
