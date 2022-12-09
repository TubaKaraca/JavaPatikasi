import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kullaniciAdi, sifre, dogruKullaniciAdi = "patika", dogruSifre = "java123", cevap, yeniSifre;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdi = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        sifre = input.nextLine();

        if (kullaniciAdi.equals(dogruKullaniciAdi) && sifre.equals(dogruSifre)){
            System.out.println("Başarıyla giriş yaptınız.");
        } else if (!sifre.equals(dogruSifre)){
            System.out.println("Şifreniz yanlış.");
            System.out.print("Şifreyi sıfırlamak istiyorsanız 'evet', istemiyorsanız 'hayır' yazabilirsiniz: ");
            cevap = input.nextLine();
            if(cevap.equals("evet")){
                System.out.print("Yeni şifreyi giriniz: ");
                yeniSifre = input.nextLine();
                if(yeniSifre.equals(sifre) || yeniSifre.equals(dogruSifre)) {
                    System.out.print("Şifre oluşturulamadı. Lüften başka bir şifre giriniz.");
                } else
                    System.out.println("Yeni şifre oluşturuldu.");
            }

        } else
            System.out.println("Kullanıcı adınız yanlış. Giriş yapılamadı.");

    }
}