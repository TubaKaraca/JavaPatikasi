import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int basamakDegeri;
        int toplam=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int sayi = input.nextInt();

        while(sayi != 0){
            basamakDegeri = sayi % 10;
            toplam += basamakDegeri;
            sayi /= 10;
        }
        System.out.println("Basamak değerleri toplamı: "+toplam);
    }
}