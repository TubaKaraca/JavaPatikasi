import jdk.dynalink.support.SimpleRelinkableCallSite;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yas, yolculuk;
        double mesafe, normalTutar, indirimliTutar, toplamTutar,  indirim=0, indirim1=0.50, indirim2=0.10, indirim3=0.30, indirim4=0.20, gidisDonusIndirimi;
        /*
        indirim1: Yaş değeri 12'den küçükse uygulanack indirim miktarı
        indirim2: Yaş değeri 12-24 aralığındaysa uygulanack indirim miktarı
        indirim3: Yaş değeri 65'ten büyükse uygulanacak indirim miktarı
        indirim4: Yolculuk tipi Gidiş-Dönüş seçildiyse uygulanacak indirim miktarı
        */
        Scanner input = new Scanner(System.in);

        System.out.println("****Uçak Bileti Hesaplama****");
        System.out.print("Gidilecek mesafeyi km türünden giriniz: ");
        mesafe = input.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz(1 => Tek Yön , 2 => Gidiş-Dönüş): ");
        yolculuk = input.nextInt();

        if(mesafe>0 && yas>0 && (yolculuk==1 || yolculuk==2)){
            normalTutar = mesafe * 0.10;
            
            if(yas<12)
                indirim = normalTutar * indirim1;
            else if(yas<=24)
                indirim = normalTutar * indirim2;
            else if(yas>65)
                indirim = normalTutar * indirim3;

            indirimliTutar = normalTutar - indirim;

            if(yolculuk==2){
                gidisDonusIndirimi = indirimliTutar * indirim4;
                toplamTutar = (indirimliTutar-gidisDonusIndirimi)*2;
            }
            else{
                toplamTutar = indirimliTutar;
            }
            System.out.println("Toplam tutar: " + toplamTutar + "TL");
        }
        else System.out.println("Hatalı veri girişi yaptınız. Lütfen tekrar deneyin.");
    }
}