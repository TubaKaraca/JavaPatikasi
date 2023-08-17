import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        boolean palindromMu = palindromKontrolEt(sayi);

        if (palindromMu) {
            System.out.println(sayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }
    }
    static boolean palindromKontrolEt(int numara) {
        int orijinalSayi = numara;
        int tersCevrilmisSayi = 0;

        while (numara > 0) {
            int sonBasamak = numara % 10;
            tersCevrilmisSayi = tersCevrilmisSayi * 10 + sonBasamak;
            numara /= 10;
        }
        return orijinalSayi == tersCevrilmisSayi;
    }
}
