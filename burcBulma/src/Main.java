import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay,gun;
        String burc = "";
        boolean hata = false;
        /*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Kaçıncı ayda doğdunuz?: ");
        ay = input.nextInt();

        if(ay<1 || ay>12)
            System.out.println("Hatalı giriş yaptınız!");
        else {
            System.out.print("Ayın kaçıncı günü doğdunuz?: ");
            gun = input.nextInt();
            if (ay == 1) {
                if (gun >= 1 && gun <= 21)
                    burc = "Oğlak";
                else if (gun >= 22 && gun <= 31)
                    burc = "Kova";
                else
                    hata = true;
            }
            if (ay == 2) {
                if (gun >= 1 && gun <= 19)
                    burc = "Kova";
                else if (gun >= 20 && gun <= 29)
                    burc = "Balık";
                else
                    hata = true;
            }
            if (ay == 3) {
                if (gun >= 1 && gun <= 20)
                    burc = "Balık";
                else if (gun >= 21 && gun <= 31)
                    burc = "Koç";
                else
                    hata = true;
            }
            if (ay == 4) {
                if (gun >= 1 && gun <= 20)
                    burc = "Koç";
                else if (gun >= 21 && gun <= 30)
                    burc = "Boğa";
                else
                    hata = true;
            }
            if (ay == 5) {
                if (gun >= 1 && gun <= 21)
                    burc = "Boğa";
                else if (gun >= 22 && gun <= 31)
                    burc = "İkizler";
                else
                    hata = true;
            }
            if (ay == 6) {
                if (gun >= 1 && gun <= 22)
                    burc = "İkizler";
                else if (gun >= 23 && gun <= 30)
                    burc = "Yengeç";
                else
                    hata = true;
            }
            if (ay == 7) {
                if (gun >= 1 && gun <= 22)
                    burc = "Yengeç";
                else if (gun >= 23 && gun <= 31)
                    burc = "Aslan";
                else
                    hata = true;
            }
            if (ay == 8) {
                if (gun >= 1 && gun <= 22)
                    burc = "Aslan";
                else if (gun >= 23 && gun <= 31)
                    burc = "Başak";
                else
                    hata = true;
            }
            if (ay == 9) {
                if (gun >= 1 && gun <= 22)
                    burc = "Başak";
                else if (gun >= 23 && gun <= 30)
                    burc = "Terazi";
                else
                    hata = true;
            }
            if (ay == 10) {
                if (gun >= 1 && gun <= 22)
                    burc = "Terazi";
                else if (gun >= 23 && gun <= 31)
                    burc = "Akrep";
                else
                    hata = true;
            }
            if (ay == 11) {
                if (gun >= 1 && gun <= 21)
                    burc = "Akrep";
                else if (gun >= 22 && gun <= 30)
                    burc = "Yay";
                else
                    hata = true;
            }
            if (ay == 12) {
                if (gun >= 1 && gun <= 21)
                    burc = "Yay";
                else if (gun >= 22 && gun <= 31)
                    burc = "Oğlak";
                else
                    hata = true;
            }
            if(hata)
                System.out.println("Hatalı giriş yaptınız!");
            else
                System.out.println("Burcunuz: "+burc);
        }

    }
}