class WeeklyPay {
    public static void pay(double basePay, int hours) {
        if (basePay < 13.70) {
            System.out.println("Powinienes placic przynajmn. 13.70 PLN/h");
        } else if (hours > 60) {
            System.out.println("Nie mozesz pracowac wiecej niz 60h/tydzien");
        } else {
            int overtimeHours = 0;
            if (hours > 40) {
                overtimeHours = hours - 40;
                hours = 40;
            }
            double pay = getPay(basePay, hours, overtimeHours);
            System.out.println("Wyplac: " + pay);
        }
    }

    //metoda wyciągnięta z funkcji pay ((IntelliJ IDEA) Refactor -> Extract -> Method ...)
    private static double getPay(double basePay, int hours, int overtimeHours) {
        double pay = basePay * hours;
        pay += overtimeHours * basePay * 1.5;
        return pay;
    }

    public static void main(String[] arguments) {
        pay(7.5, 35);
        pay(18.2, 37);
        pay(18.2, 47);
        pay(20.0, 73);
    }
}
