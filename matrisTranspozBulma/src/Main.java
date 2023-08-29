public class Main {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        int[][] transpozMatris = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris:");
        matrisiYazdir(matris);

        System.out.println("\nTranspoz Matris:");
        matrisiYazdir(transpozMatris);
    }

    public static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}