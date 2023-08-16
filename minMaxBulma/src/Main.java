import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 0;
        while (n <= 0) {
            System.out.print("Kaç adet sayı gireceksiniz?: ");
            n = input.nextInt();

            if (n <= 0) {
                System.out.println("Geçerli bir pozitif sayı giriniz.");
            }
        }

        System.out.print("1. sayıyı giriniz: ");
        int sayi = input.nextInt();
        int enBuyuk = sayi;
        int enKucuk = sayi;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = input.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
