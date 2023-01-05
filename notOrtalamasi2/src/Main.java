import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik=0, fizik=0, kimya=0, turkce=0, muzik=0, toplam=0, dersSayisi=0, ortalama=0;

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik dersinden alınan not:");
        matematik=input.nextInt();
        System.out.print("Fizik dersinden alınan not:");
        fizik=input.nextInt();
        System.out.print("Kimya dersinden alınan not:");
        kimya= input.nextInt();;
        System.out.print("Türkçe dersinden alınan not:");
        turkce=input.nextInt();
        System.out.print("Müzik dersinden alınan not:");
        muzik= input.nextInt();

        if(matematik>=0 && matematik<=100){
            toplam += matematik;
            dersSayisi += 1;
        }
        if(fizik>=0 && fizik<=100){
            toplam += fizik;
            dersSayisi += 1;
        }
        if(kimya>=0 && kimya<=100){
            toplam += kimya;
            dersSayisi += 1;
        }
        if(turkce>=0 && turkce<=100){
            toplam += turkce;
            dersSayisi += 1;
        }
        if(muzik>=0 && muzik<=100){
            toplam += muzik;
            dersSayisi += 1;
        }
        if(dersSayisi!=0){
            ortalama=toplam/dersSayisi;
            System.out.println("Ortalamanız: " + ortalama);

            if(ortalama>55)
                System.out.print("Sınıfı geçtiniz...");
            else
                System.out.print("Sınıfta kaldınız...");
        }
        else
            System.out.print("Girilen notlar 0 ile 100 arasında olmadığı için ortalama hesaplanamadı...");


    }
}