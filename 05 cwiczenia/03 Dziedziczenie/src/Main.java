import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        test1();
//        test2();
        polimorfizm();
    }

    private static void polimorfizm() {
        Zwierze[] zwierzeta = new Zwierze[3];

        zwierzeta[0] = new Jamnik();
        zwierzeta[1] = new Jesiotr();
        zwierzeta[2] = new Szpak();

        for (Zwierze zwierze : zwierzeta) {
            System.out.println(zwierze);
            zwierze.poruszajSie();
        }
    }

    private static void test2() {
        Jamnik[] jamniks = new Jamnik[3];
        Arrays.fill(jamniks, new Jamnik());

//        for (int indeks = 0; indeks < 3; indeks++) {
//            System.out.println(jamniks[indeks]);
//            jamniks[indeks].poruszajSie();
//        }

        //to samo z użyciem innego zapisu pętli
        for (Jamnik jamnik : jamniks) {
            System.out.println(jamnik);
            jamnik.poruszajSie();
        }
    }

    private static void test1() {
        Jesiotr jesiotr = new Jesiotr();

        jesiotr.poruszajSie();
        System.out.println(jesiotr);
    }
}
