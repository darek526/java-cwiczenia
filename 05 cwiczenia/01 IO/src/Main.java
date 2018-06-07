import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program liczy srednia " +
                "i mediane z wartosci " +
                "podanych przez uzytkownika.");
        System.out.print("Podaj rozmiar tablicy: ");

        Scanner scanner = new Scanner(System.in);
        int rozmiar = -1;
        try {
            rozmiar = scanner.nextInt();
            // to do wyjatek kiedy rozmiar <= 0
        } catch (InputMismatchException e) {
            System.out.println("Wprowadziles wartosc rozna od calkowitej");
        }

        System.out.println("Wczytana wartosc: " + rozmiar);

        double[] tablica = new double[rozmiar];

        System.out.println("Podaj dane do tablicy: ");
        //Wczytywanie do tablicy
        for (int indeks = 0; indeks < rozmiar; indeks++) {
            tablica[indeks] = scanner.nextDouble(); //to do wyjatki
        }
        //Wyswietlenie z tablicy
        for (int indeks = 0; indeks < rozmiar; indeks++) {
            System.out.print(tablica[indeks] + " ");
        }
        System.out.println();

        double suma = 0.0;
        for (int indeks = 0; indeks < rozmiar; indeks++) {
            suma += tablica[indeks];
        }
        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + suma / rozmiar);

        Arrays.sort(tablica);
        System.out.println("Posortowana tablica:");
        //Wyswietlenie z tablicy
        for (int indeks = 0; indeks < rozmiar; indeks++) {
            System.out.print(tablica[indeks] + " ");
        }
        System.out.println();

        boolean parzysta;
        if (rozmiar % 2 == 0) {
            parzysta = true;
        } else {
            parzysta = false;
        }

        System.out.println("Parzysta: " + parzysta);

        if (parzysta) {
            double lewa = tablica[rozmiar / 2 - 1];
            double prawa = tablica[rozmiar / 2];
            System.out.println("Mediana: " + (lewa + prawa) / 2.0);
        } else { //nieparzysta
            int srodek = (rozmiar + 1) / 2;
            System.out.println("Mediana: " + tablica[srodek - 1]);
        }
    }

    //to do zapisać do pliku medianę i średnią
}
