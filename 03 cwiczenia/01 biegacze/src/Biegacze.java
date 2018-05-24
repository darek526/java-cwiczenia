public class Biegacze {
    public static int getMinIndex(int[] values) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < values.length; i++)
            if (values[i] < minValue) { // '<' ostra nierówność = pierewszy indeks najnmiejszego el
                                        // '<=' słaba nierówność = ostatni indeks najmniejszego el
                minValue = values[i];
                minIndex = i;
            }
        return minIndex;
    }

    public static int getSecondMinIndex(int[] values) {
        int secondIdx = -1;
        int minIdx = getMinIndex(values);
        for (int i = 0; i < values.length; i++) {
            if (i == minIdx)
                continue;
            if (secondIdx == -1 ||
                    values[i] < values[secondIdx])
                // '<' ostra nierówność = pierewszy indeks najnmiejszego el
                // '<=' słaba nierówność = ostatni indeks najmniejszego el
                secondIdx = i;
        }
        return secondIdx;
    }

    public static void main(String[] args) {
        int[] czasy = {3, 3, 1, 5, 2, 7, 3, 3, 3, 3};

        System.out.println("Indeks pierwszego biegacza: " + getMinIndex(czasy));
        System.out.println("Indeks drugiego biegacza: " + getSecondMinIndex(czasy));

    }
}
