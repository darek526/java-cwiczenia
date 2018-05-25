public class Main {

    public static void main(String[] args) {
        try {
            String liczba = "12.0";
            double sparsowanaLiczba
                    = Double.parseDouble(liczba);
            if (sparsowanaLiczba <= 0) {
                throw new ArithmeticException();
            }
            double logarytm = Math.log(
                    sparsowanaLiczba
            );
            System.out.println("log("
                    + liczba
                    + ") = "
                    + logarytm);
        } catch (NumberFormatException e) {
            System.out.println(
                    "Nieprawidłowy format " +
                            "zmiennej!"
            );
        } catch (ArithmeticException s) {
            System.out.println("Logarytm z liczby " +
                    "ujemnej nie istnieje!");
        } finally {
            System.out.println("Tutaj konczy " +
                    "sie nasz program.");
        }
    }
}
