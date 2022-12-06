import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double birinciSayi, ikinciSayi;
        int secim;

        Scanner input = new Scanner(System.in);

        System.out.println("HESAP MAKİNESİ");

        System.out.print("İlk sayıyı giriniz: ");
        birinciSayi = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        ikinciSayi = input.nextDouble();

        System.out.println("İşlem seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        secim = input.nextInt();

        switch (secim){
            case 1:
                System.out.println("Toplama: "+(birinciSayi+ikinciSayi));
                break;
            case 2:
                System.out.println("Çıkarma: "+(birinciSayi-ikinciSayi));
                break;
            case 3:
                System.out.println("Çarpma: "+(birinciSayi*ikinciSayi));
                break;
            case 4:{
                if(ikinciSayi!=0)
                    System.out.println("Bölme: "+(birinciSayi/ikinciSayi));
                else
                    System.out.println("Bölünen sayı 0 olamaz!!!");
                break;
            }
            default:
                System.out.println("Yanlış seçim yaptınız. Lütfen tekrar deneyin...");
                break;
        }
    }
}