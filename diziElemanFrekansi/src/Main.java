import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.println("Dizi : " + Arrays.toString(dizi));
        System.out.println("Tekrar Sayıları");

        for (int i = 0; i < dizi.length; i++) {
            int tekrarSayisi = 1;
            if (dizi[i] != -1) {
                for (int j = i + 1; j < dizi.length; j++) {
                    if (dizi[i] == dizi[j]) {
                        tekrarSayisi++;
                        dizi[j] = -1; // Tekrar ettiğini işaretlemek için -1 kullanıyoruz
                    }
                }
                System.out.println(dizi[i] + " sayısı " + tekrarSayisi + " kere tekrar edildi.");
            }
        }
    }
}