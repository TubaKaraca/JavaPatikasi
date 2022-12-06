import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tutar;
        System.out.print("Ücreti giriniz: ");
        tutar = input.nextDouble();

        while(tutar<=0){
            System.out.print("Geçerli bir değer giriniz(Değer 0'dan büyük olmalı): ");
            tutar = input.nextDouble();
        }

        int kdv = tutar<=1000 ? 18 : 8;

        double kdvTutari = (tutar*kdv)/100;
        double kdvliFiyat = tutar+kdvTutari;

        System.out.println("Kdv'siz Fiyat: " + tutar);
        System.out.println("Kdv Oranı: %" + kdv);
        System.out.println("Kdv'li Fiyat: " + kdvliFiyat);
        System.out.println("Kdv Tutarı: " + kdvTutari);
    }
}