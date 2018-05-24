public class Ksiazka {

    private String autor;
    private String tytul;
    private String wydawca;
    private String rok;
    private String ISBN;
    private int liczbaStron;
    private boolean jestWypozyczona;

    Ksiazka(String autor,
            String tytul,
            String wydawca,
            String rok,
            String ISBN,
            int liczbaStron) {
        this.autor = autor;
        this.tytul = tytul;
        this.wydawca = wydawca;
        this.rok = rok;
        this.ISBN = ISBN;
        this.liczbaStron = liczbaStron;
        jestWypozyczona = false;
    }

    public void wyswietlKsiazke() {
        System.out.println(autor);
        System.out.println(tytul);
        System.out.println(wydawca);
        System.out.println(rok);
        System.out.println(ISBN);
        System.out.println(liczbaStron);
    }

    public boolean czyWypozyczona() {
        return jestWypozyczona;
    }

    public boolean czyMaszTakiTytul(String tytul) {
        if (this.tytul == tytul) {
            return true;
        } else {
            return false;
        }
    }

    public void wypozycz() {
        jestWypozyczona = true;
    }

    public void oddaj() {
        jestWypozyczona = false;
    }
}
