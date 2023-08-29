import java.util.Arrays;

public class Main {

    static boolean varMi(int[] dizi, int deger) {
        for (int i : dizi) {
            if (i == deger) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        int[] liste = {2, 2, 4, 5, 6, 5, 99, 11, 11, 9, 2, 4, 6};
        int[] tekrarlar = new int[liste.length];
        int indeks = 0;

        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < liste.length; j++) {
                if ((i != j) && (liste[i] == liste[j])) {
                    if (liste[i] % 2 == 0) {
                        if (!varMi(tekrarlar, liste[i])) {
                            tekrarlar[indeks++] = liste[i];
                        }
                        break;
                    }
                }
            }
        }
        for (int deger : tekrarlar) {
            if (deger != 0) {
                System.out.println(deger);
            }
        }
    }
}
