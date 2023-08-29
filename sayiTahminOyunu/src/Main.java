import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rastgele = new Random();
        int sayi = rastgele.nextInt(100);

        Scanner giris = new Scanner(System.in);
        int dogruSayac = 0;
        int secilenSayi;
        int[] yanlislar = new int[5];
        boolean kazandi = false;
        boolean hataliGiris = false;

        System.out.println(sayi);
        while (dogruSayac < 5) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            secilenSayi = giris.nextInt();

            if (secilenSayi < 0 || secilenSayi > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (hataliGiris) {
                    dogruSayac++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız: " + (5 - dogruSayac));
                } else {
                    hataliGiris = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (secilenSayi == sayi) {
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğiniz sayı: " + sayi);
                kazandi = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz!");
                if (secilenSayi > sayi) {
                    System.out.println(secilenSayi + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(secilenSayi + " sayısı, gizli sayıdan küçüktür.");
                }

                yanlislar[dogruSayac++] = secilenSayi;
                System.out.println("Kalan hakkınız: " + (5 - dogruSayac));
            }
        }

        if (!kazandi) {
            System.out.println("Kaybettiniz!");
            if (!hataliGiris) {
                System.out.println("Tahminleriniz: " + Arrays.toString(yanlislar));
            }
        }
    }
}