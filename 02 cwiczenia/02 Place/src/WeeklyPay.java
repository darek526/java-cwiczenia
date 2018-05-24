import static java.lang.System.out;

public class WeeklyPay {
    private static double licz40(double stawka, double liczbaGodzin) {
        return stawka * liczbaGodzin;
    }

    private static double liczPonad40(double stawka, double liczbaGodzin) {
        return 40.0 * stawka + (liczbaGodzin - 40.0) * stawka * 1.5;
    }

    private static void liczPlaceDokladnie(double stawka, double liczbaGodzin) {
        if (liczbaGodzin > 60) {
            out.println("Przepracowany pracownik");
        } else if (liczbaGodzin <= 40) {
            out.println("Wypłać: " + licz40(stawka, liczbaGodzin));
        } else {
            out.println("Wypłać: " + liczPonad40(stawka, liczbaGodzin));
        }
    }

    public static void liczPlace(double stawka, double liczbaGodzin) {
        if (stawka > 13.70) {
            liczPlaceDokladnie(stawka, liczbaGodzin);
        } else {
            out.println("Za mała stawka godzinowa!");
        }
    }

    public static void main(String[] args) {
        double stawka = 14.0;
        double liczbaGodzin = 45;

        liczPlace(stawka, liczbaGodzin);
    }
}
