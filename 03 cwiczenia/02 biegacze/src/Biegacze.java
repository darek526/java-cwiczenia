import static java.lang.System.*;

public class Biegacze {
    public static void getMinIndexes(int[] values) {
        int minValue = Integer.MAX_VALUE;
        int minValue2 = Integer.MAX_VALUE;
        int minIndex = -1;
        int minIndex2 = -1;
        for (int i = 0; i < values.length; i++) {
            out.println("i: " + i + ", wartość z tablicy: " + values[i]);
            if (values[i] < minValue) {
                out.println("Jestem w if.");
                // skopiuj stare wartości do minValue2, minIndex2
                minValue2 = minValue;
                minIndex2 = minIndex;

                // zaktualizuj
                minValue = values[i];
                minIndex = i;
                out.print("minv2: " + minValue2 + " minI2: " + minIndex2);
                out.println(", minv: " + minValue + " minI: " + minIndex);
            } else {
                if (values[i] < minValue2) {
                    minValue2 = values[i];
                    minIndex2 = i;
                }
                out.println("jestem w else");
            }
        }
        out.println("Indeks pierwszego biegacza: " + minIndex);
        out.println("Indeks drugiego biegacza: " + minIndex2);
    }

    public static void main(String[] args) {
        int[] czasy = {2, 5, 3, 8, 5, 5, 2, 2};

        getMinIndexes(czasy);
    }
}
