import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int girilenSayi = scanner.nextInt();

        int enBuyuk = dizi[0];
        int enKucuk = dizi[0];

        for (int eleman : dizi) {
            if (eleman > enBuyuk) {
                enBuyuk = eleman;
            }
            if (eleman < enKucuk) {
                enKucuk = eleman;
            }
        }

        int enYakinKucuk = enKucuk;
        int enYakinBuyuk = enBuyuk;

        for (int eleman : dizi) {
            if (eleman < girilenSayi && eleman > enYakinKucuk) {
                enYakinKucuk = eleman;
            }
            if (eleman > girilenSayi && eleman < enYakinBuyuk) {
                enYakinBuyuk = eleman;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enYakinKucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enYakinBuyuk);
    }
}