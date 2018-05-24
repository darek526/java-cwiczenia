public class Biblioteka {

    Ksiazka[] spisKsiazek;

    Biblioteka(int liczbaKsiazek) {
        spisKsiazek = new Ksiazka[liczbaKsiazek];
    }

    void dodajKsiazke(Ksiazka ksiazka, int index) {
        spisKsiazek[index] = ksiazka;
    }

    boolean czyIstnieje(String tytul) {
        for (int i = 0; i < spisKsiazek.length; i++) {
            if (spisKsiazek[i].czyMaszTakiTytul(tytul)) {
                return true;
            }
        }
        return false;
    }

    int czyIstniejeID(String tytul) {
        for (int i = 0; i < spisKsiazek.length; i++) {
            if (spisKsiazek[i].czyMaszTakiTytul(tytul)) {
                return i;
            }
        }
        return -1;
    }

    void wypozyczKsiazke(String tytul) {
        int index = czyIstniejeID(tytul);
        if (index != -1) {
            if (spisKsiazek[index].czyWypozyczona()) {
                System.out.println("Książka jest wypozyczona");
            } else {
                spisKsiazek[index].wyswietlKsiazke();
                spisKsiazek[index].wypozycz();
            }
        } else {
            System.out.println("Takiej ksiazki u nas nie ma");
        }
    }

    void oddajKsiazke(String tytul) {
        int index = czyIstniejeID(tytul);
        if (index != -1) {
            spisKsiazek[index].oddaj();
        } else {
            System.out.println("Takiej ksiazki u nas nie ma");
        }
    }

    void wyswietlKsiazki() {
        for (int i = 0; i < spisKsiazek.length; i++) {
            spisKsiazek[i].wyswietlKsiazke();
            System.out.println();
        }
    }

}
