import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
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

        double suma = getSuma(rozmiar, tablica);
        System.out.println("Suma: " + suma);

        double srednia = suma / rozmiar;
        System.out.println("Średnia: " + srednia);

        Arrays.sort(tablica);
        System.out.println("Posortowana tablica:");
        //Wyswietlenie z tablicy
        for (int indeks = 0; indeks < rozmiar; indeks++) {
            System.out.print(tablica[indeks] + " ");
        }
        System.out.println();

        boolean parzysta;
        parzysta = rozmiar % 2 == 0;

        System.out.println("Parzysta: " + parzysta);

        double mediana = getMediana(rozmiar, tablica, parzysta);

        zapiszDoPliku(srednia, mediana);

    }

    private static double getSuma(int rozmiar, double[] tablica) {
        double suma = 0.0;
        for (int indeks = 0; indeks < rozmiar; indeks++) {
            suma += tablica[indeks];
        }
        return suma;
    }

    private static double getMediana(int rozmiar, double[] tablica, boolean parzysta) {
        double mediana;
        if (parzysta) {
            double lewa = tablica[rozmiar / 2 - 1];
            double prawa = tablica[rozmiar / 2];
            mediana = (lewa + prawa) / 2.0;
        } else { //nieparzysta
            int srodek = (rozmiar + 1) / 2;
            mediana = tablica[srodek - 1];
        }
        System.out.println("Mediana: " + mediana);
        return mediana;
    }

    private static void zapiszDoPliku(double srednia, double mediana) throws IOException {
        //zapisuje do pliku medianę i średnią
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("wynik.txt");

            fileWriter.write("Mediana: " + mediana);
            fileWriter.write("Średnia: " + srednia);

        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
    
}
