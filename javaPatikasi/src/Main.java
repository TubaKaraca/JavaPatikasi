import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik=0, fizik=0, kimya=0, turkce=0, tarih=0, muzik=0;

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik dersinden alınan not:");
        matematik=input.nextInt();
        System.out.print("Fizik dersinden alınan not:");
        fizik=input.nextInt();
        System.out.print("Kimya dersinden alınan not:");
        kimya= input.nextInt();;
        System.out.print("Türkçe dersinden alınan not:");
        turkce=input.nextInt();
        System.out.print("Tarih dersinden alınan not:");
        tarih= input.nextInt();;
        System.out.print("Müzik dersinden alınan not:");
        muzik= input.nextInt();

        int ortalama= (matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.print("Not ortalaması:");
        System.out.println(ortalama);

        String sonuc= ortalama>60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(sonuc);
    }
}