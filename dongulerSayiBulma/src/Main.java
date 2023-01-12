import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, adet=0, toplam=0, ortalama=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for(int i=1; i<=sayi; i++){
            if(i%3==0 && i%4==0){
                adet += 1;
                toplam += i;
            }
        }
        if(adet!=0){
            ortalama = toplam/adet;
            System.out.println("3'e ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        }
        else
            System.out.println("3'e ve 4'e tam bölünen sayı bulunamadı!");
    }
}