public class Main {
    public static void main(String[] args) {
        int[] sayilar = {1, 2, 3, 4, 5};
        int n = sayilar.length;
        double harmonikToplam = 0;

        for (int i = 0; i < n; i++) {
            harmonikToplam += 1.0 / sayilar[i];
        }

        double harmonikOrtalama = n / harmonikToplam;
        System.out.println("Harmonik Ortalama: " + harmonikOrtalama);
    }
}