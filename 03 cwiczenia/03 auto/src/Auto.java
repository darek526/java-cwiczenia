import static java.lang.System.out;

public class Auto {
    String nazwa;
    String typ;
    double pojSilnik;
    double pojBaku;
    int rokProdukcji;

    Auto(String nazwa, String typ, double pojSilnik,
         double pojBaku, int rokProdukcji) {
        this.nazwa = nazwa;
        this.typ = typ;
        this.pojSilnik = pojSilnik;
        this.pojBaku = pojBaku;
        this.rokProdukcji = rokProdukcji;
        liczbaSamochodowWlasciciela++;
    }

    boolean jestWlaczony;

    boolean wlaczSilnik() {
        if (jestWlaczony == false) {
            jestWlaczony = true;
            predkosc = 0;
        } else {
            out.println("Silnik juz jest wlaczony!");
        }
        return jestWlaczony;
    }


    boolean czyWlaczony() {
        return jestWlaczony;
    }

    int ktoryWlasciciel = 1;

    int sprzedaj() {
        return ++ktoryWlasciciel;
    }

    double stanPaliwa = 0.0;

    double tankuj(double dolewka) {
        if (dolewka > 0.0
                && pojBaku - stanPaliwa >= dolewka) {
            //stanPaliwa = stanPaliwa + dolewka;
            stanPaliwa += dolewka;
        } else {
            out.println(
                    "Nie odpowiednia ilosc dolewki"
            );
        }
        return stanPaliwa;
    }

    int predkosc;

    int zwiekszPredkoscO_10() {
        predkosc += 10;
        return predkosc;
    }

    int zmniejszPredkoscO_10() {
        if (predkosc >= 10) {
            predkosc -= 10;
        } else {
            out.println("Zbyt mała prędkość");
        }
        return predkosc;
    }

    void wyswietlInfo() {
        out.println("Nazwa: " + nazwa);
        out.println("Typ pojazdu: " + typ);
        out.println("Pojemnosc silnika: " + pojSilnik);
        out.println("Pojemnosc baku: " + pojBaku);
        out.println("Rok produkcji: " + rokProdukcji);
        out.println("Stan paliwa: " + stanPaliwa);
        out.println("Wlasciciel nr: " + ktoryWlasciciel);
        out.println("Predkosc: " + predkosc);
        out.println("Włączony: " + czyWlaczony());
        out.println("Liczba samochodow wlasciciela: " + liczbaSamochodowWlasciciela);
    }

    static int liczbaSamochodowWlasciciela = 0;

    public static void main(String[] arguments) {
        Auto auto = new Auto("Syrena Bosto", "Van", 1.0, 20.0, 1970);

        auto.sprzedaj();

        auto.tankuj(10.0);
        auto.tankuj(10.0);
        auto.tankuj(10.0);
        auto.wlaczSilnik();
        auto.wlaczSilnik();
        auto.zwiekszPredkoscO_10();
        auto.zwiekszPredkoscO_10();

        auto.wyswietlInfo();

        Auto auto2 = new Auto("Syrena Bosto", "Van", 1.0, 20.0, 1972);
        Auto auto3 = new Auto("Syrena Bosto", "Van", 1.0, 20.0, 1971);
        Auto auto4 = new Auto("Syrena Bosto", "Van", 1.0, 20.0, 1976);

        auto4.wyswietlInfo();
    }

}
