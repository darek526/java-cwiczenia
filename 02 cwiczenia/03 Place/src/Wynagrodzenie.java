public class Wynagrodzenie {

    public static double licz_place(double stawka, double ile_godzin) {
        double maks_godz = 60;
        double normatyw = 40;
        double placa;
        if (stawka < 13.70) {
            System.out.println("Za mała stawka");
            return Double.NaN;
        }
        if (ile_godzin <= normatyw) {
            placa = stawka * ile_godzin;
            //System.out.println("Placa wynosi: " + placa);
        } else if (ile_godzin > normatyw && ile_godzin < 60) {
            placa = liczPonad40(stawka, ile_godzin);
            //System.out.println("Placa wynosi: " + placa);
        } else {
            placa = 40 * stawka + (1.5 * stawka * 20);
            //System.out.println("Przekroczyles liczbe godzin. Placa wynosi: " + placa);
        }
        return placa;
    }

    //metoda wyciągnięta z finkcji licz_place ((IntelliJ IDEA) Refactor -> Extract -> Method ...)
    private static double liczPonad40(double stawka, double ile_godzin) {
        double placa;
        placa = 40 * stawka + (1.5 * stawka * (ile_godzin - 40));
        return placa;
    }

    public static void main(String[] args) {

        System.out.println("Placa wynosi: " + licz_place(13.60, 62.0));
    }
}

