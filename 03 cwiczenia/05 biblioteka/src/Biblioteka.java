public class Biblioteka {

    private Ksiazka[] spisKsiazek;

    public void wyswietlBiblioteke() {
        for (int i = 0; i < spisKsiazek.length; i++) {
            spisKsiazek[i].wyswietlKsiazke();
            System.out.println();
        }
    }

    public boolean czyIstnieje(String tytul) {
        for (int i = 0; i < spisKsiazek.length; i++) {
            if (spisKsiazek[i].sprawdzTytul(tytul)) {
                return true;
            }
        }
        return false;
    }

    public int czyIstniejeID(String tytul) {
        for (int i = 0; i < spisKsiazek.length; i++) {
            if (spisKsiazek[i].sprawdzTytul(tytul)) {
                return i;
            }
        }
        return -1;
    }

    public void wypozycz(String tytul) {
        int index = czyIstniejeID(tytul);
        if (index != -1) {
            if (spisKsiazek[index].czyWypozyczona()) {
                System.out.println("Książka jest wypożyczona.");
            } else {
                spisKsiazek[index].wypozycz();
                spisKsiazek[index].wyswietlKsiazke();
            }
        } else {
            System.out.println("Nie mamy takiej książki!");
        }
    }

}
